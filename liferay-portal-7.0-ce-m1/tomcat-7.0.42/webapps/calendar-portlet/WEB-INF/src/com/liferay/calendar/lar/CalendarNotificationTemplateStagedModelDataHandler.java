/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.lar;

import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.model.CalendarNotificationTemplate;
import com.liferay.calendar.notification.NotificationTemplateType;
import com.liferay.calendar.notification.NotificationType;
import com.liferay.calendar.service.CalendarLocalServiceUtil;
import com.liferay.calendar.service.CalendarNotificationTemplateLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.lar.BaseStagedModelDataHandler;
import com.liferay.portal.kernel.lar.ExportImportHelperUtil;
import com.liferay.portal.kernel.lar.ExportImportPathUtil;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.portal.kernel.lar.StagedModelModifiedDateComparator;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.service.ServiceContext;

import java.util.List;
import java.util.Map;

/**
 * @author Andrea Di Giorgi
 * @author Daniel Kocsis
 */
public class CalendarNotificationTemplateStagedModelDataHandler
	extends BaseStagedModelDataHandler<CalendarNotificationTemplate> {

	public static final String[] CLASS_NAMES =
		{CalendarNotificationTemplate.class.getName()};


	public void deleteStagedModel(
		String uuid, long groupId, String className, String extraData) {

		CalendarNotificationTemplate calendarNotificationTemplate =
			fetchStagedModelByUuidAndGroupId(uuid, groupId);

		if (calendarNotificationTemplate != null) {
			CalendarNotificationTemplateLocalServiceUtil.
				deleteCalendarNotificationTemplate(
					calendarNotificationTemplate);
		}
	}


	public CalendarNotificationTemplate fetchStagedModelByUuidAndCompanyId(
		String uuid, long companyId) {

		List<CalendarNotificationTemplate> calendarNotificationTemplates =
			CalendarNotificationTemplateLocalServiceUtil.
				getCalendarNotificationTemplatesByUuidAndCompanyId(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					new StagedModelModifiedDateComparator
						<CalendarNotificationTemplate>());

		if (ListUtil.isEmpty(calendarNotificationTemplates)) {
			return null;
		}

		return calendarNotificationTemplates.get(0);
	}


	public CalendarNotificationTemplate fetchStagedModelByUuidAndGroupId(
		String uuid, long groupId) {

		return CalendarNotificationTemplateLocalServiceUtil.
			fetchCalendarNotificationTemplateByUuidAndGroupId(uuid, groupId);
	}


	public String[] getClassNames() {
		return CLASS_NAMES;
	}


	protected void doExportStagedModel(
			PortletDataContext portletDataContext,
			CalendarNotificationTemplate calendarNotificationTemplate)
		throws Exception {

		Calendar calendar = CalendarLocalServiceUtil.getCalendar(
			calendarNotificationTemplate.getCalendarId());

		StagedModelDataHandlerUtil.exportReferenceStagedModel(
			portletDataContext, calendarNotificationTemplate, calendar,
			PortletDataContext.REFERENCE_TYPE_STRONG);

		String body = ExportImportHelperUtil.replaceExportContentReferences(
			portletDataContext, calendarNotificationTemplate,
			calendarNotificationTemplate.getBody(),
			portletDataContext.getBooleanParameter(
				CalendarPortletDataHandler.NAMESPACE, "referenced-content"));

		calendarNotificationTemplate.setBody(body);

		Element calendarNotificationTemplateElement =
			portletDataContext.getExportDataElement(
				calendarNotificationTemplate);

		portletDataContext.addClassedModel(
			calendarNotificationTemplateElement,
			ExportImportPathUtil.getModelPath(calendarNotificationTemplate),
			calendarNotificationTemplate);
	}


	protected void doImportStagedModel(
			PortletDataContext portletDataContext,
			CalendarNotificationTemplate calendarNotificationTemplate)
		throws Exception {

		long userId = portletDataContext.getUserId(
			calendarNotificationTemplate.getUserUuid());

		StagedModelDataHandlerUtil.importReferenceStagedModels(
			portletDataContext, calendarNotificationTemplate, Calendar.class);

		Map<Long, Long> calendarIds =
			(Map<Long, Long>)portletDataContext.getNewPrimaryKeysMap(
				Calendar.class);

		long calendarId = MapUtil.getLong(
			calendarIds, calendarNotificationTemplate.getCalendarId(),
			calendarNotificationTemplate.getCalendarId());

		NotificationType notificationType = NotificationType.parse(
			calendarNotificationTemplate.getNotificationType());
		NotificationTemplateType notificationTemplateType =
			NotificationTemplateType.parse(
				calendarNotificationTemplate.getNotificationTemplateType());

		ServiceContext serviceContext = portletDataContext.createServiceContext(
			calendarNotificationTemplate);

		CalendarNotificationTemplate importedCalendarNotificationTemplate =
			null;

		String body = ExportImportHelperUtil.replaceImportContentReferences(
			portletDataContext, calendarNotificationTemplate,
			calendarNotificationTemplate.getBody());

		if (portletDataContext.isDataStrategyMirror()) {
			CalendarNotificationTemplate existingCalendarNotificationTemplate =
				fetchStagedModelByUuidAndGroupId(
					calendarNotificationTemplate.getUuid(),
					portletDataContext.getScopeGroupId());

			if (existingCalendarNotificationTemplate == null) {
				serviceContext.setUuid(calendarNotificationTemplate.getUuid());

				importedCalendarNotificationTemplate =
					CalendarNotificationTemplateLocalServiceUtil.
						addCalendarNotificationTemplate(
							userId, calendarId, notificationType,
							calendarNotificationTemplate.
								getNotificationTypeSettings(),
							notificationTemplateType,
							calendarNotificationTemplate.getSubject(), body,
							serviceContext);
			}
			else {
				importedCalendarNotificationTemplate =
					CalendarNotificationTemplateLocalServiceUtil.
						updateCalendarNotificationTemplate(
							existingCalendarNotificationTemplate.
								getCalendarNotificationTemplateId(),
							calendarNotificationTemplate.
								getNotificationTypeSettings(),
							calendarNotificationTemplate.getSubject(), body,
							serviceContext);
			}
		}
		else {
			importedCalendarNotificationTemplate =
				CalendarNotificationTemplateLocalServiceUtil.
					addCalendarNotificationTemplate(
						userId, calendarId, notificationType,
						calendarNotificationTemplate.
							getNotificationTypeSettings(),
						notificationTemplateType,
						calendarNotificationTemplate.getSubject(), body,
						serviceContext);
		}

		portletDataContext.importClassedModel(
			calendarNotificationTemplate, importedCalendarNotificationTemplate);
	}

}
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

package com.liferay.calendar.service.impl;

import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.service.base.CalendarServiceBaseImpl;
import com.liferay.calendar.service.permission.CalendarPermission;
import com.liferay.calendar.service.permission.CalendarResourcePermission;
import com.liferay.calendar.util.ActionKeys;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author Eduardo Lundgren
 * @author Fabio Pezzutto
 * @author Andrea Di Giorgi
 */
public class CalendarServiceImpl extends CalendarServiceBaseImpl {


	public Calendar addCalendar(
			long groupId, long calendarResourceId, Map<Locale, String> nameMap,
			Map<Locale, String> descriptionMap, int color,
			boolean defaultCalendar, boolean enableComments,
			boolean enableRatings, ServiceContext serviceContext)
		throws PortalException {

		CalendarResourcePermission.check(
			getPermissionChecker(), calendarResourceId,
			ActionKeys.ADD_CALENDAR);

		return calendarLocalService.addCalendar(
			getUserId(), groupId, calendarResourceId, nameMap, descriptionMap,
			color, defaultCalendar, enableComments, enableRatings,
			serviceContext);
	}


	public Calendar deleteCalendar(long calendarId) throws PortalException {
		CalendarPermission.check(
			getPermissionChecker(), calendarId, ActionKeys.DELETE);

		return calendarLocalService.deleteCalendar(calendarId);
	}


	public String exportCalendar(long calendarId, String type)
		throws Exception {

		CalendarPermission.check(
			getPermissionChecker(), calendarId,
			ActionKeys.VIEW_BOOKING_DETAILS);

		return calendarLocalService.exportCalendar(calendarId, type);
	}


	public Calendar fetchCalendar(long calendarId) throws PortalException {
		Calendar calendar = calendarPersistence.fetchByPrimaryKey(calendarId);

		if (calendar == null) {
			return null;
		}

		CalendarPermission.check(
			getPermissionChecker(), calendar, ActionKeys.VIEW);

		return calendar;
	}


	public Calendar getCalendar(long calendarId) throws PortalException {
		CalendarPermission.check(
			getPermissionChecker(), calendarId, ActionKeys.VIEW);

		return calendarLocalService.getCalendar(calendarId);
	}


	public List<Calendar> getCalendarResourceCalendars(
			long groupId, long calendarResourceId)
		throws PortalException {

		CalendarResourcePermission.check(
			getPermissionChecker(), calendarResourceId, ActionKeys.VIEW);

		return calendarLocalService.getCalendarResourceCalendars(
			groupId, calendarResourceId);
	}


	public List<Calendar> getCalendarResourceCalendars(
			long groupId, long calendarResourceId, boolean defaultCalendar)
		throws PortalException {

		CalendarResourcePermission.check(
			getPermissionChecker(), calendarResourceId, ActionKeys.VIEW);

		return calendarLocalService.getCalendarResourceCalendars(
			groupId, calendarResourceId, defaultCalendar);
	}


	public void importCalendar(long calendarId, String data, String type)
		throws Exception {

		CalendarPermission.check(
			getPermissionChecker(), calendarId, ActionKeys.UPDATE);

		calendarLocalService.importCalendar(calendarId, data, type);
	}


	public List<Calendar> search(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String keywords, boolean andOperator, int start, int end,
			OrderByComparator<Calendar> orderByComparator)
		throws PortalException {

		return search(
			companyId, groupIds, calendarResourceIds, keywords, andOperator,
			start, end, orderByComparator, ActionKeys.VIEW);
	}


	public List<Calendar> search(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String keywords, boolean andOperator, int start, int end,
			OrderByComparator<Calendar> orderByComparator, String actionId)
		throws PortalException {

		List<Calendar> calendars = calendarFinder.findByKeywords(
			companyId, groupIds, calendarResourceIds, keywords, start, end,
			orderByComparator);

		return filterCalendars(calendars, actionId);
	}


	public List<Calendar> search(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String name, String description, boolean andOperator, int start,
			int end, OrderByComparator<Calendar> orderByComparator)
		throws PortalException {

		return search(
			companyId, groupIds, calendarResourceIds, name, description,
			andOperator, start, end, orderByComparator, ActionKeys.VIEW);
	}


	public List<Calendar> search(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String name, String description, boolean andOperator, int start,
			int end, OrderByComparator<Calendar> orderByComparator,
			String actionId)
		throws PortalException {

		List<Calendar> calendars = calendarFinder.findByC_G_C_N_D(
			companyId, groupIds, calendarResourceIds, name, description,
			andOperator, start, end, orderByComparator);

		return filterCalendars(calendars, actionId);
	}


	public int searchCount(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String keywords, boolean andOperator)
		throws PortalException {

		return searchCount(
			companyId, groupIds, calendarResourceIds, keywords, andOperator,
			ActionKeys.VIEW);
	}


	public int searchCount(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String keywords, boolean andOperator, String actionId)
		throws PortalException {

		List<Calendar> calendars = search(
			companyId, groupIds, calendarResourceIds, keywords, andOperator,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			(OrderByComparator<Calendar>)null);

		return calendars.size();
	}


	public int searchCount(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String name, String description, boolean andOperator)
		throws PortalException {

		return searchCount(
			companyId, groupIds, calendarResourceIds, name, description,
			andOperator, ActionKeys.VIEW);
	}


	public int searchCount(
			long companyId, long[] groupIds, long[] calendarResourceIds,
			String name, String description, boolean andOperator,
			String actionId)
		throws PortalException {

		List<Calendar> calendars = search(
			companyId, groupIds, calendarResourceIds, name, description,
			andOperator, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			(OrderByComparator<Calendar>)null, actionId);

		return calendars.size();
	}


	public Calendar updateCalendar(
			long calendarId, Map<Locale, String> nameMap,
			Map<Locale, String> descriptionMap, int color,
			boolean defaultCalendar, boolean enableComments,
			boolean enableRatings, ServiceContext serviceContext)
		throws PortalException {

		CalendarPermission.check(
			getPermissionChecker(), calendarId, ActionKeys.UPDATE);

		return calendarLocalService.updateCalendar(
			calendarId, nameMap, descriptionMap, color, defaultCalendar,
			enableComments, enableRatings, serviceContext);
	}


	public Calendar updateCalendar(
			long calendarId, Map<Locale, String> nameMap,
			Map<Locale, String> descriptionMap, int color,
			ServiceContext serviceContext)
		throws PortalException {

		CalendarPermission.check(
			getPermissionChecker(), calendarId, ActionKeys.UPDATE);

		return calendarLocalService.updateCalendar(
			calendarId, nameMap, descriptionMap, color, serviceContext);
	}


	public Calendar updateColor(
			long calendarId, int color, ServiceContext serviceContext)
		throws PortalException {

		CalendarPermission.check(
			getPermissionChecker(), calendarId, ActionKeys.UPDATE);

		return calendarLocalService.updateColor(
			calendarId, color, serviceContext);
	}

	protected List<Calendar> filterCalendars(
			List<Calendar> calendars, String actionId)
		throws PrincipalException {

		calendars = ListUtil.copy(calendars);

		Iterator<Calendar> itr = calendars.iterator();

		while (itr.hasNext()) {
			Calendar calendar = itr.next();

			if (!CalendarPermission.contains(
					getPermissionChecker(), calendar, actionId)) {

				itr.remove();
			}
		}

		return calendars;
	}

}
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

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.workflow.kaleo.model.KaleoNotification;
import com.liferay.portal.workflow.kaleo.service.KaleoNotificationLocalServiceUtil;

/**
 * The extended model base implementation for the KaleoNotification service. Represents a row in the &quot;KaleoNotification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoNotificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNotificationImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoNotification
 * @generated
 */
public abstract class KaleoNotificationBaseImpl
	extends KaleoNotificationModelImpl implements KaleoNotification {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo notification model instance should use the {@link KaleoNotification} interface instead.
	 */

	public void persist() {
		if (this.isNew()) {
			KaleoNotificationLocalServiceUtil.addKaleoNotification(this);
		}
		else {
			KaleoNotificationLocalServiceUtil.updateKaleoNotification(this);
		}
	}
}
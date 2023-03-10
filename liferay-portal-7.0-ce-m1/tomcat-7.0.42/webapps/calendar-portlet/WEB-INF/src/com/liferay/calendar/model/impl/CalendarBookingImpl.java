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

package com.liferay.calendar.model.impl;

import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.model.CalendarResource;
import com.liferay.calendar.notification.NotificationType;
import com.liferay.calendar.recurrence.Recurrence;
import com.liferay.calendar.recurrence.RecurrenceSerializer;
import com.liferay.calendar.service.CalendarBookingLocalServiceUtil;
import com.liferay.calendar.service.CalendarLocalServiceUtil;
import com.liferay.calendar.service.CalendarResourceLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;
import java.util.TimeZone;

/**
 * @author Eduardo Lundgren
 */
public class CalendarBookingImpl extends CalendarBookingBaseImpl {

	public CalendarBookingImpl() {
	}


	public Calendar getCalendar() throws PortalException {
		return CalendarLocalServiceUtil.getCalendar(getCalendarId());
	}


	public CalendarResource getCalendarResource() throws PortalException {
		return CalendarResourceLocalServiceUtil.getCalendarResource(
			getCalendarResourceId());
	}


	public List<CalendarBooking> getChildCalendarBookings() {
		return CalendarBookingLocalServiceUtil.getChildCalendarBookings(
			getCalendarBookingId());
	}


	public long getDuration() {
		return getEndTime() - getStartTime();
	}


	public NotificationType getFirstReminderNotificationType() {
		return NotificationType.parse(getFirstReminderType());
	}

	@JSON

	public int getInstanceIndex() {
		return _instanceIndex;
	}


	public CalendarBooking getParentCalendarBooking() throws PortalException {
		return CalendarBookingLocalServiceUtil.getCalendarBooking(
			getParentCalendarBookingId());
	}


	public Recurrence getRecurrenceObj() {
		if ((_recurrenceObj == null) && isRecurring()) {
			_recurrenceObj = RecurrenceSerializer.deserialize(getRecurrence());
		}

		return _recurrenceObj;
	}


	public NotificationType getSecondReminderNotificationType() {
		return NotificationType.parse(getSecondReminderType());
	}


	public TimeZone getTimeZone() throws PortalException {
		CalendarBooking parentCalendarBooking = getParentCalendarBooking();

		Calendar calendar = parentCalendarBooking.getCalendar();

		return calendar.getTimeZone();
	}


	public boolean isMasterBooking() {
		if (getParentCalendarBookingId() == getCalendarBookingId()) {
			return true;
		}

		return false;
	}


	public boolean isRecurring() {
		if (Validator.isNotNull(getRecurrence())) {
			return true;
		}

		return false;
	}

	@JSON

	public void setInstanceIndex(int instanceIndex) {
		_instanceIndex = instanceIndex;
	}

	private int _instanceIndex;
	private Recurrence _recurrenceObj;

}
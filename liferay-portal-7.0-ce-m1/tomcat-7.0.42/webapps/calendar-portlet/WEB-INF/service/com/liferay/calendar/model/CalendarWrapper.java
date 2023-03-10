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

package com.liferay.calendar.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Calendar}.
 * </p>
 *
 * @author Eduardo Lundgren
 * @see Calendar
 * @generated
 */
public class CalendarWrapper implements Calendar, ModelWrapper<Calendar> {
	public CalendarWrapper(Calendar calendar) {
		_calendar = calendar;
	}


	public Class<?> getModelClass() {
		return Calendar.class;
	}


	public String getModelClassName() {
		return Calendar.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("calendarId", getCalendarId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("resourceBlockId", getResourceBlockId());
		attributes.put("calendarResourceId", getCalendarResourceId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("color", getColor());
		attributes.put("defaultCalendar", getDefaultCalendar());
		attributes.put("enableComments", getEnableComments());
		attributes.put("enableRatings", getEnableRatings());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long calendarId = (Long)attributes.get("calendarId");

		if (calendarId != null) {
			setCalendarId(calendarId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long resourceBlockId = (Long)attributes.get("resourceBlockId");

		if (resourceBlockId != null) {
			setResourceBlockId(resourceBlockId);
		}

		Long calendarResourceId = (Long)attributes.get("calendarResourceId");

		if (calendarResourceId != null) {
			setCalendarResourceId(calendarResourceId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer color = (Integer)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		Boolean defaultCalendar = (Boolean)attributes.get("defaultCalendar");

		if (defaultCalendar != null) {
			setDefaultCalendar(defaultCalendar);
		}

		Boolean enableComments = (Boolean)attributes.get("enableComments");

		if (enableComments != null) {
			setEnableComments(enableComments);
		}

		Boolean enableRatings = (Boolean)attributes.get("enableRatings");

		if (enableRatings != null) {
			setEnableRatings(enableRatings);
		}
	}


	public java.lang.Object clone() {
		return new CalendarWrapper((Calendar)_calendar.clone());
	}


	public int compareTo(com.liferay.calendar.model.Calendar calendar) {
		return _calendar.compareTo(calendar);
	}


	public java.lang.String[] getAvailableLanguageIds() {
		return _calendar.getAvailableLanguageIds();
	}

	/**
	* Returns the calendar ID of this calendar.
	*
	* @return the calendar ID of this calendar
	*/

	public long getCalendarId() {
		return _calendar.getCalendarId();
	}


	public com.liferay.calendar.model.CalendarResource getCalendarResource()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendar.getCalendarResource();
	}

	/**
	* Returns the calendar resource ID of this calendar.
	*
	* @return the calendar resource ID of this calendar
	*/

	public long getCalendarResourceId() {
		return _calendar.getCalendarResourceId();
	}

	/**
	* Returns the color of this calendar.
	*
	* @return the color of this calendar
	*/

	public int getColor() {
		return _calendar.getColor();
	}

	/**
	* Returns the company ID of this calendar.
	*
	* @return the company ID of this calendar
	*/

	public long getCompanyId() {
		return _calendar.getCompanyId();
	}

	/**
	* Returns the create date of this calendar.
	*
	* @return the create date of this calendar
	*/

	public java.util.Date getCreateDate() {
		return _calendar.getCreateDate();
	}

	/**
	* Returns the default calendar of this calendar.
	*
	* @return the default calendar of this calendar
	*/

	public boolean getDefaultCalendar() {
		return _calendar.getDefaultCalendar();
	}


	public java.lang.String getDefaultLanguageId() {
		return _calendar.getDefaultLanguageId();
	}

	/**
	* Returns the description of this calendar.
	*
	* @return the description of this calendar
	*/

	public java.lang.String getDescription() {
		return _calendar.getDescription();
	}

	/**
	* Returns the localized description of this calendar in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this calendar
	*/

	public java.lang.String getDescription(java.lang.String languageId) {
		return _calendar.getDescription(languageId);
	}

	/**
	* Returns the localized description of this calendar in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this calendar
	*/

	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _calendar.getDescription(languageId, useDefault);
	}

	/**
	* Returns the localized description of this calendar in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this calendar
	*/

	public java.lang.String getDescription(java.util.Locale locale) {
		return _calendar.getDescription(locale);
	}

	/**
	* Returns the localized description of this calendar in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this calendar. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/

	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _calendar.getDescription(locale, useDefault);
	}


	public java.lang.String getDescriptionCurrentLanguageId() {
		return _calendar.getDescriptionCurrentLanguageId();
	}


	public java.lang.String getDescriptionCurrentValue() {
		return _calendar.getDescriptionCurrentValue();
	}

	/**
	* Returns a map of the locales and localized descriptions of this calendar.
	*
	* @return the locales and localized descriptions of this calendar
	*/

	public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _calendar.getDescriptionMap();
	}

	/**
	* Returns the enable comments of this calendar.
	*
	* @return the enable comments of this calendar
	*/

	public boolean getEnableComments() {
		return _calendar.getEnableComments();
	}

	/**
	* Returns the enable ratings of this calendar.
	*
	* @return the enable ratings of this calendar
	*/

	public boolean getEnableRatings() {
		return _calendar.getEnableRatings();
	}


	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _calendar.getExpandoBridge();
	}

	/**
	* Returns the group ID of this calendar.
	*
	* @return the group ID of this calendar
	*/

	public long getGroupId() {
		return _calendar.getGroupId();
	}

	/**
	* Returns the modified date of this calendar.
	*
	* @return the modified date of this calendar
	*/

	public java.util.Date getModifiedDate() {
		return _calendar.getModifiedDate();
	}

	/**
	* Returns the name of this calendar.
	*
	* @return the name of this calendar
	*/

	public java.lang.String getName() {
		return _calendar.getName();
	}

	/**
	* Returns the localized name of this calendar in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized name of this calendar
	*/

	public java.lang.String getName(java.lang.String languageId) {
		return _calendar.getName(languageId);
	}

	/**
	* Returns the localized name of this calendar in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized name of this calendar
	*/

	public java.lang.String getName(java.lang.String languageId,
		boolean useDefault) {
		return _calendar.getName(languageId, useDefault);
	}

	/**
	* Returns the localized name of this calendar in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized name of this calendar
	*/

	public java.lang.String getName(java.util.Locale locale) {
		return _calendar.getName(locale);
	}

	/**
	* Returns the localized name of this calendar in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized name of this calendar. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/

	public java.lang.String getName(java.util.Locale locale, boolean useDefault) {
		return _calendar.getName(locale, useDefault);
	}


	public java.lang.String getNameCurrentLanguageId() {
		return _calendar.getNameCurrentLanguageId();
	}


	public java.lang.String getNameCurrentValue() {
		return _calendar.getNameCurrentValue();
	}

	/**
	* Returns a map of the locales and localized names of this calendar.
	*
	* @return the locales and localized names of this calendar
	*/

	public java.util.Map<java.util.Locale, java.lang.String> getNameMap() {
		return _calendar.getNameMap();
	}

	/**
	* Returns the primary key of this calendar.
	*
	* @return the primary key of this calendar
	*/

	public long getPrimaryKey() {
		return _calendar.getPrimaryKey();
	}


	public java.io.Serializable getPrimaryKeyObj() {
		return _calendar.getPrimaryKeyObj();
	}

	/**
	* Returns the resource block ID of this calendar.
	*
	* @return the resource block ID of this calendar
	*/

	public long getResourceBlockId() {
		return _calendar.getResourceBlockId();
	}


	public java.util.TimeZone getTimeZone()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendar.getTimeZone();
	}

	/**
	* Returns the user ID of this calendar.
	*
	* @return the user ID of this calendar
	*/

	public long getUserId() {
		return _calendar.getUserId();
	}

	/**
	* Returns the user name of this calendar.
	*
	* @return the user name of this calendar
	*/

	public java.lang.String getUserName() {
		return _calendar.getUserName();
	}

	/**
	* Returns the user uuid of this calendar.
	*
	* @return the user uuid of this calendar
	*/

	public java.lang.String getUserUuid() {
		return _calendar.getUserUuid();
	}

	/**
	* Returns the uuid of this calendar.
	*
	* @return the uuid of this calendar
	*/

	public java.lang.String getUuid() {
		return _calendar.getUuid();
	}


	public int hashCode() {
		return _calendar.hashCode();
	}


	public boolean isCachedModel() {
		return _calendar.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this calendar is default calendar.
	*
	* @return <code>true</code> if this calendar is default calendar; <code>false</code> otherwise
	*/

	public boolean isDefaultCalendar() {
		return _calendar.isDefaultCalendar();
	}

	/**
	* Returns <code>true</code> if this calendar is enable comments.
	*
	* @return <code>true</code> if this calendar is enable comments; <code>false</code> otherwise
	*/

	public boolean isEnableComments() {
		return _calendar.isEnableComments();
	}

	/**
	* Returns <code>true</code> if this calendar is enable ratings.
	*
	* @return <code>true</code> if this calendar is enable ratings; <code>false</code> otherwise
	*/

	public boolean isEnableRatings() {
		return _calendar.isEnableRatings();
	}


	public boolean isEscapedModel() {
		return _calendar.isEscapedModel();
	}


	public boolean isNew() {
		return _calendar.isNew();
	}


	public void persist() {
		_calendar.persist();
	}


	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_calendar.prepareLocalizedFieldsForImport();
	}


	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_calendar.prepareLocalizedFieldsForImport(defaultImportLocale);
	}


	public void setCachedModel(boolean cachedModel) {
		_calendar.setCachedModel(cachedModel);
	}

	/**
	* Sets the calendar ID of this calendar.
	*
	* @param calendarId the calendar ID of this calendar
	*/

	public void setCalendarId(long calendarId) {
		_calendar.setCalendarId(calendarId);
	}

	/**
	* Sets the calendar resource ID of this calendar.
	*
	* @param calendarResourceId the calendar resource ID of this calendar
	*/

	public void setCalendarResourceId(long calendarResourceId) {
		_calendar.setCalendarResourceId(calendarResourceId);
	}

	/**
	* Sets the color of this calendar.
	*
	* @param color the color of this calendar
	*/

	public void setColor(int color) {
		_calendar.setColor(color);
	}

	/**
	* Sets the company ID of this calendar.
	*
	* @param companyId the company ID of this calendar
	*/

	public void setCompanyId(long companyId) {
		_calendar.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this calendar.
	*
	* @param createDate the create date of this calendar
	*/

	public void setCreateDate(java.util.Date createDate) {
		_calendar.setCreateDate(createDate);
	}

	/**
	* Sets whether this calendar is default calendar.
	*
	* @param defaultCalendar the default calendar of this calendar
	*/

	public void setDefaultCalendar(boolean defaultCalendar) {
		_calendar.setDefaultCalendar(defaultCalendar);
	}

	/**
	* Sets the description of this calendar.
	*
	* @param description the description of this calendar
	*/

	public void setDescription(java.lang.String description) {
		_calendar.setDescription(description);
	}

	/**
	* Sets the localized description of this calendar in the language.
	*
	* @param description the localized description of this calendar
	* @param locale the locale of the language
	*/

	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_calendar.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this calendar in the language, and sets the default locale.
	*
	* @param description the localized description of this calendar
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/

	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_calendar.setDescription(description, locale, defaultLocale);
	}


	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_calendar.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this calendar from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this calendar
	*/

	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
		_calendar.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this calendar from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this calendar
	* @param defaultLocale the default locale
	*/

	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_calendar.setDescriptionMap(descriptionMap, defaultLocale);
	}

	/**
	* Sets whether this calendar is enable comments.
	*
	* @param enableComments the enable comments of this calendar
	*/

	public void setEnableComments(boolean enableComments) {
		_calendar.setEnableComments(enableComments);
	}

	/**
	* Sets whether this calendar is enable ratings.
	*
	* @param enableRatings the enable ratings of this calendar
	*/

	public void setEnableRatings(boolean enableRatings) {
		_calendar.setEnableRatings(enableRatings);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_calendar.setExpandoBridgeAttributes(baseModel);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_calendar.setExpandoBridgeAttributes(expandoBridge);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_calendar.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this calendar.
	*
	* @param groupId the group ID of this calendar
	*/

	public void setGroupId(long groupId) {
		_calendar.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this calendar.
	*
	* @param modifiedDate the modified date of this calendar
	*/

	public void setModifiedDate(java.util.Date modifiedDate) {
		_calendar.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this calendar.
	*
	* @param name the name of this calendar
	*/

	public void setName(java.lang.String name) {
		_calendar.setName(name);
	}

	/**
	* Sets the localized name of this calendar in the language.
	*
	* @param name the localized name of this calendar
	* @param locale the locale of the language
	*/

	public void setName(java.lang.String name, java.util.Locale locale) {
		_calendar.setName(name, locale);
	}

	/**
	* Sets the localized name of this calendar in the language, and sets the default locale.
	*
	* @param name the localized name of this calendar
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/

	public void setName(java.lang.String name, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_calendar.setName(name, locale, defaultLocale);
	}


	public void setNameCurrentLanguageId(java.lang.String languageId) {
		_calendar.setNameCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized names of this calendar from the map of locales and localized names.
	*
	* @param nameMap the locales and localized names of this calendar
	*/

	public void setNameMap(
		java.util.Map<java.util.Locale, java.lang.String> nameMap) {
		_calendar.setNameMap(nameMap);
	}

	/**
	* Sets the localized names of this calendar from the map of locales and localized names, and sets the default locale.
	*
	* @param nameMap the locales and localized names of this calendar
	* @param defaultLocale the default locale
	*/

	public void setNameMap(
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Locale defaultLocale) {
		_calendar.setNameMap(nameMap, defaultLocale);
	}


	public void setNew(boolean n) {
		_calendar.setNew(n);
	}

	/**
	* Sets the primary key of this calendar.
	*
	* @param primaryKey the primary key of this calendar
	*/

	public void setPrimaryKey(long primaryKey) {
		_calendar.setPrimaryKey(primaryKey);
	}


	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_calendar.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the resource block ID of this calendar.
	*
	* @param resourceBlockId the resource block ID of this calendar
	*/

	public void setResourceBlockId(long resourceBlockId) {
		_calendar.setResourceBlockId(resourceBlockId);
	}

	/**
	* Sets the user ID of this calendar.
	*
	* @param userId the user ID of this calendar
	*/

	public void setUserId(long userId) {
		_calendar.setUserId(userId);
	}

	/**
	* Sets the user name of this calendar.
	*
	* @param userName the user name of this calendar
	*/

	public void setUserName(java.lang.String userName) {
		_calendar.setUserName(userName);
	}

	/**
	* Sets the user uuid of this calendar.
	*
	* @param userUuid the user uuid of this calendar
	*/

	public void setUserUuid(java.lang.String userUuid) {
		_calendar.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this calendar.
	*
	* @param uuid the uuid of this calendar
	*/

	public void setUuid(java.lang.String uuid) {
		_calendar.setUuid(uuid);
	}


	public com.liferay.portal.model.CacheModel<com.liferay.calendar.model.Calendar> toCacheModel() {
		return _calendar.toCacheModel();
	}


	public com.liferay.calendar.model.Calendar toEscapedModel() {
		return new CalendarWrapper(_calendar.toEscapedModel());
	}


	public java.lang.String toString() {
		return _calendar.toString();
	}


	public com.liferay.calendar.model.Calendar toUnescapedModel() {
		return new CalendarWrapper(_calendar.toUnescapedModel());
	}


	public java.lang.String toXmlString() {
		return _calendar.toXmlString();
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CalendarWrapper)) {
			return false;
		}

		CalendarWrapper calendarWrapper = (CalendarWrapper)obj;

		if (Validator.equals(_calendar, calendarWrapper._calendar)) {
			return true;
		}

		return false;
	}


	public StagedModelType getStagedModelType() {
		return _calendar.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public Calendar getWrappedCalendar() {
		return _calendar;
	}


	public Calendar getWrappedModel() {
		return _calendar;
	}


	public boolean isEntityCacheEnabled() {
		return _calendar.isEntityCacheEnabled();
	}


	public boolean isFinderCacheEnabled() {
		return _calendar.isFinderCacheEnabled();
	}


	public void resetOriginalValues() {
		_calendar.resetOriginalValues();
	}

	private Calendar _calendar;
}
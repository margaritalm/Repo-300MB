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

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KaleoCondition}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoCondition
 * @generated
 */
public class KaleoConditionWrapper implements KaleoCondition,
	ModelWrapper<KaleoCondition> {
	public KaleoConditionWrapper(KaleoCondition kaleoCondition) {
		_kaleoCondition = kaleoCondition;
	}


	public Class<?> getModelClass() {
		return KaleoCondition.class;
	}


	public String getModelClassName() {
		return KaleoCondition.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoConditionId", getKaleoConditionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("kaleoNodeId", getKaleoNodeId());
		attributes.put("script", getScript());
		attributes.put("scriptLanguage", getScriptLanguage());
		attributes.put("scriptRequiredContexts", getScriptRequiredContexts());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoConditionId = (Long)attributes.get("kaleoConditionId");

		if (kaleoConditionId != null) {
			setKaleoConditionId(kaleoConditionId);
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

		Long kaleoDefinitionId = (Long)attributes.get("kaleoDefinitionId");

		if (kaleoDefinitionId != null) {
			setKaleoDefinitionId(kaleoDefinitionId);
		}

		Long kaleoNodeId = (Long)attributes.get("kaleoNodeId");

		if (kaleoNodeId != null) {
			setKaleoNodeId(kaleoNodeId);
		}

		String script = (String)attributes.get("script");

		if (script != null) {
			setScript(script);
		}

		String scriptLanguage = (String)attributes.get("scriptLanguage");

		if (scriptLanguage != null) {
			setScriptLanguage(scriptLanguage);
		}

		String scriptRequiredContexts = (String)attributes.get(
				"scriptRequiredContexts");

		if (scriptRequiredContexts != null) {
			setScriptRequiredContexts(scriptRequiredContexts);
		}
	}


	public java.lang.Object clone() {
		return new KaleoConditionWrapper((KaleoCondition)_kaleoCondition.clone());
	}


	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoCondition kaleoCondition) {
		return _kaleoCondition.compareTo(kaleoCondition);
	}

	/**
	* Returns the company ID of this kaleo condition.
	*
	* @return the company ID of this kaleo condition
	*/

	public long getCompanyId() {
		return _kaleoCondition.getCompanyId();
	}

	/**
	* Returns the create date of this kaleo condition.
	*
	* @return the create date of this kaleo condition
	*/

	public java.util.Date getCreateDate() {
		return _kaleoCondition.getCreateDate();
	}


	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoCondition.getExpandoBridge();
	}

	/**
	* Returns the group ID of this kaleo condition.
	*
	* @return the group ID of this kaleo condition
	*/

	public long getGroupId() {
		return _kaleoCondition.getGroupId();
	}

	/**
	* Returns the kaleo condition ID of this kaleo condition.
	*
	* @return the kaleo condition ID of this kaleo condition
	*/

	public long getKaleoConditionId() {
		return _kaleoCondition.getKaleoConditionId();
	}

	/**
	* Returns the kaleo definition ID of this kaleo condition.
	*
	* @return the kaleo definition ID of this kaleo condition
	*/

	public long getKaleoDefinitionId() {
		return _kaleoCondition.getKaleoDefinitionId();
	}

	/**
	* Returns the kaleo node ID of this kaleo condition.
	*
	* @return the kaleo node ID of this kaleo condition
	*/

	public long getKaleoNodeId() {
		return _kaleoCondition.getKaleoNodeId();
	}

	/**
	* Returns the modified date of this kaleo condition.
	*
	* @return the modified date of this kaleo condition
	*/

	public java.util.Date getModifiedDate() {
		return _kaleoCondition.getModifiedDate();
	}

	/**
	* Returns the primary key of this kaleo condition.
	*
	* @return the primary key of this kaleo condition
	*/

	public long getPrimaryKey() {
		return _kaleoCondition.getPrimaryKey();
	}


	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoCondition.getPrimaryKeyObj();
	}

	/**
	* Returns the script of this kaleo condition.
	*
	* @return the script of this kaleo condition
	*/

	public java.lang.String getScript() {
		return _kaleoCondition.getScript();
	}

	/**
	* Returns the script language of this kaleo condition.
	*
	* @return the script language of this kaleo condition
	*/

	public java.lang.String getScriptLanguage() {
		return _kaleoCondition.getScriptLanguage();
	}

	/**
	* Returns the script required contexts of this kaleo condition.
	*
	* @return the script required contexts of this kaleo condition
	*/

	public java.lang.String getScriptRequiredContexts() {
		return _kaleoCondition.getScriptRequiredContexts();
	}

	/**
	* Returns the user ID of this kaleo condition.
	*
	* @return the user ID of this kaleo condition
	*/

	public long getUserId() {
		return _kaleoCondition.getUserId();
	}

	/**
	* Returns the user name of this kaleo condition.
	*
	* @return the user name of this kaleo condition
	*/

	public java.lang.String getUserName() {
		return _kaleoCondition.getUserName();
	}

	/**
	* Returns the user uuid of this kaleo condition.
	*
	* @return the user uuid of this kaleo condition
	*/

	public java.lang.String getUserUuid() {
		return _kaleoCondition.getUserUuid();
	}


	public int hashCode() {
		return _kaleoCondition.hashCode();
	}


	public boolean isCachedModel() {
		return _kaleoCondition.isCachedModel();
	}


	public boolean isEscapedModel() {
		return _kaleoCondition.isEscapedModel();
	}


	public boolean isNew() {
		return _kaleoCondition.isNew();
	}


	public void persist() {
		_kaleoCondition.persist();
	}


	public void setCachedModel(boolean cachedModel) {
		_kaleoCondition.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this kaleo condition.
	*
	* @param companyId the company ID of this kaleo condition
	*/

	public void setCompanyId(long companyId) {
		_kaleoCondition.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this kaleo condition.
	*
	* @param createDate the create date of this kaleo condition
	*/

	public void setCreateDate(java.util.Date createDate) {
		_kaleoCondition.setCreateDate(createDate);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_kaleoCondition.setExpandoBridgeAttributes(baseModel);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_kaleoCondition.setExpandoBridgeAttributes(expandoBridge);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoCondition.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this kaleo condition.
	*
	* @param groupId the group ID of this kaleo condition
	*/

	public void setGroupId(long groupId) {
		_kaleoCondition.setGroupId(groupId);
	}

	/**
	* Sets the kaleo condition ID of this kaleo condition.
	*
	* @param kaleoConditionId the kaleo condition ID of this kaleo condition
	*/

	public void setKaleoConditionId(long kaleoConditionId) {
		_kaleoCondition.setKaleoConditionId(kaleoConditionId);
	}

	/**
	* Sets the kaleo definition ID of this kaleo condition.
	*
	* @param kaleoDefinitionId the kaleo definition ID of this kaleo condition
	*/

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoCondition.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Sets the kaleo node ID of this kaleo condition.
	*
	* @param kaleoNodeId the kaleo node ID of this kaleo condition
	*/

	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoCondition.setKaleoNodeId(kaleoNodeId);
	}

	/**
	* Sets the modified date of this kaleo condition.
	*
	* @param modifiedDate the modified date of this kaleo condition
	*/

	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoCondition.setModifiedDate(modifiedDate);
	}


	public void setNew(boolean n) {
		_kaleoCondition.setNew(n);
	}

	/**
	* Sets the primary key of this kaleo condition.
	*
	* @param primaryKey the primary key of this kaleo condition
	*/

	public void setPrimaryKey(long primaryKey) {
		_kaleoCondition.setPrimaryKey(primaryKey);
	}


	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_kaleoCondition.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the script of this kaleo condition.
	*
	* @param script the script of this kaleo condition
	*/

	public void setScript(java.lang.String script) {
		_kaleoCondition.setScript(script);
	}

	/**
	* Sets the script language of this kaleo condition.
	*
	* @param scriptLanguage the script language of this kaleo condition
	*/

	public void setScriptLanguage(java.lang.String scriptLanguage) {
		_kaleoCondition.setScriptLanguage(scriptLanguage);
	}

	/**
	* Sets the script required contexts of this kaleo condition.
	*
	* @param scriptRequiredContexts the script required contexts of this kaleo condition
	*/

	public void setScriptRequiredContexts(
		java.lang.String scriptRequiredContexts) {
		_kaleoCondition.setScriptRequiredContexts(scriptRequiredContexts);
	}

	/**
	* Sets the user ID of this kaleo condition.
	*
	* @param userId the user ID of this kaleo condition
	*/

	public void setUserId(long userId) {
		_kaleoCondition.setUserId(userId);
	}

	/**
	* Sets the user name of this kaleo condition.
	*
	* @param userName the user name of this kaleo condition
	*/

	public void setUserName(java.lang.String userName) {
		_kaleoCondition.setUserName(userName);
	}

	/**
	* Sets the user uuid of this kaleo condition.
	*
	* @param userUuid the user uuid of this kaleo condition
	*/

	public void setUserUuid(java.lang.String userUuid) {
		_kaleoCondition.setUserUuid(userUuid);
	}


	public com.liferay.portal.model.CacheModel<com.liferay.portal.workflow.kaleo.model.KaleoCondition> toCacheModel() {
		return _kaleoCondition.toCacheModel();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoCondition toEscapedModel() {
		return new KaleoConditionWrapper(_kaleoCondition.toEscapedModel());
	}


	public java.lang.String toString() {
		return _kaleoCondition.toString();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoCondition toUnescapedModel() {
		return new KaleoConditionWrapper(_kaleoCondition.toUnescapedModel());
	}


	public java.lang.String toXmlString() {
		return _kaleoCondition.toXmlString();
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoConditionWrapper)) {
			return false;
		}

		KaleoConditionWrapper kaleoConditionWrapper = (KaleoConditionWrapper)obj;

		if (Validator.equals(_kaleoCondition,
					kaleoConditionWrapper._kaleoCondition)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public KaleoCondition getWrappedKaleoCondition() {
		return _kaleoCondition;
	}


	public KaleoCondition getWrappedModel() {
		return _kaleoCondition;
	}


	public boolean isEntityCacheEnabled() {
		return _kaleoCondition.isEntityCacheEnabled();
	}


	public boolean isFinderCacheEnabled() {
		return _kaleoCondition.isFinderCacheEnabled();
	}


	public void resetOriginalValues() {
		_kaleoCondition.resetOriginalValues();
	}

	private KaleoCondition _kaleoCondition;
}
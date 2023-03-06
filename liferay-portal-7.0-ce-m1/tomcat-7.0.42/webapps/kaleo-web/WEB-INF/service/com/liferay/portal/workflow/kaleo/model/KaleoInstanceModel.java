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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoInstance service. Represents a row in the &quot;KaleoInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoInstanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoInstance
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoInstanceImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoInstanceModelImpl
 * @generated
 */
public interface KaleoInstanceModel extends BaseModel<KaleoInstance>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo instance model instance should use the {@link KaleoInstance} interface instead.
	 */

	/**
	 * Returns the primary key of this kaleo instance.
	 *
	 * @return the primary key of this kaleo instance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo instance.
	 *
	 * @param primaryKey the primary key of this kaleo instance
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the kaleo instance ID of this kaleo instance.
	 *
	 * @return the kaleo instance ID of this kaleo instance
	 */
	public long getKaleoInstanceId();

	/**
	 * Sets the kaleo instance ID of this kaleo instance.
	 *
	 * @param kaleoInstanceId the kaleo instance ID of this kaleo instance
	 */
	public void setKaleoInstanceId(long kaleoInstanceId);

	/**
	 * Returns the group ID of this kaleo instance.
	 *
	 * @return the group ID of this kaleo instance
	 */

	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo instance.
	 *
	 * @param groupId the group ID of this kaleo instance
	 */

	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this kaleo instance.
	 *
	 * @return the company ID of this kaleo instance
	 */

	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo instance.
	 *
	 * @param companyId the company ID of this kaleo instance
	 */

	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this kaleo instance.
	 *
	 * @return the user ID of this kaleo instance
	 */

	public long getUserId();

	/**
	 * Sets the user ID of this kaleo instance.
	 *
	 * @param userId the user ID of this kaleo instance
	 */

	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this kaleo instance.
	 *
	 * @return the user uuid of this kaleo instance
	 */

	public String getUserUuid();

	/**
	 * Sets the user uuid of this kaleo instance.
	 *
	 * @param userUuid the user uuid of this kaleo instance
	 */

	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this kaleo instance.
	 *
	 * @return the user name of this kaleo instance
	 */
	@AutoEscape

	public String getUserName();

	/**
	 * Sets the user name of this kaleo instance.
	 *
	 * @param userName the user name of this kaleo instance
	 */

	public void setUserName(String userName);

	/**
	 * Returns the create date of this kaleo instance.
	 *
	 * @return the create date of this kaleo instance
	 */

	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo instance.
	 *
	 * @param createDate the create date of this kaleo instance
	 */

	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this kaleo instance.
	 *
	 * @return the modified date of this kaleo instance
	 */

	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo instance.
	 *
	 * @param modifiedDate the modified date of this kaleo instance
	 */

	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the kaleo definition ID of this kaleo instance.
	 *
	 * @return the kaleo definition ID of this kaleo instance
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo instance.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo instance
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Returns the kaleo definition name of this kaleo instance.
	 *
	 * @return the kaleo definition name of this kaleo instance
	 */
	@AutoEscape
	public String getKaleoDefinitionName();

	/**
	 * Sets the kaleo definition name of this kaleo instance.
	 *
	 * @param kaleoDefinitionName the kaleo definition name of this kaleo instance
	 */
	public void setKaleoDefinitionName(String kaleoDefinitionName);

	/**
	 * Returns the kaleo definition version of this kaleo instance.
	 *
	 * @return the kaleo definition version of this kaleo instance
	 */
	public int getKaleoDefinitionVersion();

	/**
	 * Sets the kaleo definition version of this kaleo instance.
	 *
	 * @param kaleoDefinitionVersion the kaleo definition version of this kaleo instance
	 */
	public void setKaleoDefinitionVersion(int kaleoDefinitionVersion);

	/**
	 * Returns the root kaleo instance token ID of this kaleo instance.
	 *
	 * @return the root kaleo instance token ID of this kaleo instance
	 */
	public long getRootKaleoInstanceTokenId();

	/**
	 * Sets the root kaleo instance token ID of this kaleo instance.
	 *
	 * @param rootKaleoInstanceTokenId the root kaleo instance token ID of this kaleo instance
	 */
	public void setRootKaleoInstanceTokenId(long rootKaleoInstanceTokenId);

	/**
	 * Returns the class name of this kaleo instance.
	 *
	 * @return the class name of this kaleo instance
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this kaleo instance.
	 *
	 * @param className the class name of this kaleo instance
	 */
	public void setClassName(String className);

	/**
	 * Returns the class p k of this kaleo instance.
	 *
	 * @return the class p k of this kaleo instance
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this kaleo instance.
	 *
	 * @param classPK the class p k of this kaleo instance
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the completed of this kaleo instance.
	 *
	 * @return the completed of this kaleo instance
	 */
	public boolean getCompleted();

	/**
	 * Returns <code>true</code> if this kaleo instance is completed.
	 *
	 * @return <code>true</code> if this kaleo instance is completed; <code>false</code> otherwise
	 */
	public boolean isCompleted();

	/**
	 * Sets whether this kaleo instance is completed.
	 *
	 * @param completed the completed of this kaleo instance
	 */
	public void setCompleted(boolean completed);

	/**
	 * Returns the completion date of this kaleo instance.
	 *
	 * @return the completion date of this kaleo instance
	 */
	public Date getCompletionDate();

	/**
	 * Sets the completion date of this kaleo instance.
	 *
	 * @param completionDate the completion date of this kaleo instance
	 */
	public void setCompletionDate(Date completionDate);

	/**
	 * Returns the workflow context of this kaleo instance.
	 *
	 * @return the workflow context of this kaleo instance
	 */
	@AutoEscape
	public String getWorkflowContext();

	/**
	 * Sets the workflow context of this kaleo instance.
	 *
	 * @param workflowContext the workflow context of this kaleo instance
	 */
	public void setWorkflowContext(String workflowContext);


	public boolean isNew();


	public void setNew(boolean n);


	public boolean isCachedModel();


	public void setCachedModel(boolean cachedModel);


	public boolean isEscapedModel();


	public Serializable getPrimaryKeyObj();


	public void setPrimaryKeyObj(Serializable primaryKeyObj);


	public ExpandoBridge getExpandoBridge();


	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);


	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);


	public void setExpandoBridgeAttributes(ServiceContext serviceContext);


	public Object clone();


	public int compareTo(KaleoInstance kaleoInstance);


	public int hashCode();


	public CacheModel<KaleoInstance> toCacheModel();


	public KaleoInstance toEscapedModel();


	public KaleoInstance toUnescapedModel();


	public String toString();


	public String toXmlString();
}
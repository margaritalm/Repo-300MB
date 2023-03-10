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
 * The base model interface for the KaleoTransition service. Represents a row in the &quot;KaleoTransition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTransitionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTransitionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTransition
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTransitionImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTransitionModelImpl
 * @generated
 */
public interface KaleoTransitionModel extends BaseModel<KaleoTransition>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo transition model instance should use the {@link KaleoTransition} interface instead.
	 */

	/**
	 * Returns the primary key of this kaleo transition.
	 *
	 * @return the primary key of this kaleo transition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo transition.
	 *
	 * @param primaryKey the primary key of this kaleo transition
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the kaleo transition ID of this kaleo transition.
	 *
	 * @return the kaleo transition ID of this kaleo transition
	 */
	public long getKaleoTransitionId();

	/**
	 * Sets the kaleo transition ID of this kaleo transition.
	 *
	 * @param kaleoTransitionId the kaleo transition ID of this kaleo transition
	 */
	public void setKaleoTransitionId(long kaleoTransitionId);

	/**
	 * Returns the group ID of this kaleo transition.
	 *
	 * @return the group ID of this kaleo transition
	 */

	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo transition.
	 *
	 * @param groupId the group ID of this kaleo transition
	 */

	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this kaleo transition.
	 *
	 * @return the company ID of this kaleo transition
	 */

	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo transition.
	 *
	 * @param companyId the company ID of this kaleo transition
	 */

	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this kaleo transition.
	 *
	 * @return the user ID of this kaleo transition
	 */

	public long getUserId();

	/**
	 * Sets the user ID of this kaleo transition.
	 *
	 * @param userId the user ID of this kaleo transition
	 */

	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this kaleo transition.
	 *
	 * @return the user uuid of this kaleo transition
	 */

	public String getUserUuid();

	/**
	 * Sets the user uuid of this kaleo transition.
	 *
	 * @param userUuid the user uuid of this kaleo transition
	 */

	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this kaleo transition.
	 *
	 * @return the user name of this kaleo transition
	 */
	@AutoEscape

	public String getUserName();

	/**
	 * Sets the user name of this kaleo transition.
	 *
	 * @param userName the user name of this kaleo transition
	 */

	public void setUserName(String userName);

	/**
	 * Returns the create date of this kaleo transition.
	 *
	 * @return the create date of this kaleo transition
	 */

	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo transition.
	 *
	 * @param createDate the create date of this kaleo transition
	 */

	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this kaleo transition.
	 *
	 * @return the modified date of this kaleo transition
	 */

	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo transition.
	 *
	 * @param modifiedDate the modified date of this kaleo transition
	 */

	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the kaleo definition ID of this kaleo transition.
	 *
	 * @return the kaleo definition ID of this kaleo transition
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo transition.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo transition
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Returns the kaleo node ID of this kaleo transition.
	 *
	 * @return the kaleo node ID of this kaleo transition
	 */
	public long getKaleoNodeId();

	/**
	 * Sets the kaleo node ID of this kaleo transition.
	 *
	 * @param kaleoNodeId the kaleo node ID of this kaleo transition
	 */
	public void setKaleoNodeId(long kaleoNodeId);

	/**
	 * Returns the name of this kaleo transition.
	 *
	 * @return the name of this kaleo transition
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this kaleo transition.
	 *
	 * @param name the name of this kaleo transition
	 */
	public void setName(String name);

	/**
	 * Returns the description of this kaleo transition.
	 *
	 * @return the description of this kaleo transition
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this kaleo transition.
	 *
	 * @param description the description of this kaleo transition
	 */
	public void setDescription(String description);

	/**
	 * Returns the source kaleo node ID of this kaleo transition.
	 *
	 * @return the source kaleo node ID of this kaleo transition
	 */
	public long getSourceKaleoNodeId();

	/**
	 * Sets the source kaleo node ID of this kaleo transition.
	 *
	 * @param sourceKaleoNodeId the source kaleo node ID of this kaleo transition
	 */
	public void setSourceKaleoNodeId(long sourceKaleoNodeId);

	/**
	 * Returns the source kaleo node name of this kaleo transition.
	 *
	 * @return the source kaleo node name of this kaleo transition
	 */
	@AutoEscape
	public String getSourceKaleoNodeName();

	/**
	 * Sets the source kaleo node name of this kaleo transition.
	 *
	 * @param sourceKaleoNodeName the source kaleo node name of this kaleo transition
	 */
	public void setSourceKaleoNodeName(String sourceKaleoNodeName);

	/**
	 * Returns the target kaleo node ID of this kaleo transition.
	 *
	 * @return the target kaleo node ID of this kaleo transition
	 */
	public long getTargetKaleoNodeId();

	/**
	 * Sets the target kaleo node ID of this kaleo transition.
	 *
	 * @param targetKaleoNodeId the target kaleo node ID of this kaleo transition
	 */
	public void setTargetKaleoNodeId(long targetKaleoNodeId);

	/**
	 * Returns the target kaleo node name of this kaleo transition.
	 *
	 * @return the target kaleo node name of this kaleo transition
	 */
	@AutoEscape
	public String getTargetKaleoNodeName();

	/**
	 * Sets the target kaleo node name of this kaleo transition.
	 *
	 * @param targetKaleoNodeName the target kaleo node name of this kaleo transition
	 */
	public void setTargetKaleoNodeName(String targetKaleoNodeName);

	/**
	 * Returns the default transition of this kaleo transition.
	 *
	 * @return the default transition of this kaleo transition
	 */
	public boolean getDefaultTransition();

	/**
	 * Returns <code>true</code> if this kaleo transition is default transition.
	 *
	 * @return <code>true</code> if this kaleo transition is default transition; <code>false</code> otherwise
	 */
	public boolean isDefaultTransition();

	/**
	 * Sets whether this kaleo transition is default transition.
	 *
	 * @param defaultTransition the default transition of this kaleo transition
	 */
	public void setDefaultTransition(boolean defaultTransition);


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


	public int compareTo(KaleoTransition kaleoTransition);


	public int hashCode();


	public CacheModel<KaleoTransition> toCacheModel();


	public KaleoTransition toEscapedModel();


	public KaleoTransition toUnescapedModel();


	public String toString();


	public String toXmlString();
}
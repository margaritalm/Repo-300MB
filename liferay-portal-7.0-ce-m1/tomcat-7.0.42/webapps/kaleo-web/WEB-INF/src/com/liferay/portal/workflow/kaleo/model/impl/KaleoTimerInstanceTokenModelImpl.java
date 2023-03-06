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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.User;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken;
import com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceTokenModel;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the KaleoTimerInstanceToken service. Represents a row in the &quot;KaleoTimerInstanceToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceTokenModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoTimerInstanceTokenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTimerInstanceTokenImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceTokenModel
 * @generated
 */
public class KaleoTimerInstanceTokenModelImpl extends BaseModelImpl<KaleoTimerInstanceToken>
	implements KaleoTimerInstanceTokenModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo timer instance token model instance should use the {@link com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoTimerInstanceToken";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoTimerInstanceTokenId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoClassName", Types.VARCHAR },
			{ "kaleoClassPK", Types.BIGINT },
			{ "kaleoDefinitionId", Types.BIGINT },
			{ "kaleoInstanceId", Types.BIGINT },
			{ "kaleoInstanceTokenId", Types.BIGINT },
			{ "kaleoTaskInstanceTokenId", Types.BIGINT },
			{ "kaleoTimerId", Types.BIGINT },
			{ "kaleoTimerName", Types.VARCHAR },
			{ "blocking", Types.BOOLEAN },
			{ "completionUserId", Types.BIGINT },
			{ "completed", Types.BOOLEAN },
			{ "completionDate", Types.TIMESTAMP },
			{ "workflowContext", Types.CLOB }
		};
	public static final String TABLE_SQL_CREATE = "create table KaleoTimerInstanceToken (kaleoTimerInstanceTokenId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoClassName VARCHAR(200) null,kaleoClassPK LONG,kaleoDefinitionId LONG,kaleoInstanceId LONG,kaleoInstanceTokenId LONG,kaleoTaskInstanceTokenId LONG,kaleoTimerId LONG,kaleoTimerName VARCHAR(200) null,blocking BOOLEAN,completionUserId LONG,completed BOOLEAN,completionDate DATE null,workflowContext TEXT null)";
	public static final String TABLE_SQL_DROP = "drop table KaleoTimerInstanceToken";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoTimerInstanceToken.kaleoTimerInstanceTokenId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoTimerInstanceToken.kaleoTimerInstanceTokenId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken"),
			true);
	public static long BLOCKING_COLUMN_BITMASK = 1L;
	public static long COMPLETED_COLUMN_BITMASK = 2L;
	public static long KALEOINSTANCEID_COLUMN_BITMASK = 4L;
	public static long KALEOINSTANCETOKENID_COLUMN_BITMASK = 8L;
	public static long KALEOTIMERID_COLUMN_BITMASK = 16L;
	public static long KALEOTIMERINSTANCETOKENID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken"));

	public KaleoTimerInstanceTokenModelImpl() {
	}


	public long getPrimaryKey() {
		return _kaleoTimerInstanceTokenId;
	}


	public void setPrimaryKey(long primaryKey) {
		setKaleoTimerInstanceTokenId(primaryKey);
	}


	public Serializable getPrimaryKeyObj() {
		return _kaleoTimerInstanceTokenId;
	}


	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}


	public Class<?> getModelClass() {
		return KaleoTimerInstanceToken.class;
	}


	public String getModelClassName() {
		return KaleoTimerInstanceToken.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoTimerInstanceTokenId",
			getKaleoTimerInstanceTokenId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoClassName", getKaleoClassName());
		attributes.put("kaleoClassPK", getKaleoClassPK());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("kaleoInstanceId", getKaleoInstanceId());
		attributes.put("kaleoInstanceTokenId", getKaleoInstanceTokenId());
		attributes.put("kaleoTaskInstanceTokenId", getKaleoTaskInstanceTokenId());
		attributes.put("kaleoTimerId", getKaleoTimerId());
		attributes.put("kaleoTimerName", getKaleoTimerName());
		attributes.put("blocking", getBlocking());
		attributes.put("completionUserId", getCompletionUserId());
		attributes.put("completed", getCompleted());
		attributes.put("completionDate", getCompletionDate());
		attributes.put("workflowContext", getWorkflowContext());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoTimerInstanceTokenId = (Long)attributes.get(
				"kaleoTimerInstanceTokenId");

		if (kaleoTimerInstanceTokenId != null) {
			setKaleoTimerInstanceTokenId(kaleoTimerInstanceTokenId);
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

		String kaleoClassName = (String)attributes.get("kaleoClassName");

		if (kaleoClassName != null) {
			setKaleoClassName(kaleoClassName);
		}

		Long kaleoClassPK = (Long)attributes.get("kaleoClassPK");

		if (kaleoClassPK != null) {
			setKaleoClassPK(kaleoClassPK);
		}

		Long kaleoDefinitionId = (Long)attributes.get("kaleoDefinitionId");

		if (kaleoDefinitionId != null) {
			setKaleoDefinitionId(kaleoDefinitionId);
		}

		Long kaleoInstanceId = (Long)attributes.get("kaleoInstanceId");

		if (kaleoInstanceId != null) {
			setKaleoInstanceId(kaleoInstanceId);
		}

		Long kaleoInstanceTokenId = (Long)attributes.get("kaleoInstanceTokenId");

		if (kaleoInstanceTokenId != null) {
			setKaleoInstanceTokenId(kaleoInstanceTokenId);
		}

		Long kaleoTaskInstanceTokenId = (Long)attributes.get(
				"kaleoTaskInstanceTokenId");

		if (kaleoTaskInstanceTokenId != null) {
			setKaleoTaskInstanceTokenId(kaleoTaskInstanceTokenId);
		}

		Long kaleoTimerId = (Long)attributes.get("kaleoTimerId");

		if (kaleoTimerId != null) {
			setKaleoTimerId(kaleoTimerId);
		}

		String kaleoTimerName = (String)attributes.get("kaleoTimerName");

		if (kaleoTimerName != null) {
			setKaleoTimerName(kaleoTimerName);
		}

		Boolean blocking = (Boolean)attributes.get("blocking");

		if (blocking != null) {
			setBlocking(blocking);
		}

		Long completionUserId = (Long)attributes.get("completionUserId");

		if (completionUserId != null) {
			setCompletionUserId(completionUserId);
		}

		Boolean completed = (Boolean)attributes.get("completed");

		if (completed != null) {
			setCompleted(completed);
		}

		Date completionDate = (Date)attributes.get("completionDate");

		if (completionDate != null) {
			setCompletionDate(completionDate);
		}

		String workflowContext = (String)attributes.get("workflowContext");

		if (workflowContext != null) {
			setWorkflowContext(workflowContext);
		}
	}


	public long getKaleoTimerInstanceTokenId() {
		return _kaleoTimerInstanceTokenId;
	}


	public void setKaleoTimerInstanceTokenId(long kaleoTimerInstanceTokenId) {
		_columnBitmask = -1L;

		_kaleoTimerInstanceTokenId = kaleoTimerInstanceTokenId;
	}


	public long getGroupId() {
		return _groupId;
	}


	public void setGroupId(long groupId) {
		_groupId = groupId;
	}


	public long getCompanyId() {
		return _companyId;
	}


	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}


	public long getUserId() {
		return _userId;
	}


	public void setUserId(long userId) {
		_userId = userId;
	}


	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}


	public void setUserUuid(String userUuid) {
	}


	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}


	public void setUserName(String userName) {
		_userName = userName;
	}


	public Date getCreateDate() {
		return _createDate;
	}


	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}


	public Date getModifiedDate() {
		return _modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}


	public String getKaleoClassName() {
		if (_kaleoClassName == null) {
			return StringPool.BLANK;
		}
		else {
			return _kaleoClassName;
		}
	}


	public void setKaleoClassName(String kaleoClassName) {
		_kaleoClassName = kaleoClassName;
	}


	public long getKaleoClassPK() {
		return _kaleoClassPK;
	}


	public void setKaleoClassPK(long kaleoClassPK) {
		_kaleoClassPK = kaleoClassPK;
	}


	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}


	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoDefinitionId = kaleoDefinitionId;
	}


	public long getKaleoInstanceId() {
		return _kaleoInstanceId;
	}


	public void setKaleoInstanceId(long kaleoInstanceId) {
		_columnBitmask |= KALEOINSTANCEID_COLUMN_BITMASK;

		if (!_setOriginalKaleoInstanceId) {
			_setOriginalKaleoInstanceId = true;

			_originalKaleoInstanceId = _kaleoInstanceId;
		}

		_kaleoInstanceId = kaleoInstanceId;
	}

	public long getOriginalKaleoInstanceId() {
		return _originalKaleoInstanceId;
	}


	public long getKaleoInstanceTokenId() {
		return _kaleoInstanceTokenId;
	}


	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId) {
		_columnBitmask |= KALEOINSTANCETOKENID_COLUMN_BITMASK;

		if (!_setOriginalKaleoInstanceTokenId) {
			_setOriginalKaleoInstanceTokenId = true;

			_originalKaleoInstanceTokenId = _kaleoInstanceTokenId;
		}

		_kaleoInstanceTokenId = kaleoInstanceTokenId;
	}

	public long getOriginalKaleoInstanceTokenId() {
		return _originalKaleoInstanceTokenId;
	}


	public long getKaleoTaskInstanceTokenId() {
		return _kaleoTaskInstanceTokenId;
	}


	public void setKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId) {
		_kaleoTaskInstanceTokenId = kaleoTaskInstanceTokenId;
	}


	public long getKaleoTimerId() {
		return _kaleoTimerId;
	}


	public void setKaleoTimerId(long kaleoTimerId) {
		_columnBitmask |= KALEOTIMERID_COLUMN_BITMASK;

		if (!_setOriginalKaleoTimerId) {
			_setOriginalKaleoTimerId = true;

			_originalKaleoTimerId = _kaleoTimerId;
		}

		_kaleoTimerId = kaleoTimerId;
	}

	public long getOriginalKaleoTimerId() {
		return _originalKaleoTimerId;
	}


	public String getKaleoTimerName() {
		if (_kaleoTimerName == null) {
			return StringPool.BLANK;
		}
		else {
			return _kaleoTimerName;
		}
	}


	public void setKaleoTimerName(String kaleoTimerName) {
		_kaleoTimerName = kaleoTimerName;
	}


	public boolean getBlocking() {
		return _blocking;
	}


	public boolean isBlocking() {
		return _blocking;
	}


	public void setBlocking(boolean blocking) {
		_columnBitmask |= BLOCKING_COLUMN_BITMASK;

		if (!_setOriginalBlocking) {
			_setOriginalBlocking = true;

			_originalBlocking = _blocking;
		}

		_blocking = blocking;
	}

	public boolean getOriginalBlocking() {
		return _originalBlocking;
	}


	public long getCompletionUserId() {
		return _completionUserId;
	}


	public void setCompletionUserId(long completionUserId) {
		_completionUserId = completionUserId;
	}


	public String getCompletionUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getCompletionUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}


	public void setCompletionUserUuid(String completionUserUuid) {
	}


	public boolean getCompleted() {
		return _completed;
	}


	public boolean isCompleted() {
		return _completed;
	}


	public void setCompleted(boolean completed) {
		_columnBitmask |= COMPLETED_COLUMN_BITMASK;

		if (!_setOriginalCompleted) {
			_setOriginalCompleted = true;

			_originalCompleted = _completed;
		}

		_completed = completed;
	}

	public boolean getOriginalCompleted() {
		return _originalCompleted;
	}


	public Date getCompletionDate() {
		return _completionDate;
	}


	public void setCompletionDate(Date completionDate) {
		_completionDate = completionDate;
	}


	public String getWorkflowContext() {
		if (_workflowContext == null) {
			return StringPool.BLANK;
		}
		else {
			return _workflowContext;
		}
	}


	public void setWorkflowContext(String workflowContext) {
		_workflowContext = workflowContext;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}


	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			KaleoTimerInstanceToken.class.getName(), getPrimaryKey());
	}


	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}


	public KaleoTimerInstanceToken toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (KaleoTimerInstanceToken)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}


	public Object clone() {
		KaleoTimerInstanceTokenImpl kaleoTimerInstanceTokenImpl = new KaleoTimerInstanceTokenImpl();

		kaleoTimerInstanceTokenImpl.setKaleoTimerInstanceTokenId(getKaleoTimerInstanceTokenId());
		kaleoTimerInstanceTokenImpl.setGroupId(getGroupId());
		kaleoTimerInstanceTokenImpl.setCompanyId(getCompanyId());
		kaleoTimerInstanceTokenImpl.setUserId(getUserId());
		kaleoTimerInstanceTokenImpl.setUserName(getUserName());
		kaleoTimerInstanceTokenImpl.setCreateDate(getCreateDate());
		kaleoTimerInstanceTokenImpl.setModifiedDate(getModifiedDate());
		kaleoTimerInstanceTokenImpl.setKaleoClassName(getKaleoClassName());
		kaleoTimerInstanceTokenImpl.setKaleoClassPK(getKaleoClassPK());
		kaleoTimerInstanceTokenImpl.setKaleoDefinitionId(getKaleoDefinitionId());
		kaleoTimerInstanceTokenImpl.setKaleoInstanceId(getKaleoInstanceId());
		kaleoTimerInstanceTokenImpl.setKaleoInstanceTokenId(getKaleoInstanceTokenId());
		kaleoTimerInstanceTokenImpl.setKaleoTaskInstanceTokenId(getKaleoTaskInstanceTokenId());
		kaleoTimerInstanceTokenImpl.setKaleoTimerId(getKaleoTimerId());
		kaleoTimerInstanceTokenImpl.setKaleoTimerName(getKaleoTimerName());
		kaleoTimerInstanceTokenImpl.setBlocking(getBlocking());
		kaleoTimerInstanceTokenImpl.setCompletionUserId(getCompletionUserId());
		kaleoTimerInstanceTokenImpl.setCompleted(getCompleted());
		kaleoTimerInstanceTokenImpl.setCompletionDate(getCompletionDate());
		kaleoTimerInstanceTokenImpl.setWorkflowContext(getWorkflowContext());

		kaleoTimerInstanceTokenImpl.resetOriginalValues();

		return kaleoTimerInstanceTokenImpl;
	}


	public int compareTo(KaleoTimerInstanceToken kaleoTimerInstanceToken) {
		int value = 0;

		if (getKaleoTimerInstanceTokenId() < kaleoTimerInstanceToken.getKaleoTimerInstanceTokenId()) {
			value = -1;
		}
		else if (getKaleoTimerInstanceTokenId() > kaleoTimerInstanceToken.getKaleoTimerInstanceTokenId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoTimerInstanceToken)) {
			return false;
		}

		KaleoTimerInstanceToken kaleoTimerInstanceToken = (KaleoTimerInstanceToken)obj;

		long primaryKey = kaleoTimerInstanceToken.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}


	public int hashCode() {
		return (int)getPrimaryKey();
	}


	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}


	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}


	public void resetOriginalValues() {
		KaleoTimerInstanceTokenModelImpl kaleoTimerInstanceTokenModelImpl = this;

		kaleoTimerInstanceTokenModelImpl._originalKaleoInstanceId = kaleoTimerInstanceTokenModelImpl._kaleoInstanceId;

		kaleoTimerInstanceTokenModelImpl._setOriginalKaleoInstanceId = false;

		kaleoTimerInstanceTokenModelImpl._originalKaleoInstanceTokenId = kaleoTimerInstanceTokenModelImpl._kaleoInstanceTokenId;

		kaleoTimerInstanceTokenModelImpl._setOriginalKaleoInstanceTokenId = false;

		kaleoTimerInstanceTokenModelImpl._originalKaleoTimerId = kaleoTimerInstanceTokenModelImpl._kaleoTimerId;

		kaleoTimerInstanceTokenModelImpl._setOriginalKaleoTimerId = false;

		kaleoTimerInstanceTokenModelImpl._originalBlocking = kaleoTimerInstanceTokenModelImpl._blocking;

		kaleoTimerInstanceTokenModelImpl._setOriginalBlocking = false;

		kaleoTimerInstanceTokenModelImpl._originalCompleted = kaleoTimerInstanceTokenModelImpl._completed;

		kaleoTimerInstanceTokenModelImpl._setOriginalCompleted = false;

		kaleoTimerInstanceTokenModelImpl._columnBitmask = 0;
	}


	public CacheModel<KaleoTimerInstanceToken> toCacheModel() {
		KaleoTimerInstanceTokenCacheModel kaleoTimerInstanceTokenCacheModel = new KaleoTimerInstanceTokenCacheModel();

		kaleoTimerInstanceTokenCacheModel.kaleoTimerInstanceTokenId = getKaleoTimerInstanceTokenId();

		kaleoTimerInstanceTokenCacheModel.groupId = getGroupId();

		kaleoTimerInstanceTokenCacheModel.companyId = getCompanyId();

		kaleoTimerInstanceTokenCacheModel.userId = getUserId();

		kaleoTimerInstanceTokenCacheModel.userName = getUserName();

		String userName = kaleoTimerInstanceTokenCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			kaleoTimerInstanceTokenCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			kaleoTimerInstanceTokenCacheModel.createDate = createDate.getTime();
		}
		else {
			kaleoTimerInstanceTokenCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			kaleoTimerInstanceTokenCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			kaleoTimerInstanceTokenCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		kaleoTimerInstanceTokenCacheModel.kaleoClassName = getKaleoClassName();

		String kaleoClassName = kaleoTimerInstanceTokenCacheModel.kaleoClassName;

		if ((kaleoClassName != null) && (kaleoClassName.length() == 0)) {
			kaleoTimerInstanceTokenCacheModel.kaleoClassName = null;
		}

		kaleoTimerInstanceTokenCacheModel.kaleoClassPK = getKaleoClassPK();

		kaleoTimerInstanceTokenCacheModel.kaleoDefinitionId = getKaleoDefinitionId();

		kaleoTimerInstanceTokenCacheModel.kaleoInstanceId = getKaleoInstanceId();

		kaleoTimerInstanceTokenCacheModel.kaleoInstanceTokenId = getKaleoInstanceTokenId();

		kaleoTimerInstanceTokenCacheModel.kaleoTaskInstanceTokenId = getKaleoTaskInstanceTokenId();

		kaleoTimerInstanceTokenCacheModel.kaleoTimerId = getKaleoTimerId();

		kaleoTimerInstanceTokenCacheModel.kaleoTimerName = getKaleoTimerName();

		String kaleoTimerName = kaleoTimerInstanceTokenCacheModel.kaleoTimerName;

		if ((kaleoTimerName != null) && (kaleoTimerName.length() == 0)) {
			kaleoTimerInstanceTokenCacheModel.kaleoTimerName = null;
		}

		kaleoTimerInstanceTokenCacheModel.blocking = getBlocking();

		kaleoTimerInstanceTokenCacheModel.completionUserId = getCompletionUserId();

		kaleoTimerInstanceTokenCacheModel.completed = getCompleted();

		Date completionDate = getCompletionDate();

		if (completionDate != null) {
			kaleoTimerInstanceTokenCacheModel.completionDate = completionDate.getTime();
		}
		else {
			kaleoTimerInstanceTokenCacheModel.completionDate = Long.MIN_VALUE;
		}

		kaleoTimerInstanceTokenCacheModel.workflowContext = getWorkflowContext();

		String workflowContext = kaleoTimerInstanceTokenCacheModel.workflowContext;

		if ((workflowContext != null) && (workflowContext.length() == 0)) {
			kaleoTimerInstanceTokenCacheModel.workflowContext = null;
		}

		return kaleoTimerInstanceTokenCacheModel;
	}


	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{kaleoTimerInstanceTokenId=");
		sb.append(getKaleoTimerInstanceTokenId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", kaleoClassName=");
		sb.append(getKaleoClassName());
		sb.append(", kaleoClassPK=");
		sb.append(getKaleoClassPK());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoInstanceId=");
		sb.append(getKaleoInstanceId());
		sb.append(", kaleoInstanceTokenId=");
		sb.append(getKaleoInstanceTokenId());
		sb.append(", kaleoTaskInstanceTokenId=");
		sb.append(getKaleoTaskInstanceTokenId());
		sb.append(", kaleoTimerId=");
		sb.append(getKaleoTimerId());
		sb.append(", kaleoTimerName=");
		sb.append(getKaleoTimerName());
		sb.append(", blocking=");
		sb.append(getBlocking());
		sb.append(", completionUserId=");
		sb.append(getCompletionUserId());
		sb.append(", completed=");
		sb.append(getCompleted());
		sb.append(", completionDate=");
		sb.append(getCompletionDate());
		sb.append(", workflowContext=");
		sb.append(getWorkflowContext());
		sb.append("}");

		return sb.toString();
	}


	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoTimerInstanceTokenId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTimerInstanceTokenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoClassName</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoClassPK</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoInstanceId</column-name><column-value><![CDATA[");
		sb.append(getKaleoInstanceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoInstanceTokenId</column-name><column-value><![CDATA[");
		sb.append(getKaleoInstanceTokenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoTaskInstanceTokenId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTaskInstanceTokenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoTimerId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTimerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoTimerName</column-name><column-value><![CDATA[");
		sb.append(getKaleoTimerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>blocking</column-name><column-value><![CDATA[");
		sb.append(getBlocking());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>completionUserId</column-name><column-value><![CDATA[");
		sb.append(getCompletionUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>completed</column-name><column-value><![CDATA[");
		sb.append(getCompleted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>completionDate</column-name><column-value><![CDATA[");
		sb.append(getCompletionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workflowContext</column-name><column-value><![CDATA[");
		sb.append(getWorkflowContext());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = KaleoTimerInstanceToken.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			KaleoTimerInstanceToken.class
		};
	private long _kaleoTimerInstanceTokenId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _kaleoClassName;
	private long _kaleoClassPK;
	private long _kaleoDefinitionId;
	private long _kaleoInstanceId;
	private long _originalKaleoInstanceId;
	private boolean _setOriginalKaleoInstanceId;
	private long _kaleoInstanceTokenId;
	private long _originalKaleoInstanceTokenId;
	private boolean _setOriginalKaleoInstanceTokenId;
	private long _kaleoTaskInstanceTokenId;
	private long _kaleoTimerId;
	private long _originalKaleoTimerId;
	private boolean _setOriginalKaleoTimerId;
	private String _kaleoTimerName;
	private boolean _blocking;
	private boolean _originalBlocking;
	private boolean _setOriginalBlocking;
	private long _completionUserId;
	private boolean _completed;
	private boolean _originalCompleted;
	private boolean _setOriginalCompleted;
	private Date _completionDate;
	private String _workflowContext;
	private long _columnBitmask;
	private KaleoTimerInstanceToken _escapedModel;
}
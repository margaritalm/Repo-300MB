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
import com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient;
import com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipientModel;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the KaleoNotificationRecipient service. Represents a row in the &quot;KaleoNotificationRecipient&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipientModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoNotificationRecipientImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNotificationRecipientImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient
 * @see com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipientModel
 * @generated
 */
public class KaleoNotificationRecipientModelImpl extends BaseModelImpl<KaleoNotificationRecipient>
	implements KaleoNotificationRecipientModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo notification recipient model instance should use the {@link com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoNotificationRecipient";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoNotificationRecipientId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoDefinitionId", Types.BIGINT },
			{ "kaleoNotificationId", Types.BIGINT },
			{ "recipientClassName", Types.VARCHAR },
			{ "recipientClassPK", Types.BIGINT },
			{ "recipientRoleType", Types.INTEGER },
			{ "address", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table KaleoNotificationRecipient (kaleoNotificationRecipientId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoDefinitionId LONG,kaleoNotificationId LONG,recipientClassName VARCHAR(200) null,recipientClassPK LONG,recipientRoleType INTEGER,address VARCHAR(255) null)";
	public static final String TABLE_SQL_DROP = "drop table KaleoNotificationRecipient";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoNotificationRecipient.kaleoNotificationRecipientId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoNotificationRecipient.kaleoNotificationRecipientId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long KALEODEFINITIONID_COLUMN_BITMASK = 2L;
	public static long KALEONOTIFICATIONID_COLUMN_BITMASK = 4L;
	public static long KALEONOTIFICATIONRECIPIENTID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient"));

	public KaleoNotificationRecipientModelImpl() {
	}


	public long getPrimaryKey() {
		return _kaleoNotificationRecipientId;
	}


	public void setPrimaryKey(long primaryKey) {
		setKaleoNotificationRecipientId(primaryKey);
	}


	public Serializable getPrimaryKeyObj() {
		return _kaleoNotificationRecipientId;
	}


	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}


	public Class<?> getModelClass() {
		return KaleoNotificationRecipient.class;
	}


	public String getModelClassName() {
		return KaleoNotificationRecipient.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoNotificationRecipientId",
			getKaleoNotificationRecipientId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("kaleoNotificationId", getKaleoNotificationId());
		attributes.put("recipientClassName", getRecipientClassName());
		attributes.put("recipientClassPK", getRecipientClassPK());
		attributes.put("recipientRoleType", getRecipientRoleType());
		attributes.put("address", getAddress());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoNotificationRecipientId = (Long)attributes.get(
				"kaleoNotificationRecipientId");

		if (kaleoNotificationRecipientId != null) {
			setKaleoNotificationRecipientId(kaleoNotificationRecipientId);
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

		Long kaleoNotificationId = (Long)attributes.get("kaleoNotificationId");

		if (kaleoNotificationId != null) {
			setKaleoNotificationId(kaleoNotificationId);
		}

		String recipientClassName = (String)attributes.get("recipientClassName");

		if (recipientClassName != null) {
			setRecipientClassName(recipientClassName);
		}

		Long recipientClassPK = (Long)attributes.get("recipientClassPK");

		if (recipientClassPK != null) {
			setRecipientClassPK(recipientClassPK);
		}

		Integer recipientRoleType = (Integer)attributes.get("recipientRoleType");

		if (recipientRoleType != null) {
			setRecipientRoleType(recipientRoleType);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}
	}


	public long getKaleoNotificationRecipientId() {
		return _kaleoNotificationRecipientId;
	}


	public void setKaleoNotificationRecipientId(
		long kaleoNotificationRecipientId) {
		_columnBitmask = -1L;

		_kaleoNotificationRecipientId = kaleoNotificationRecipientId;
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
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
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


	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}


	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_columnBitmask |= KALEODEFINITIONID_COLUMN_BITMASK;

		if (!_setOriginalKaleoDefinitionId) {
			_setOriginalKaleoDefinitionId = true;

			_originalKaleoDefinitionId = _kaleoDefinitionId;
		}

		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getOriginalKaleoDefinitionId() {
		return _originalKaleoDefinitionId;
	}


	public long getKaleoNotificationId() {
		return _kaleoNotificationId;
	}


	public void setKaleoNotificationId(long kaleoNotificationId) {
		_columnBitmask |= KALEONOTIFICATIONID_COLUMN_BITMASK;

		if (!_setOriginalKaleoNotificationId) {
			_setOriginalKaleoNotificationId = true;

			_originalKaleoNotificationId = _kaleoNotificationId;
		}

		_kaleoNotificationId = kaleoNotificationId;
	}

	public long getOriginalKaleoNotificationId() {
		return _originalKaleoNotificationId;
	}


	public String getRecipientClassName() {
		if (_recipientClassName == null) {
			return StringPool.BLANK;
		}
		else {
			return _recipientClassName;
		}
	}


	public void setRecipientClassName(String recipientClassName) {
		_recipientClassName = recipientClassName;
	}


	public long getRecipientClassPK() {
		return _recipientClassPK;
	}


	public void setRecipientClassPK(long recipientClassPK) {
		_recipientClassPK = recipientClassPK;
	}


	public int getRecipientRoleType() {
		return _recipientRoleType;
	}


	public void setRecipientRoleType(int recipientRoleType) {
		_recipientRoleType = recipientRoleType;
	}


	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}


	public void setAddress(String address) {
		_address = address;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}


	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			KaleoNotificationRecipient.class.getName(), getPrimaryKey());
	}


	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}


	public KaleoNotificationRecipient toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (KaleoNotificationRecipient)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}


	public Object clone() {
		KaleoNotificationRecipientImpl kaleoNotificationRecipientImpl = new KaleoNotificationRecipientImpl();

		kaleoNotificationRecipientImpl.setKaleoNotificationRecipientId(getKaleoNotificationRecipientId());
		kaleoNotificationRecipientImpl.setGroupId(getGroupId());
		kaleoNotificationRecipientImpl.setCompanyId(getCompanyId());
		kaleoNotificationRecipientImpl.setUserId(getUserId());
		kaleoNotificationRecipientImpl.setUserName(getUserName());
		kaleoNotificationRecipientImpl.setCreateDate(getCreateDate());
		kaleoNotificationRecipientImpl.setModifiedDate(getModifiedDate());
		kaleoNotificationRecipientImpl.setKaleoDefinitionId(getKaleoDefinitionId());
		kaleoNotificationRecipientImpl.setKaleoNotificationId(getKaleoNotificationId());
		kaleoNotificationRecipientImpl.setRecipientClassName(getRecipientClassName());
		kaleoNotificationRecipientImpl.setRecipientClassPK(getRecipientClassPK());
		kaleoNotificationRecipientImpl.setRecipientRoleType(getRecipientRoleType());
		kaleoNotificationRecipientImpl.setAddress(getAddress());

		kaleoNotificationRecipientImpl.resetOriginalValues();

		return kaleoNotificationRecipientImpl;
	}


	public int compareTo(KaleoNotificationRecipient kaleoNotificationRecipient) {
		int value = 0;

		if (getKaleoNotificationRecipientId() < kaleoNotificationRecipient.getKaleoNotificationRecipientId()) {
			value = -1;
		}
		else if (getKaleoNotificationRecipientId() > kaleoNotificationRecipient.getKaleoNotificationRecipientId()) {
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

		if (!(obj instanceof KaleoNotificationRecipient)) {
			return false;
		}

		KaleoNotificationRecipient kaleoNotificationRecipient = (KaleoNotificationRecipient)obj;

		long primaryKey = kaleoNotificationRecipient.getPrimaryKey();

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
		KaleoNotificationRecipientModelImpl kaleoNotificationRecipientModelImpl = this;

		kaleoNotificationRecipientModelImpl._originalCompanyId = kaleoNotificationRecipientModelImpl._companyId;

		kaleoNotificationRecipientModelImpl._setOriginalCompanyId = false;

		kaleoNotificationRecipientModelImpl._originalKaleoDefinitionId = kaleoNotificationRecipientModelImpl._kaleoDefinitionId;

		kaleoNotificationRecipientModelImpl._setOriginalKaleoDefinitionId = false;

		kaleoNotificationRecipientModelImpl._originalKaleoNotificationId = kaleoNotificationRecipientModelImpl._kaleoNotificationId;

		kaleoNotificationRecipientModelImpl._setOriginalKaleoNotificationId = false;

		kaleoNotificationRecipientModelImpl._columnBitmask = 0;
	}


	public CacheModel<KaleoNotificationRecipient> toCacheModel() {
		KaleoNotificationRecipientCacheModel kaleoNotificationRecipientCacheModel =
			new KaleoNotificationRecipientCacheModel();

		kaleoNotificationRecipientCacheModel.kaleoNotificationRecipientId = getKaleoNotificationRecipientId();

		kaleoNotificationRecipientCacheModel.groupId = getGroupId();

		kaleoNotificationRecipientCacheModel.companyId = getCompanyId();

		kaleoNotificationRecipientCacheModel.userId = getUserId();

		kaleoNotificationRecipientCacheModel.userName = getUserName();

		String userName = kaleoNotificationRecipientCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			kaleoNotificationRecipientCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			kaleoNotificationRecipientCacheModel.createDate = createDate.getTime();
		}
		else {
			kaleoNotificationRecipientCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			kaleoNotificationRecipientCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			kaleoNotificationRecipientCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		kaleoNotificationRecipientCacheModel.kaleoDefinitionId = getKaleoDefinitionId();

		kaleoNotificationRecipientCacheModel.kaleoNotificationId = getKaleoNotificationId();

		kaleoNotificationRecipientCacheModel.recipientClassName = getRecipientClassName();

		String recipientClassName = kaleoNotificationRecipientCacheModel.recipientClassName;

		if ((recipientClassName != null) && (recipientClassName.length() == 0)) {
			kaleoNotificationRecipientCacheModel.recipientClassName = null;
		}

		kaleoNotificationRecipientCacheModel.recipientClassPK = getRecipientClassPK();

		kaleoNotificationRecipientCacheModel.recipientRoleType = getRecipientRoleType();

		kaleoNotificationRecipientCacheModel.address = getAddress();

		String address = kaleoNotificationRecipientCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			kaleoNotificationRecipientCacheModel.address = null;
		}

		return kaleoNotificationRecipientCacheModel;
	}


	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{kaleoNotificationRecipientId=");
		sb.append(getKaleoNotificationRecipientId());
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
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoNotificationId=");
		sb.append(getKaleoNotificationId());
		sb.append(", recipientClassName=");
		sb.append(getRecipientClassName());
		sb.append(", recipientClassPK=");
		sb.append(getRecipientClassPK());
		sb.append(", recipientRoleType=");
		sb.append(getRecipientRoleType());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append("}");

		return sb.toString();
	}


	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoNotificationRecipientId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNotificationRecipientId());
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
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNotificationId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNotificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recipientClassName</column-name><column-value><![CDATA[");
		sb.append(getRecipientClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recipientClassPK</column-name><column-value><![CDATA[");
		sb.append(getRecipientClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recipientRoleType</column-name><column-value><![CDATA[");
		sb.append(getRecipientRoleType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = KaleoNotificationRecipient.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			KaleoNotificationRecipient.class
		};
	private long _kaleoNotificationRecipientId;
	private long _groupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _kaleoDefinitionId;
	private long _originalKaleoDefinitionId;
	private boolean _setOriginalKaleoDefinitionId;
	private long _kaleoNotificationId;
	private long _originalKaleoNotificationId;
	private boolean _setOriginalKaleoNotificationId;
	private String _recipientClassName;
	private long _recipientClassPK;
	private int _recipientRoleType;
	private String _address;
	private long _columnBitmask;
	private KaleoNotificationRecipient _escapedModel;
}
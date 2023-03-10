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

package com.liferay.opensocial.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the OAuthToken service. Represents a row in the &quot;OpenSocial_OAuthToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.opensocial.model.impl.OAuthTokenModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.opensocial.model.impl.OAuthTokenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthToken
 * @see com.liferay.opensocial.model.impl.OAuthTokenImpl
 * @see com.liferay.opensocial.model.impl.OAuthTokenModelImpl
 * @generated
 */
public interface OAuthTokenModel extends AuditedModel, BaseModel<OAuthToken> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a o auth token model instance should use the {@link OAuthToken} interface instead.
	 */

	/**
	 * Returns the primary key of this o auth token.
	 *
	 * @return the primary key of this o auth token
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this o auth token.
	 *
	 * @param primaryKey the primary key of this o auth token
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the o auth token ID of this o auth token.
	 *
	 * @return the o auth token ID of this o auth token
	 */
	public long getOAuthTokenId();

	/**
	 * Sets the o auth token ID of this o auth token.
	 *
	 * @param oAuthTokenId the o auth token ID of this o auth token
	 */
	public void setOAuthTokenId(long oAuthTokenId);

	/**
	 * Returns the company ID of this o auth token.
	 *
	 * @return the company ID of this o auth token
	 */

	public long getCompanyId();

	/**
	 * Sets the company ID of this o auth token.
	 *
	 * @param companyId the company ID of this o auth token
	 */

	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this o auth token.
	 *
	 * @return the user ID of this o auth token
	 */

	public long getUserId();

	/**
	 * Sets the user ID of this o auth token.
	 *
	 * @param userId the user ID of this o auth token
	 */

	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this o auth token.
	 *
	 * @return the user uuid of this o auth token
	 */

	public String getUserUuid();

	/**
	 * Sets the user uuid of this o auth token.
	 *
	 * @param userUuid the user uuid of this o auth token
	 */

	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this o auth token.
	 *
	 * @return the user name of this o auth token
	 */
	@AutoEscape

	public String getUserName();

	/**
	 * Sets the user name of this o auth token.
	 *
	 * @param userName the user name of this o auth token
	 */

	public void setUserName(String userName);

	/**
	 * Returns the create date of this o auth token.
	 *
	 * @return the create date of this o auth token
	 */

	public Date getCreateDate();

	/**
	 * Sets the create date of this o auth token.
	 *
	 * @param createDate the create date of this o auth token
	 */

	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this o auth token.
	 *
	 * @return the modified date of this o auth token
	 */

	public Date getModifiedDate();

	/**
	 * Sets the modified date of this o auth token.
	 *
	 * @param modifiedDate the modified date of this o auth token
	 */

	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the gadget key of this o auth token.
	 *
	 * @return the gadget key of this o auth token
	 */
	@AutoEscape
	public String getGadgetKey();

	/**
	 * Sets the gadget key of this o auth token.
	 *
	 * @param gadgetKey the gadget key of this o auth token
	 */
	public void setGadgetKey(String gadgetKey);

	/**
	 * Returns the service name of this o auth token.
	 *
	 * @return the service name of this o auth token
	 */
	@AutoEscape
	public String getServiceName();

	/**
	 * Sets the service name of this o auth token.
	 *
	 * @param serviceName the service name of this o auth token
	 */
	public void setServiceName(String serviceName);

	/**
	 * Returns the module ID of this o auth token.
	 *
	 * @return the module ID of this o auth token
	 */
	public long getModuleId();

	/**
	 * Sets the module ID of this o auth token.
	 *
	 * @param moduleId the module ID of this o auth token
	 */
	public void setModuleId(long moduleId);

	/**
	 * Returns the access token of this o auth token.
	 *
	 * @return the access token of this o auth token
	 */
	@AutoEscape
	public String getAccessToken();

	/**
	 * Sets the access token of this o auth token.
	 *
	 * @param accessToken the access token of this o auth token
	 */
	public void setAccessToken(String accessToken);

	/**
	 * Returns the token name of this o auth token.
	 *
	 * @return the token name of this o auth token
	 */
	@AutoEscape
	public String getTokenName();

	/**
	 * Sets the token name of this o auth token.
	 *
	 * @param tokenName the token name of this o auth token
	 */
	public void setTokenName(String tokenName);

	/**
	 * Returns the token secret of this o auth token.
	 *
	 * @return the token secret of this o auth token
	 */
	@AutoEscape
	public String getTokenSecret();

	/**
	 * Sets the token secret of this o auth token.
	 *
	 * @param tokenSecret the token secret of this o auth token
	 */
	public void setTokenSecret(String tokenSecret);

	/**
	 * Returns the session handle of this o auth token.
	 *
	 * @return the session handle of this o auth token
	 */
	@AutoEscape
	public String getSessionHandle();

	/**
	 * Sets the session handle of this o auth token.
	 *
	 * @param sessionHandle the session handle of this o auth token
	 */
	public void setSessionHandle(String sessionHandle);

	/**
	 * Returns the expiration of this o auth token.
	 *
	 * @return the expiration of this o auth token
	 */
	public long getExpiration();

	/**
	 * Sets the expiration of this o auth token.
	 *
	 * @param expiration the expiration of this o auth token
	 */
	public void setExpiration(long expiration);


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


	public int compareTo(OAuthToken oAuthToken);


	public int hashCode();


	public CacheModel<OAuthToken> toCacheModel();


	public OAuthToken toEscapedModel();


	public OAuthToken toUnescapedModel();


	public String toString();


	public String toXmlString();
}
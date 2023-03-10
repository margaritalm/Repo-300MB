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

package com.liferay.opensocial.service.persistence;

import com.liferay.opensocial.model.OAuthToken;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the o auth token service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthTokenPersistenceImpl
 * @see OAuthTokenUtil
 * @generated
 */
public interface OAuthTokenPersistence extends BasePersistence<OAuthToken> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OAuthTokenUtil} to access the o auth token persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @return the matching o auth tokens
	*/
	public java.util.List<com.liferay.opensocial.model.OAuthToken> findByG_S(
		java.lang.String gadgetKey, java.lang.String serviceName);

	/**
	* Returns a range of all the o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.opensocial.model.impl.OAuthTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param start the lower bound of the range of o auth tokens
	* @param end the upper bound of the range of o auth tokens (not inclusive)
	* @return the range of matching o auth tokens
	*/
	public java.util.List<com.liferay.opensocial.model.OAuthToken> findByG_S(
		java.lang.String gadgetKey, java.lang.String serviceName, int start,
		int end);

	/**
	* Returns an ordered range of all the o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.opensocial.model.impl.OAuthTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param start the lower bound of the range of o auth tokens
	* @param end the upper bound of the range of o auth tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching o auth tokens
	*/
	public java.util.List<com.liferay.opensocial.model.OAuthToken> findByG_S(
		java.lang.String gadgetKey, java.lang.String serviceName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.opensocial.model.OAuthToken> orderByComparator);

	/**
	* Returns the first o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a matching o auth token could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken findByG_S_First(
		java.lang.String gadgetKey, java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.opensocial.model.OAuthToken> orderByComparator)
		throws com.liferay.opensocial.NoSuchOAuthTokenException;

	/**
	* Returns the first o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching o auth token, or <code>null</code> if a matching o auth token could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken fetchByG_S_First(
		java.lang.String gadgetKey, java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.opensocial.model.OAuthToken> orderByComparator);

	/**
	* Returns the last o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a matching o auth token could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken findByG_S_Last(
		java.lang.String gadgetKey, java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.opensocial.model.OAuthToken> orderByComparator)
		throws com.liferay.opensocial.NoSuchOAuthTokenException;

	/**
	* Returns the last o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching o auth token, or <code>null</code> if a matching o auth token could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken fetchByG_S_Last(
		java.lang.String gadgetKey, java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.opensocial.model.OAuthToken> orderByComparator);

	/**
	* Returns the o auth tokens before and after the current o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	*
	* @param oAuthTokenId the primary key of the current o auth token
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken[] findByG_S_PrevAndNext(
		long oAuthTokenId, java.lang.String gadgetKey,
		java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.opensocial.model.OAuthToken> orderByComparator)
		throws com.liferay.opensocial.NoSuchOAuthTokenException;

	/**
	* Removes all the o auth tokens where gadgetKey = &#63; and serviceName = &#63; from the database.
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	*/
	public void removeByG_S(java.lang.String gadgetKey,
		java.lang.String serviceName);

	/**
	* Returns the number of o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	*
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @return the number of matching o auth tokens
	*/
	public int countByG_S(java.lang.String gadgetKey,
		java.lang.String serviceName);

	/**
	* Returns the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or throws a {@link com.liferay.opensocial.NoSuchOAuthTokenException} if it could not be found.
	*
	* @param userId the user ID
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param moduleId the module ID
	* @param tokenName the token name
	* @return the matching o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a matching o auth token could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken findByU_G_S_M_T(
		long userId, java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName)
		throws com.liferay.opensocial.NoSuchOAuthTokenException;

	/**
	* Returns the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param moduleId the module ID
	* @param tokenName the token name
	* @return the matching o auth token, or <code>null</code> if a matching o auth token could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken fetchByU_G_S_M_T(
		long userId, java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName);

	/**
	* Returns the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param moduleId the module ID
	* @param tokenName the token name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching o auth token, or <code>null</code> if a matching o auth token could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken fetchByU_G_S_M_T(
		long userId, java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName, boolean retrieveFromCache);

	/**
	* Removes the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; from the database.
	*
	* @param userId the user ID
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param moduleId the module ID
	* @param tokenName the token name
	* @return the o auth token that was removed
	*/
	public com.liferay.opensocial.model.OAuthToken removeByU_G_S_M_T(
		long userId, java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName)
		throws com.liferay.opensocial.NoSuchOAuthTokenException;

	/**
	* Returns the number of o auth tokens where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63;.
	*
	* @param userId the user ID
	* @param gadgetKey the gadget key
	* @param serviceName the service name
	* @param moduleId the module ID
	* @param tokenName the token name
	* @return the number of matching o auth tokens
	*/
	public int countByU_G_S_M_T(long userId, java.lang.String gadgetKey,
		java.lang.String serviceName, long moduleId, java.lang.String tokenName);

	/**
	* Caches the o auth token in the entity cache if it is enabled.
	*
	* @param oAuthToken the o auth token
	*/
	public void cacheResult(com.liferay.opensocial.model.OAuthToken oAuthToken);

	/**
	* Caches the o auth tokens in the entity cache if it is enabled.
	*
	* @param oAuthTokens the o auth tokens
	*/
	public void cacheResult(
		java.util.List<com.liferay.opensocial.model.OAuthToken> oAuthTokens);

	/**
	* Creates a new o auth token with the primary key. Does not add the o auth token to the database.
	*
	* @param oAuthTokenId the primary key for the new o auth token
	* @return the new o auth token
	*/
	public com.liferay.opensocial.model.OAuthToken create(long oAuthTokenId);

	/**
	* Removes the o auth token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthTokenId the primary key of the o auth token
	* @return the o auth token that was removed
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken remove(long oAuthTokenId)
		throws com.liferay.opensocial.NoSuchOAuthTokenException;

	public com.liferay.opensocial.model.OAuthToken updateImpl(
		com.liferay.opensocial.model.OAuthToken oAuthToken);

	/**
	* Returns the o auth token with the primary key or throws a {@link com.liferay.opensocial.NoSuchOAuthTokenException} if it could not be found.
	*
	* @param oAuthTokenId the primary key of the o auth token
	* @return the o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken findByPrimaryKey(
		long oAuthTokenId)
		throws com.liferay.opensocial.NoSuchOAuthTokenException;

	/**
	* Returns the o auth token with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oAuthTokenId the primary key of the o auth token
	* @return the o auth token, or <code>null</code> if a o auth token with the primary key could not be found
	*/
	public com.liferay.opensocial.model.OAuthToken fetchByPrimaryKey(
		long oAuthTokenId);


	public java.util.Map<java.io.Serializable, com.liferay.opensocial.model.OAuthToken> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the o auth tokens.
	*
	* @return the o auth tokens
	*/
	public java.util.List<com.liferay.opensocial.model.OAuthToken> findAll();

	/**
	* Returns a range of all the o auth tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.opensocial.model.impl.OAuthTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o auth tokens
	* @param end the upper bound of the range of o auth tokens (not inclusive)
	* @return the range of o auth tokens
	*/
	public java.util.List<com.liferay.opensocial.model.OAuthToken> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the o auth tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.opensocial.model.impl.OAuthTokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o auth tokens
	* @param end the upper bound of the range of o auth tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o auth tokens
	*/
	public java.util.List<com.liferay.opensocial.model.OAuthToken> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.opensocial.model.OAuthToken> orderByComparator);

	/**
	* Removes all the o auth tokens from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of o auth tokens.
	*
	* @return the number of o auth tokens
	*/
	public int countAll();
}
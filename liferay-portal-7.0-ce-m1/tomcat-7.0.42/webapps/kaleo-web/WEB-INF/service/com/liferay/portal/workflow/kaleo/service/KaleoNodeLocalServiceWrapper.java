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

package com.liferay.portal.workflow.kaleo.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KaleoNodeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNodeLocalService
 * @generated
 */
public class KaleoNodeLocalServiceWrapper implements KaleoNodeLocalService,
	ServiceWrapper<KaleoNodeLocalService> {
	public KaleoNodeLocalServiceWrapper(
		KaleoNodeLocalService kaleoNodeLocalService) {
		_kaleoNodeLocalService = kaleoNodeLocalService;
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoNode addKaleoNode(
		long kaleoDefinitionId,
		com.liferay.portal.workflow.kaleo.definition.Node node,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoNodeLocalService.addKaleoNode(kaleoDefinitionId, node,
			serviceContext);
	}

	/**
	* Adds the kaleo node to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNode the kaleo node
	* @return the kaleo node that was added
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoNode addKaleoNode(
		com.liferay.portal.workflow.kaleo.model.KaleoNode kaleoNode) {
		return _kaleoNodeLocalService.addKaleoNode(kaleoNode);
	}

	/**
	* Creates a new kaleo node with the primary key. Does not add the kaleo node to the database.
	*
	* @param kaleoNodeId the primary key for the new kaleo node
	* @return the new kaleo node
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoNode createKaleoNode(
		long kaleoNodeId) {
		return _kaleoNodeLocalService.createKaleoNode(kaleoNodeId);
	}


	public void deleteCompanyKaleoNodes(long companyId) {
		_kaleoNodeLocalService.deleteCompanyKaleoNodes(companyId);
	}


	public void deleteKaleoDefinitionKaleoNodes(long kaleoDefinitionId) {
		_kaleoNodeLocalService.deleteKaleoDefinitionKaleoNodes(kaleoDefinitionId);
	}

	/**
	* Deletes the kaleo node from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNode the kaleo node
	* @return the kaleo node that was removed
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoNode deleteKaleoNode(
		com.liferay.portal.workflow.kaleo.model.KaleoNode kaleoNode) {
		return _kaleoNodeLocalService.deleteKaleoNode(kaleoNode);
	}

	/**
	* Deletes the kaleo node with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNodeId the primary key of the kaleo node
	* @return the kaleo node that was removed
	* @throws PortalException if a kaleo node with the primary key could not be found
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoNode deleteKaleoNode(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoNodeLocalService.deleteKaleoNode(kaleoNodeId);
	}

	/**
	* @throws PortalException
	*/

	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoNodeLocalService.deletePersistedModel(persistedModel);
	}


	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kaleoNodeLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/

	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _kaleoNodeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/

	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _kaleoNodeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/

	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _kaleoNodeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	*/

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _kaleoNodeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	*/

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _kaleoNodeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoNode fetchKaleoNode(
		long kaleoNodeId) {
		return _kaleoNodeLocalService.fetchKaleoNode(kaleoNodeId);
	}


	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _kaleoNodeLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/

	public java.lang.String getBeanIdentifier() {
		return _kaleoNodeLocalService.getBeanIdentifier();
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> getKaleoDefinitionKaleoNodes(
		long kaleoDefinitionId) {
		return _kaleoNodeLocalService.getKaleoDefinitionKaleoNodes(kaleoDefinitionId);
	}

	/**
	* Returns the kaleo node with the primary key.
	*
	* @param kaleoNodeId the primary key of the kaleo node
	* @return the kaleo node
	* @throws PortalException if a kaleo node with the primary key could not be found
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoNode getKaleoNode(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoNodeLocalService.getKaleoNode(kaleoNodeId);
	}

	/**
	* Returns a range of all the kaleo nodes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNodeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kaleo nodes
	* @param end the upper bound of the range of kaleo nodes (not inclusive)
	* @return the range of kaleo nodes
	*/

	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> getKaleoNodes(
		int start, int end) {
		return _kaleoNodeLocalService.getKaleoNodes(start, end);
	}

	/**
	* Returns the number of kaleo nodes.
	*
	* @return the number of kaleo nodes
	*/

	public int getKaleoNodesCount() {
		return _kaleoNodeLocalService.getKaleoNodesCount();
	}


	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoNodeLocalService.getPersistedModel(primaryKeyObj);
	}


	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kaleoNodeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/

	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_kaleoNodeLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Updates the kaleo node in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kaleoNode the kaleo node
	* @return the kaleo node that was updated
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoNode updateKaleoNode(
		com.liferay.portal.workflow.kaleo.model.KaleoNode kaleoNode) {
		return _kaleoNodeLocalService.updateKaleoNode(kaleoNode);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public KaleoNodeLocalService getWrappedKaleoNodeLocalService() {
		return _kaleoNodeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedKaleoNodeLocalService(
		KaleoNodeLocalService kaleoNodeLocalService) {
		_kaleoNodeLocalService = kaleoNodeLocalService;
	}


	public KaleoNodeLocalService getWrappedService() {
		return _kaleoNodeLocalService;
	}


	public void setWrappedService(KaleoNodeLocalService kaleoNodeLocalService) {
		_kaleoNodeLocalService = kaleoNodeLocalService;
	}

	private KaleoNodeLocalService _kaleoNodeLocalService;
}
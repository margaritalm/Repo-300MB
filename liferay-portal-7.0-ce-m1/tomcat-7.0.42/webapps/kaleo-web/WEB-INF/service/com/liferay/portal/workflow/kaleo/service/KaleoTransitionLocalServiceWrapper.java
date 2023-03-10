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
 * Provides a wrapper for {@link KaleoTransitionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTransitionLocalService
 * @generated
 */
public class KaleoTransitionLocalServiceWrapper
	implements KaleoTransitionLocalService,
		ServiceWrapper<KaleoTransitionLocalService> {
	public KaleoTransitionLocalServiceWrapper(
		KaleoTransitionLocalService kaleoTransitionLocalService) {
		_kaleoTransitionLocalService = kaleoTransitionLocalService;
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTransition addKaleoTransition(
		long kaleoDefinitionId, long kaleoNodeId,
		com.liferay.portal.workflow.kaleo.definition.Transition transition,
		com.liferay.portal.workflow.kaleo.model.KaleoNode sourceKaleoNode,
		com.liferay.portal.workflow.kaleo.model.KaleoNode targetKaleoNode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransitionLocalService.addKaleoTransition(kaleoDefinitionId,
			kaleoNodeId, transition, sourceKaleoNode, targetKaleoNode,
			serviceContext);
	}

	/**
	* Adds the kaleo transition to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition
	* @return the kaleo transition that was added
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition addKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition) {
		return _kaleoTransitionLocalService.addKaleoTransition(kaleoTransition);
	}

	/**
	* Creates a new kaleo transition with the primary key. Does not add the kaleo transition to the database.
	*
	* @param kaleoTransitionId the primary key for the new kaleo transition
	* @return the new kaleo transition
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition createKaleoTransition(
		long kaleoTransitionId) {
		return _kaleoTransitionLocalService.createKaleoTransition(kaleoTransitionId);
	}


	public void deleteCompanyKaleoTransitions(long companyId) {
		_kaleoTransitionLocalService.deleteCompanyKaleoTransitions(companyId);
	}


	public void deleteKaleoDefinitionKaleoTransitions(long kaleoDefinitionId) {
		_kaleoTransitionLocalService.deleteKaleoDefinitionKaleoTransitions(kaleoDefinitionId);
	}

	/**
	* Deletes the kaleo transition from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition
	* @return the kaleo transition that was removed
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition deleteKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition) {
		return _kaleoTransitionLocalService.deleteKaleoTransition(kaleoTransition);
	}

	/**
	* Deletes the kaleo transition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransitionId the primary key of the kaleo transition
	* @return the kaleo transition that was removed
	* @throws PortalException if a kaleo transition with the primary key could not be found
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition deleteKaleoTransition(
		long kaleoTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransitionLocalService.deleteKaleoTransition(kaleoTransitionId);
	}

	/**
	* @throws PortalException
	*/

	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransitionLocalService.deletePersistedModel(persistedModel);
	}


	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kaleoTransitionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/

	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _kaleoTransitionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kaleoTransitionLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kaleoTransitionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	*/

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _kaleoTransitionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _kaleoTransitionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTransition fetchKaleoTransition(
		long kaleoTransitionId) {
		return _kaleoTransitionLocalService.fetchKaleoTransition(kaleoTransitionId);
	}


	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _kaleoTransitionLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/

	public java.lang.String getBeanIdentifier() {
		return _kaleoTransitionLocalService.getBeanIdentifier();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTransition getDefaultKaleoTransition(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransitionLocalService.getDefaultKaleoTransition(kaleoNodeId);
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTransition> getKaleoDefinitionKaleoTransitions(
		long kaleoDefinitionId) {
		return _kaleoTransitionLocalService.getKaleoDefinitionKaleoTransitions(kaleoDefinitionId);
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTransition getKaleoTransition(
		long kaleoNodeId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransitionLocalService.getKaleoTransition(kaleoNodeId, name);
	}

	/**
	* Returns the kaleo transition with the primary key.
	*
	* @param kaleoTransitionId the primary key of the kaleo transition
	* @return the kaleo transition
	* @throws PortalException if a kaleo transition with the primary key could not be found
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition getKaleoTransition(
		long kaleoTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransitionLocalService.getKaleoTransition(kaleoTransitionId);
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTransition> getKaleoTransitions(
		long kaleoNodeId) {
		return _kaleoTransitionLocalService.getKaleoTransitions(kaleoNodeId);
	}

	/**
	* Returns a range of all the kaleo transitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTransitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kaleo transitions
	* @param end the upper bound of the range of kaleo transitions (not inclusive)
	* @return the range of kaleo transitions
	*/

	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTransition> getKaleoTransitions(
		int start, int end) {
		return _kaleoTransitionLocalService.getKaleoTransitions(start, end);
	}

	/**
	* Returns the number of kaleo transitions.
	*
	* @return the number of kaleo transitions
	*/

	public int getKaleoTransitionsCount() {
		return _kaleoTransitionLocalService.getKaleoTransitionsCount();
	}


	public int getKaleoTransitionsCount(long kaleoNodeId) {
		return _kaleoTransitionLocalService.getKaleoTransitionsCount(kaleoNodeId);
	}


	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTransitionLocalService.getPersistedModel(primaryKeyObj);
	}


	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kaleoTransitionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/

	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_kaleoTransitionLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Updates the kaleo transition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition
	* @return the kaleo transition that was updated
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTransition updateKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition) {
		return _kaleoTransitionLocalService.updateKaleoTransition(kaleoTransition);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public KaleoTransitionLocalService getWrappedKaleoTransitionLocalService() {
		return _kaleoTransitionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedKaleoTransitionLocalService(
		KaleoTransitionLocalService kaleoTransitionLocalService) {
		_kaleoTransitionLocalService = kaleoTransitionLocalService;
	}


	public KaleoTransitionLocalService getWrappedService() {
		return _kaleoTransitionLocalService;
	}


	public void setWrappedService(
		KaleoTransitionLocalService kaleoTransitionLocalService) {
		_kaleoTransitionLocalService = kaleoTransitionLocalService;
	}

	private KaleoTransitionLocalService _kaleoTransitionLocalService;
}
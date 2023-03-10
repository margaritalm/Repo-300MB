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
 * Provides a wrapper for {@link KaleoTaskAssignmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskAssignmentLocalService
 * @generated
 */
public class KaleoTaskAssignmentLocalServiceWrapper
	implements KaleoTaskAssignmentLocalService,
		ServiceWrapper<KaleoTaskAssignmentLocalService> {
	public KaleoTaskAssignmentLocalServiceWrapper(
		KaleoTaskAssignmentLocalService kaleoTaskAssignmentLocalService) {
		_kaleoTaskAssignmentLocalService = kaleoTaskAssignmentLocalService;
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment addKaleoTaskAssignment(
		java.lang.String kaleoClassName, long kaleoClassPK,
		long kaleoDefinitionId,
		com.liferay.portal.workflow.kaleo.definition.Assignment assignment,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTaskAssignmentLocalService.addKaleoTaskAssignment(kaleoClassName,
			kaleoClassPK, kaleoDefinitionId, assignment, serviceContext);
	}

	/**
	* Adds the kaleo task assignment to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTaskAssignment the kaleo task assignment
	* @return the kaleo task assignment that was added
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment addKaleoTaskAssignment(
		com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment kaleoTaskAssignment) {
		return _kaleoTaskAssignmentLocalService.addKaleoTaskAssignment(kaleoTaskAssignment);
	}

	/**
	* Creates a new kaleo task assignment with the primary key. Does not add the kaleo task assignment to the database.
	*
	* @param kaleoTaskAssignmentId the primary key for the new kaleo task assignment
	* @return the new kaleo task assignment
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment createKaleoTaskAssignment(
		long kaleoTaskAssignmentId) {
		return _kaleoTaskAssignmentLocalService.createKaleoTaskAssignment(kaleoTaskAssignmentId);
	}


	public void deleteCompanyKaleoTaskAssignments(long companyId) {
		_kaleoTaskAssignmentLocalService.deleteCompanyKaleoTaskAssignments(companyId);
	}


	public void deleteKaleoDefinitionKaleoTaskAssignments(
		long kaleoDefinitionId) {
		_kaleoTaskAssignmentLocalService.deleteKaleoDefinitionKaleoTaskAssignments(kaleoDefinitionId);
	}

	/**
	* Deletes the kaleo task assignment from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTaskAssignment the kaleo task assignment
	* @return the kaleo task assignment that was removed
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment deleteKaleoTaskAssignment(
		com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment kaleoTaskAssignment) {
		return _kaleoTaskAssignmentLocalService.deleteKaleoTaskAssignment(kaleoTaskAssignment);
	}

	/**
	* Deletes the kaleo task assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTaskAssignmentId the primary key of the kaleo task assignment
	* @return the kaleo task assignment that was removed
	* @throws PortalException if a kaleo task assignment with the primary key could not be found
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment deleteKaleoTaskAssignment(
		long kaleoTaskAssignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTaskAssignmentLocalService.deleteKaleoTaskAssignment(kaleoTaskAssignmentId);
	}

	/**
	* @throws PortalException
	*/

	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTaskAssignmentLocalService.deletePersistedModel(persistedModel);
	}


	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kaleoTaskAssignmentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/

	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _kaleoTaskAssignmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kaleoTaskAssignmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kaleoTaskAssignmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	*/

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _kaleoTaskAssignmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _kaleoTaskAssignmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment fetchKaleoTaskAssignment(
		long kaleoTaskAssignmentId) {
		return _kaleoTaskAssignmentLocalService.fetchKaleoTaskAssignment(kaleoTaskAssignmentId);
	}


	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _kaleoTaskAssignmentLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/

	public java.lang.String getBeanIdentifier() {
		return _kaleoTaskAssignmentLocalService.getBeanIdentifier();
	}

	/**
	* Returns the kaleo task assignment with the primary key.
	*
	* @param kaleoTaskAssignmentId the primary key of the kaleo task assignment
	* @return the kaleo task assignment
	* @throws PortalException if a kaleo task assignment with the primary key could not be found
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment getKaleoTaskAssignment(
		long kaleoTaskAssignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignment(kaleoTaskAssignmentId);
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment> getKaleoTaskAssignments(
		java.lang.String kaleoClassName, long kaleoClassPK) {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignments(kaleoClassName,
			kaleoClassPK);
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment> getKaleoTaskAssignments(
		long kaleoTaskId) {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignments(kaleoTaskId);
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment> getKaleoTaskAssignments(
		long kaleoTaskId, java.lang.String assigneeClassName) {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignments(kaleoTaskId,
			assigneeClassName);
	}

	/**
	* Returns a range of all the kaleo task assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kaleo task assignments
	* @param end the upper bound of the range of kaleo task assignments (not inclusive)
	* @return the range of kaleo task assignments
	*/

	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment> getKaleoTaskAssignments(
		int start, int end) {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignments(start,
			end);
	}

	/**
	* Returns the number of kaleo task assignments.
	*
	* @return the number of kaleo task assignments
	*/

	public int getKaleoTaskAssignmentsCount() {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignmentsCount();
	}


	public int getKaleoTaskAssignmentsCount(long kaleoTaskId) {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignmentsCount(kaleoTaskId);
	}


	public int getKaleoTaskAssignmentsCount(long kaleoTaskId,
		java.lang.String assigneeClassName) {
		return _kaleoTaskAssignmentLocalService.getKaleoTaskAssignmentsCount(kaleoTaskId,
			assigneeClassName);
	}


	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kaleoTaskAssignmentLocalService.getPersistedModel(primaryKeyObj);
	}


	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kaleoTaskAssignmentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/

	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_kaleoTaskAssignmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Updates the kaleo task assignment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kaleoTaskAssignment the kaleo task assignment
	* @return the kaleo task assignment that was updated
	*/

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment updateKaleoTaskAssignment(
		com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment kaleoTaskAssignment) {
		return _kaleoTaskAssignmentLocalService.updateKaleoTaskAssignment(kaleoTaskAssignment);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public KaleoTaskAssignmentLocalService getWrappedKaleoTaskAssignmentLocalService() {
		return _kaleoTaskAssignmentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedKaleoTaskAssignmentLocalService(
		KaleoTaskAssignmentLocalService kaleoTaskAssignmentLocalService) {
		_kaleoTaskAssignmentLocalService = kaleoTaskAssignmentLocalService;
	}


	public KaleoTaskAssignmentLocalService getWrappedService() {
		return _kaleoTaskAssignmentLocalService;
	}


	public void setWrappedService(
		KaleoTaskAssignmentLocalService kaleoTaskAssignmentLocalService) {
		_kaleoTaskAssignmentLocalService = kaleoTaskAssignmentLocalService;
	}

	private KaleoTaskAssignmentLocalService _kaleoTaskAssignmentLocalService;
}
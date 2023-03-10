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

package com.liferay.marketplace.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Module}.
 * </p>
 *
 * @author Ryan Park
 * @see Module
 * @generated
 */
public class ModuleWrapper implements Module, ModelWrapper<Module> {
	public ModuleWrapper(Module module) {
		_module = module;
	}


	public Class<?> getModelClass() {
		return Module.class;
	}


	public String getModelClassName() {
		return Module.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("moduleId", getModuleId());
		attributes.put("appId", getAppId());
		attributes.put("contextName", getContextName());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long moduleId = (Long)attributes.get("moduleId");

		if (moduleId != null) {
			setModuleId(moduleId);
		}

		Long appId = (Long)attributes.get("appId");

		if (appId != null) {
			setAppId(appId);
		}

		String contextName = (String)attributes.get("contextName");

		if (contextName != null) {
			setContextName(contextName);
		}
	}


	public java.lang.Object clone() {
		return new ModuleWrapper((Module)_module.clone());
	}


	public int compareTo(com.liferay.marketplace.model.Module module) {
		return _module.compareTo(module);
	}

	/**
	* Returns the app ID of this module.
	*
	* @return the app ID of this module
	*/

	public long getAppId() {
		return _module.getAppId();
	}

	/**
	* Returns the context name of this module.
	*
	* @return the context name of this module
	*/

	public java.lang.String getContextName() {
		return _module.getContextName();
	}


	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _module.getExpandoBridge();
	}

	/**
	* Returns the module ID of this module.
	*
	* @return the module ID of this module
	*/

	public long getModuleId() {
		return _module.getModuleId();
	}

	/**
	* Returns the primary key of this module.
	*
	* @return the primary key of this module
	*/

	public long getPrimaryKey() {
		return _module.getPrimaryKey();
	}


	public java.io.Serializable getPrimaryKeyObj() {
		return _module.getPrimaryKeyObj();
	}

	/**
	* Returns the uuid of this module.
	*
	* @return the uuid of this module
	*/

	public java.lang.String getUuid() {
		return _module.getUuid();
	}


	public int hashCode() {
		return _module.hashCode();
	}


	public boolean isCachedModel() {
		return _module.isCachedModel();
	}


	public boolean isEscapedModel() {
		return _module.isEscapedModel();
	}


	public boolean isNew() {
		return _module.isNew();
	}


	public void persist() {
		_module.persist();
	}

	/**
	* Sets the app ID of this module.
	*
	* @param appId the app ID of this module
	*/

	public void setAppId(long appId) {
		_module.setAppId(appId);
	}


	public void setCachedModel(boolean cachedModel) {
		_module.setCachedModel(cachedModel);
	}

	/**
	* Sets the context name of this module.
	*
	* @param contextName the context name of this module
	*/

	public void setContextName(java.lang.String contextName) {
		_module.setContextName(contextName);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_module.setExpandoBridgeAttributes(baseModel);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_module.setExpandoBridgeAttributes(expandoBridge);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_module.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the module ID of this module.
	*
	* @param moduleId the module ID of this module
	*/

	public void setModuleId(long moduleId) {
		_module.setModuleId(moduleId);
	}


	public void setNew(boolean n) {
		_module.setNew(n);
	}

	/**
	* Sets the primary key of this module.
	*
	* @param primaryKey the primary key of this module
	*/

	public void setPrimaryKey(long primaryKey) {
		_module.setPrimaryKey(primaryKey);
	}


	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_module.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the uuid of this module.
	*
	* @param uuid the uuid of this module
	*/

	public void setUuid(java.lang.String uuid) {
		_module.setUuid(uuid);
	}


	public com.liferay.portal.model.CacheModel<com.liferay.marketplace.model.Module> toCacheModel() {
		return _module.toCacheModel();
	}


	public com.liferay.marketplace.model.Module toEscapedModel() {
		return new ModuleWrapper(_module.toEscapedModel());
	}


	public java.lang.String toString() {
		return _module.toString();
	}


	public com.liferay.marketplace.model.Module toUnescapedModel() {
		return new ModuleWrapper(_module.toUnescapedModel());
	}


	public java.lang.String toXmlString() {
		return _module.toXmlString();
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ModuleWrapper)) {
			return false;
		}

		ModuleWrapper moduleWrapper = (ModuleWrapper)obj;

		if (Validator.equals(_module, moduleWrapper._module)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public Module getWrappedModule() {
		return _module;
	}


	public Module getWrappedModel() {
		return _module;
	}


	public boolean isEntityCacheEnabled() {
		return _module.isEntityCacheEnabled();
	}


	public boolean isFinderCacheEnabled() {
		return _module.isFinderCacheEnabled();
	}


	public void resetOriginalValues() {
		_module.resetOriginalValues();
	}

	private Module _module;
}
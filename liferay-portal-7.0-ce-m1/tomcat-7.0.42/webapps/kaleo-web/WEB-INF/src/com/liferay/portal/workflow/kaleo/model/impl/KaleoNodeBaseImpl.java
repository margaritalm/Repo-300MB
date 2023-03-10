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

import com.liferay.portal.workflow.kaleo.model.KaleoNode;
import com.liferay.portal.workflow.kaleo.service.KaleoNodeLocalServiceUtil;

/**
 * The extended model base implementation for the KaleoNode service. Represents a row in the &quot;KaleoNode&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoNodeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNodeImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoNode
 * @generated
 */
public abstract class KaleoNodeBaseImpl extends KaleoNodeModelImpl
	implements KaleoNode {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo node model instance should use the {@link KaleoNode} interface instead.
	 */

	public void persist() {
		if (this.isNew()) {
			KaleoNodeLocalServiceUtil.addKaleoNode(this);
		}
		else {
			KaleoNodeLocalServiceUtil.updateKaleoNode(this);
		}
	}
}
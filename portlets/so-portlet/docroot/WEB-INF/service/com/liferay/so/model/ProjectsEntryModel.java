/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.so.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ProjectsEntry service. Represents a row in the &quot;SO_ProjectsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.so.model.impl.ProjectsEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.so.model.impl.ProjectsEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectsEntry
 * @see com.liferay.so.model.impl.ProjectsEntryImpl
 * @see com.liferay.so.model.impl.ProjectsEntryModelImpl
 * @generated
 */
public interface ProjectsEntryModel extends BaseModel<ProjectsEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a projects entry model instance should use the {@link ProjectsEntry} interface instead.
	 */

	/**
	 * Gets the primary key of this projects entry.
	 *
	 * @return the primary key of this projects entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this projects entry
	 *
	 * @param pk the primary key of this projects entry
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the projects entry ID of this projects entry.
	 *
	 * @return the projects entry ID of this projects entry
	 */
	public long getProjectsEntryId();

	/**
	 * Sets the projects entry ID of this projects entry.
	 *
	 * @param projectsEntryId the projects entry ID of this projects entry
	 */
	public void setProjectsEntryId(long projectsEntryId);

	/**
	 * Gets the company ID of this projects entry.
	 *
	 * @return the company ID of this projects entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this projects entry.
	 *
	 * @param companyId the company ID of this projects entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this projects entry.
	 *
	 * @return the user ID of this projects entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this projects entry.
	 *
	 * @param userId the user ID of this projects entry
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this projects entry.
	 *
	 * @return the user uuid of this projects entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this projects entry.
	 *
	 * @param userUuid the user uuid of this projects entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this projects entry.
	 *
	 * @return the user name of this projects entry
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this projects entry.
	 *
	 * @param userName the user name of this projects entry
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this projects entry.
	 *
	 * @return the create date of this projects entry
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this projects entry.
	 *
	 * @param createDate the create date of this projects entry
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this projects entry.
	 *
	 * @return the modified date of this projects entry
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this projects entry.
	 *
	 * @param modifiedDate the modified date of this projects entry
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the title of this projects entry.
	 *
	 * @return the title of this projects entry
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this projects entry.
	 *
	 * @param title the title of this projects entry
	 */
	public void setTitle(String title);

	/**
	 * Gets the description of this projects entry.
	 *
	 * @return the description of this projects entry
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this projects entry.
	 *
	 * @param description the description of this projects entry
	 */
	public void setDescription(String description);

	/**
	 * Gets the start date of this projects entry.
	 *
	 * @return the start date of this projects entry
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this projects entry.
	 *
	 * @param startDate the start date of this projects entry
	 */
	public void setStartDate(Date startDate);

	/**
	 * Gets the end date of this projects entry.
	 *
	 * @return the end date of this projects entry
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this projects entry.
	 *
	 * @param endDate the end date of this projects entry
	 */
	public void setEndDate(Date endDate);

	/**
	 * Gets the data of this projects entry.
	 *
	 * @return the data of this projects entry
	 */
	@AutoEscape
	public String getData();

	/**
	 * Sets the data of this projects entry.
	 *
	 * @param data the data of this projects entry
	 */
	public void setData(String data);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(ProjectsEntry projectsEntry);

	public int hashCode();

	public ProjectsEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}
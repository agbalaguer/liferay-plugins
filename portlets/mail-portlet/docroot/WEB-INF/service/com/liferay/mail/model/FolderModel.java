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

package com.liferay.mail.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Folder service. Represents a row in the &quot;Mail_Folder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.mail.model.impl.FolderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.mail.model.impl.FolderImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Folder
 * @see com.liferay.mail.model.impl.FolderImpl
 * @see com.liferay.mail.model.impl.FolderModelImpl
 * @generated
 */
public interface FolderModel extends BaseModel<Folder> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a folder model instance should use the {@link Folder} interface instead.
	 */

	/**
	 * Gets the primary key of this folder.
	 *
	 * @return the primary key of this folder
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this folder
	 *
	 * @param pk the primary key of this folder
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the folder ID of this folder.
	 *
	 * @return the folder ID of this folder
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this folder.
	 *
	 * @param folderId the folder ID of this folder
	 */
	public void setFolderId(long folderId);

	/**
	 * Gets the company ID of this folder.
	 *
	 * @return the company ID of this folder
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this folder.
	 *
	 * @param companyId the company ID of this folder
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this folder.
	 *
	 * @return the user ID of this folder
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this folder.
	 *
	 * @param userId the user ID of this folder
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this folder.
	 *
	 * @return the user uuid of this folder
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this folder.
	 *
	 * @param userUuid the user uuid of this folder
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this folder.
	 *
	 * @return the user name of this folder
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this folder.
	 *
	 * @param userName the user name of this folder
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this folder.
	 *
	 * @return the create date of this folder
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this folder.
	 *
	 * @param createDate the create date of this folder
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this folder.
	 *
	 * @return the modified date of this folder
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this folder.
	 *
	 * @param modifiedDate the modified date of this folder
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the account ID of this folder.
	 *
	 * @return the account ID of this folder
	 */
	public long getAccountId();

	/**
	 * Sets the account ID of this folder.
	 *
	 * @param accountId the account ID of this folder
	 */
	public void setAccountId(long accountId);

	/**
	 * Gets the full name of this folder.
	 *
	 * @return the full name of this folder
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this folder.
	 *
	 * @param fullName the full name of this folder
	 */
	public void setFullName(String fullName);

	/**
	 * Gets the display name of this folder.
	 *
	 * @return the display name of this folder
	 */
	@AutoEscape
	public String getDisplayName();

	/**
	 * Sets the display name of this folder.
	 *
	 * @param displayName the display name of this folder
	 */
	public void setDisplayName(String displayName);

	/**
	 * Gets the remote message count of this folder.
	 *
	 * @return the remote message count of this folder
	 */
	public int getRemoteMessageCount();

	/**
	 * Sets the remote message count of this folder.
	 *
	 * @param remoteMessageCount the remote message count of this folder
	 */
	public void setRemoteMessageCount(int remoteMessageCount);

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

	public int compareTo(Folder folder);

	public int hashCode();

	public Folder toEscapedModel();

	public String toString();

	public String toXmlString();
}
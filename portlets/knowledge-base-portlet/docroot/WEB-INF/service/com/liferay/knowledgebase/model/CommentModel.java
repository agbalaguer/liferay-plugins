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

package com.liferay.knowledgebase.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Comment service. Represents a row in the &quot;KB_Comment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.knowledgebase.model.impl.CommentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.knowledgebase.model.impl.CommentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Comment
 * @see com.liferay.knowledgebase.model.impl.CommentImpl
 * @see com.liferay.knowledgebase.model.impl.CommentModelImpl
 * @generated
 */
public interface CommentModel extends BaseModel<Comment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a comment model instance should use the {@link Comment} interface instead.
	 */

	/**
	 * Gets the primary key of this comment.
	 *
	 * @return the primary key of this comment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this comment
	 *
	 * @param pk the primary key of this comment
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this comment.
	 *
	 * @return the uuid of this comment
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this comment.
	 *
	 * @param uuid the uuid of this comment
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the comment ID of this comment.
	 *
	 * @return the comment ID of this comment
	 */
	public long getCommentId();

	/**
	 * Sets the comment ID of this comment.
	 *
	 * @param commentId the comment ID of this comment
	 */
	public void setCommentId(long commentId);

	/**
	 * Gets the group ID of this comment.
	 *
	 * @return the group ID of this comment
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this comment.
	 *
	 * @param groupId the group ID of this comment
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this comment.
	 *
	 * @return the company ID of this comment
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this comment.
	 *
	 * @param companyId the company ID of this comment
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this comment.
	 *
	 * @return the user ID of this comment
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this comment.
	 *
	 * @param userId the user ID of this comment
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this comment.
	 *
	 * @return the user uuid of this comment
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this comment.
	 *
	 * @param userUuid the user uuid of this comment
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this comment.
	 *
	 * @return the user name of this comment
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this comment.
	 *
	 * @param userName the user name of this comment
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this comment.
	 *
	 * @return the create date of this comment
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this comment.
	 *
	 * @param createDate the create date of this comment
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this comment.
	 *
	 * @return the modified date of this comment
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this comment.
	 *
	 * @param modifiedDate the modified date of this comment
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the class name of the model instance this comment is polymorphically associated with.
	 *
	 * @return the class name of the model instance this comment is polymorphically associated with
	 */
	public String getClassName();

	/**
	 * Gets the class name ID of this comment.
	 *
	 * @return the class name ID of this comment
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this comment.
	 *
	 * @param classNameId the class name ID of this comment
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Gets the class p k of this comment.
	 *
	 * @return the class p k of this comment
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this comment.
	 *
	 * @param classPK the class p k of this comment
	 */
	public void setClassPK(long classPK);

	/**
	 * Gets the content of this comment.
	 *
	 * @return the content of this comment
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this comment.
	 *
	 * @param content the content of this comment
	 */
	public void setContent(String content);

	/**
	 * Gets the helpful of this comment.
	 *
	 * @return the helpful of this comment
	 */
	public boolean getHelpful();

	/**
	 * Determines if this comment is helpful.
	 *
	 * @return <code>true</code> if this comment is helpful; <code>false</code> otherwise
	 */
	public boolean isHelpful();

	/**
	 * Sets whether this comment is helpful.
	 *
	 * @param helpful the helpful of this comment
	 */
	public void setHelpful(boolean helpful);

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

	public int compareTo(Comment comment);

	public int hashCode();

	public Comment toEscapedModel();

	public String toString();

	public String toXmlString();
}
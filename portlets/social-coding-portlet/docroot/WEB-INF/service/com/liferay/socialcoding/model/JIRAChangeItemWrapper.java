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

package com.liferay.socialcoding.model;

/**
 * <p>
 * This class is a wrapper for {@link JIRAChangeItem}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       JIRAChangeItem
 * @generated
 */
public class JIRAChangeItemWrapper implements JIRAChangeItem {
	public JIRAChangeItemWrapper(JIRAChangeItem jiraChangeItem) {
		_jiraChangeItem = jiraChangeItem;
	}

	/**
	* Gets the primary key of this j i r a change item.
	*
	* @return the primary key of this j i r a change item
	*/
	public long getPrimaryKey() {
		return _jiraChangeItem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this j i r a change item
	*
	* @param pk the primary key of this j i r a change item
	*/
	public void setPrimaryKey(long pk) {
		_jiraChangeItem.setPrimaryKey(pk);
	}

	/**
	* Gets the jira change item ID of this j i r a change item.
	*
	* @return the jira change item ID of this j i r a change item
	*/
	public long getJiraChangeItemId() {
		return _jiraChangeItem.getJiraChangeItemId();
	}

	/**
	* Sets the jira change item ID of this j i r a change item.
	*
	* @param jiraChangeItemId the jira change item ID of this j i r a change item
	*/
	public void setJiraChangeItemId(long jiraChangeItemId) {
		_jiraChangeItem.setJiraChangeItemId(jiraChangeItemId);
	}

	/**
	* Gets the jira change group ID of this j i r a change item.
	*
	* @return the jira change group ID of this j i r a change item
	*/
	public long getJiraChangeGroupId() {
		return _jiraChangeItem.getJiraChangeGroupId();
	}

	/**
	* Sets the jira change group ID of this j i r a change item.
	*
	* @param jiraChangeGroupId the jira change group ID of this j i r a change item
	*/
	public void setJiraChangeGroupId(long jiraChangeGroupId) {
		_jiraChangeItem.setJiraChangeGroupId(jiraChangeGroupId);
	}

	/**
	* Gets the field of this j i r a change item.
	*
	* @return the field of this j i r a change item
	*/
	public java.lang.String getField() {
		return _jiraChangeItem.getField();
	}

	/**
	* Sets the field of this j i r a change item.
	*
	* @param field the field of this j i r a change item
	*/
	public void setField(java.lang.String field) {
		_jiraChangeItem.setField(field);
	}

	/**
	* Gets the old value of this j i r a change item.
	*
	* @return the old value of this j i r a change item
	*/
	public java.lang.String getOldValue() {
		return _jiraChangeItem.getOldValue();
	}

	/**
	* Sets the old value of this j i r a change item.
	*
	* @param oldValue the old value of this j i r a change item
	*/
	public void setOldValue(java.lang.String oldValue) {
		_jiraChangeItem.setOldValue(oldValue);
	}

	/**
	* Gets the old string of this j i r a change item.
	*
	* @return the old string of this j i r a change item
	*/
	public java.lang.String getOldString() {
		return _jiraChangeItem.getOldString();
	}

	/**
	* Sets the old string of this j i r a change item.
	*
	* @param oldString the old string of this j i r a change item
	*/
	public void setOldString(java.lang.String oldString) {
		_jiraChangeItem.setOldString(oldString);
	}

	/**
	* Gets the new value of this j i r a change item.
	*
	* @return the new value of this j i r a change item
	*/
	public java.lang.String getNewValue() {
		return _jiraChangeItem.getNewValue();
	}

	/**
	* Sets the new value of this j i r a change item.
	*
	* @param newValue the new value of this j i r a change item
	*/
	public void setNewValue(java.lang.String newValue) {
		_jiraChangeItem.setNewValue(newValue);
	}

	/**
	* Gets the new string of this j i r a change item.
	*
	* @return the new string of this j i r a change item
	*/
	public java.lang.String getNewString() {
		return _jiraChangeItem.getNewString();
	}

	/**
	* Sets the new string of this j i r a change item.
	*
	* @param newString the new string of this j i r a change item
	*/
	public void setNewString(java.lang.String newString) {
		_jiraChangeItem.setNewString(newString);
	}

	public boolean isNew() {
		return _jiraChangeItem.isNew();
	}

	public void setNew(boolean n) {
		_jiraChangeItem.setNew(n);
	}

	public boolean isCachedModel() {
		return _jiraChangeItem.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_jiraChangeItem.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _jiraChangeItem.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_jiraChangeItem.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _jiraChangeItem.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _jiraChangeItem.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_jiraChangeItem.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new JIRAChangeItemWrapper((JIRAChangeItem)_jiraChangeItem.clone());
	}

	public int compareTo(
		com.liferay.socialcoding.model.JIRAChangeItem jiraChangeItem) {
		return _jiraChangeItem.compareTo(jiraChangeItem);
	}

	public int hashCode() {
		return _jiraChangeItem.hashCode();
	}

	public com.liferay.socialcoding.model.JIRAChangeItem toEscapedModel() {
		return new JIRAChangeItemWrapper(_jiraChangeItem.toEscapedModel());
	}

	public java.lang.String toString() {
		return _jiraChangeItem.toString();
	}

	public java.lang.String toXmlString() {
		return _jiraChangeItem.toXmlString();
	}

	public JIRAChangeItem getWrappedJIRAChangeItem() {
		return _jiraChangeItem;
	}

	private JIRAChangeItem _jiraChangeItem;
}
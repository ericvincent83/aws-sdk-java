/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains project summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ProjectSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the project.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The project's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param id
     *        The ID of the project.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @return The ID of the project.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param id
     *        The ID of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param name
     *        The name of the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @return The name of the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param name
     *        The name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The project's description.
     * </p>
     * 
     * @param description
     *        The project's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The project's description.
     * </p>
     * 
     * @return The project's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The project's description.
     * </p>
     * 
     * @param description
     *        The project's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the project was created, in Unix epoch time.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the project was created, in Unix epoch time.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the project was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the project was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the project was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the project was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the project was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the project was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectSummary == false)
            return false;
        ProjectSummary other = (ProjectSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public ProjectSummary clone() {
        try {
            return (ProjectSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ProjectSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

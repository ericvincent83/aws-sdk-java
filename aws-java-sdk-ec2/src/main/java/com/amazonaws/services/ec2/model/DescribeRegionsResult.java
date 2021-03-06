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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Region> regions;

    /**
     * <p>
     * Information about the Regions.
     * </p>
     * 
     * @return Information about the Regions.
     */

    public java.util.List<Region> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<Region>();
        }
        return regions;
    }

    /**
     * <p>
     * Information about the Regions.
     * </p>
     * 
     * @param regions
     *        Information about the Regions.
     */

    public void setRegions(java.util.Collection<Region> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<Region>(regions);
    }

    /**
     * <p>
     * Information about the Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        Information about the Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsResult withRegions(Region... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<Region>(regions.length));
        }
        for (Region ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Regions.
     * </p>
     * 
     * @param regions
     *        Information about the Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsResult withRegions(java.util.Collection<Region> regions) {
        setRegions(regions);
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
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegionsResult == false)
            return false;
        DescribeRegionsResult other = (DescribeRegionsResult) obj;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegionsResult clone() {
        try {
            return (DescribeRegionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

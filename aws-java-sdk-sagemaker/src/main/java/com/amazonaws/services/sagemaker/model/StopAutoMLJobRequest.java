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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopAutoMLJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopAutoMLJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     */
    private String autoMLJobName;

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * 
     * @param autoMLJobName
     *        The name of the object you are requesting.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * 
     * @return The name of the object you are requesting.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * 
     * @param autoMLJobName
     *        The name of the object you are requesting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopAutoMLJobRequest withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: ").append(getAutoMLJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopAutoMLJobRequest == false)
            return false;
        StopAutoMLJobRequest other = (StopAutoMLJobRequest) obj;
        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        return hashCode;
    }

    @Override
    public StopAutoMLJobRequest clone() {
        return (StopAutoMLJobRequest) super.clone();
    }

}

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
package com.amazonaws.services.iot1clickdevices.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalFailureException extends com.amazonaws.services.iot1clickdevices.model.AWSIoT1ClickDevicesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * 500
     * </p>
     */
    private String code;

    /**
     * Constructs a new InternalFailureException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalFailureException(String message) {
        super(message);
    }

    /**
     * <p>
     * 500
     * </p>
     * 
     * @param code
     *        500
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * 500
     * </p>
     * 
     * @return 500
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * 500
     * </p>
     * 
     * @param code
     *        500
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalFailureException withCode(String code) {
        setCode(code);
        return this;
    }

}

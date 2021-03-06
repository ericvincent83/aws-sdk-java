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
package com.amazonaws.services.prometheus.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.prometheus.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkspaceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspaceSummaryMarshaller {

    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alias").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("status").build();
    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workspaceId").build();

    private static final WorkspaceSummaryMarshaller instance = new WorkspaceSummaryMarshaller();

    public static WorkspaceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkspaceSummary workspaceSummary, ProtocolMarshaller protocolMarshaller) {

        if (workspaceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspaceSummary.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(workspaceSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(workspaceSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(workspaceSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workspaceSummary.getWorkspaceId(), WORKSPACEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.cloudfront.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RealtimeLogConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealtimeLogConfigStaxUnmarshaller implements Unmarshaller<RealtimeLogConfig, StaxUnmarshallerContext> {

    public RealtimeLogConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        RealtimeLogConfig realtimeLogConfig = new RealtimeLogConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return realtimeLogConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ARN", targetDepth)) {
                    realtimeLogConfig.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Name", targetDepth)) {
                    realtimeLogConfig.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SamplingRate", targetDepth)) {
                    realtimeLogConfig.setSamplingRate(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndPoints", targetDepth)) {
                    realtimeLogConfig.withEndPoints(new ArrayList<EndPoint>());
                    continue;
                }

                if (context.testExpression("EndPoints/member", targetDepth)) {
                    realtimeLogConfig.withEndPoints(EndPointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Fields", targetDepth)) {
                    realtimeLogConfig.withFields(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Fields/Field", targetDepth)) {
                    realtimeLogConfig.withFields(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return realtimeLogConfig;
                }
            }
        }
    }

    private static RealtimeLogConfigStaxUnmarshaller instance;

    public static RealtimeLogConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RealtimeLogConfigStaxUnmarshaller();
        return instance;
    }
}

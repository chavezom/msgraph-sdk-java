// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Scheduled Action For Rule Collection Page.
 */
public class BaseDeviceComplianceScheduledActionForRuleCollectionPage extends BaseCollectionPage<DeviceComplianceScheduledActionForRule, IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder> implements IBaseDeviceComplianceScheduledActionForRuleCollectionPage {

    /**
     * A collection page for DeviceComplianceScheduledActionForRule
     *
     * @param response the serialized BaseDeviceComplianceScheduledActionForRuleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceComplianceScheduledActionForRuleCollectionPage(final BaseDeviceComplianceScheduledActionForRuleCollectionResponse response, final IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseReportRootGetOneDriveUsageAccountDetailRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Report Root Get One Drive Usage Account Detail Request Builder.
 */
public class ReportRootGetOneDriveUsageAccountDetailRequestBuilder extends BaseReportRootGetOneDriveUsageAccountDetailRequestBuilder implements IReportRootGetOneDriveUsageAccountDetailRequestBuilder {

    /**
     * The request builder for this ReportRootGetOneDriveUsageAccountDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public ReportRootGetOneDriveUsageAccountDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.microsoft.graph.models.extensions.DateOnly date) {
        super(requestUrl, client, requestOptions, date);
    }

    /**
     * The request builder for this ReportRootGetOneDriveUsageAccountDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetOneDriveUsageAccountDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions, period);
    }
}

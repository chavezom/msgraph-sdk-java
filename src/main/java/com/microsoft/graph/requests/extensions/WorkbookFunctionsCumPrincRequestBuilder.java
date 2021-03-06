// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsCumPrincRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Cum Princ Request Builder.
 */
public class WorkbookFunctionsCumPrincRequestBuilder extends BaseWorkbookFunctionsCumPrincRequestBuilder implements IWorkbookFunctionsCumPrincRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCumPrinc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param nper the nper
     * @param pv the pv
     * @param startPeriod the startPeriod
     * @param endPeriod the endPeriod
     * @param type the type
     */
    public WorkbookFunctionsCumPrincRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement startPeriod, final com.google.gson.JsonElement endPeriod, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions, rate, nper, pv, startPeriod, endPeriod, type);
    }
}

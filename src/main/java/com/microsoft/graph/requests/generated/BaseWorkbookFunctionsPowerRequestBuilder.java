// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPowerRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPowerRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Power Request Builder.
 */
public class BaseWorkbookFunctionsPowerRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPower
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param power the power
     */
    public BaseWorkbookFunctionsPowerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement power) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("power", power);
    }

    /**
     * Creates the IWorkbookFunctionsPowerRequest
     *
     * @return the IWorkbookFunctionsPowerRequest instance
     */
    public IWorkbookFunctionsPowerRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPowerRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPowerRequest instance
     */
    public IWorkbookFunctionsPowerRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPowerRequest request = new WorkbookFunctionsPowerRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("power")) {
            request.body.power = getParameter("power");
        }

        return request;
    }
}

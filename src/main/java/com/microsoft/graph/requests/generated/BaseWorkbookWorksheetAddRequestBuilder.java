// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetAddRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetAddRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Worksheet Add Request Builder.
 */
public class BaseWorkbookWorksheetAddRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     */
    public BaseWorkbookWorksheetAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("name", name);
    }

    /**
     * Creates the IWorkbookWorksheetAddRequest
     *
     * @return the IWorkbookWorksheetAddRequest instance
     */
    public IWorkbookWorksheetAddRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetAddRequest instance
     */
    public IWorkbookWorksheetAddRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookWorksheetAddRequest request = new WorkbookWorksheetAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        return request;
    }
}

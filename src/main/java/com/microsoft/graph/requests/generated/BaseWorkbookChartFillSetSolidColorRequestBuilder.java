// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Fill Set Solid Color Request Builder.
 */
public class BaseWorkbookChartFillSetSolidColorRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookChartFillSetSolidColor
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param color the color
     */
    public BaseWorkbookChartFillSetSolidColorRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String color) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("color", color);
    }

    /**
     * Creates the IWorkbookChartFillSetSolidColorRequest
     *
     * @return the IWorkbookChartFillSetSolidColorRequest instance
     */
    public IWorkbookChartFillSetSolidColorRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartFillSetSolidColorRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartFillSetSolidColorRequest instance
     */
    public IWorkbookChartFillSetSolidColorRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartFillSetSolidColorRequest request = new WorkbookChartFillSetSolidColorRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("color")) {
            request.body.color = getParameter("color");
        }

        return request;
    }
}

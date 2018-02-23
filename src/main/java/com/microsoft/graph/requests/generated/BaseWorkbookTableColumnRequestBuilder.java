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
 * The class for the Base Workbook Table Column Request Builder.
 */
public class BaseWorkbookTableColumnRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableColumnRequestBuilder {

    /**
     * The request builder for the WorkbookTableColumn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableColumnRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookTableColumnRequest instance
     */
    public IWorkbookTableColumnRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableColumnRequest instance
     */
    public IWorkbookTableColumnRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookTableColumnRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookFilter
     *
     * @return the IWorkbookFilterRequestBuilder instance
     */
    public IWorkbookFilterRequestBuilder filter() {
        return new WorkbookFilterRequestBuilder(getRequestUrlWithAdditionalSegment("filter"), getClient(), null);
    }

    public IWorkbookTableColumnDataBodyRangeRequestBuilder dataBodyRange() {
        return new WorkbookTableColumnDataBodyRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dataBodyRange"), getClient(), null);
    }

    public IWorkbookTableColumnHeaderRowRangeRequestBuilder headerRowRange() {
        return new WorkbookTableColumnHeaderRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.headerRowRange"), getClient(), null);
    }

    public IWorkbookTableColumnRangeRequestBuilder range() {
        return new WorkbookTableColumnRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    public IWorkbookTableColumnTotalRowRangeRequestBuilder totalRowRange() {
        return new WorkbookTableColumnTotalRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.totalRowRange"), getClient(), null);
    }
}

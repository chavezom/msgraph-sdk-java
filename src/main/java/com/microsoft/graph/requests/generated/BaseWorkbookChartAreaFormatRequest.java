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
 * The class for the Base Workbook Chart Area Format Request.
 */
public class BaseWorkbookChartAreaFormatRequest extends BaseRequest implements IBaseWorkbookChartAreaFormatRequest {

    /**
     * The request for the WorkbookChartAreaFormat
     *
     * @param requestUrl The request URL
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the response
     */
    public BaseWorkbookChartAreaFormatRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookChartAreaFormat> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartAreaFormat from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartAreaFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAreaFormat from the service
     * @return The WorkbookChartAreaFormat from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartAreaFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookChartAreaFormat with a source
     * @param sourceWorkbookChartAreaFormat The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookChartAreaFormat sourceWorkbookChartAreaFormat, final ICallback<WorkbookChartAreaFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAreaFormat);
    }

    /**
     * Patches this WorkbookChartAreaFormat with a source
     * @param sourceWorkbookChartAreaFormat The source object with updates
     * @return The updated WorkbookChartAreaFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartAreaFormat patch(final WorkbookChartAreaFormat sourceWorkbookChartAreaFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAreaFormat);
    }

    /**
     * Creates a WorkbookChartAreaFormat with a new object
     * @param newWorkbookChartAreaFormat The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookChartAreaFormat newWorkbookChartAreaFormat, final ICallback<WorkbookChartAreaFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAreaFormat);
    }

    /**
     * Creates a WorkbookChartAreaFormat with a new object
     * @param newWorkbookChartAreaFormat The new object to create
     * @return The created WorkbookChartAreaFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartAreaFormat post(final WorkbookChartAreaFormat newWorkbookChartAreaFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAreaFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookChartAreaFormatRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartAreaFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookChartAreaFormatRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartAreaFormatRequest)this;
     }

}


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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Point Item At Request.
 */
public interface IBaseWorkbookChartPointItemAtRequest {

    /**
     * Patches the WorkbookChartPointItemAt
     *
     * @param srcWorkbookChartPoint the WorkbookChartPoint with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(WorkbookChartPoint srcWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback);

    /**
     * Patches the WorkbookChartPointItemAt
     *
     * @param srcWorkbookChartPoint the WorkbookChartPoint with which to PATCH
     * @return the WorkbookChartPoint
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChartPoint patch(WorkbookChartPoint srcWorkbookChartPoint) throws ClientException;

    /**
     * Puts the WorkbookChartPointItemAt
     *
     * @param srcWorkbookChartPoint the WorkbookChartPoint to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookChartPoint srcWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback);

    /**
     * Puts the WorkbookChartPointItemAt
     *
     * @param srcWorkbookChartPoint the WorkbookChartPoint to PUT
     * @return the WorkbookChartPoint
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     WorkbookChartPoint put(WorkbookChartPoint srcWorkbookChartPoint) throws ClientException;
    /**
     * Gets the WorkbookChartPoint
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookChartPoint> callback);

    /**
     * Gets the WorkbookChartPoint
     *
     * @return the WorkbookChartPoint
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChartPoint get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartPointItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartPointItemAtRequest expand(final String value);

}

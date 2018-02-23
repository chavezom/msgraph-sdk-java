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
 * The interface for the Base Workbook Chart Item Request.
 */
public interface IBaseWorkbookChartItemRequest {

    /**
     * Patches the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback);

    /**
     * Patches the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart with which to PATCH
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChart patch(WorkbookChart srcWorkbookChart) throws ClientException;

    /**
     * Puts the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback);

    /**
     * Puts the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart to PUT
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     WorkbookChart put(WorkbookChart srcWorkbookChart) throws ClientException;
    /**
     * Gets the WorkbookChart
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookChart> callback);

    /**
     * Gets the WorkbookChart
     *
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChart get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartItemRequest expand(final String value);

}

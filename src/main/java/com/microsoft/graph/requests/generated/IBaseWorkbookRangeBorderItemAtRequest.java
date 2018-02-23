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
 * The interface for the Base Workbook Range Border Item At Request.
 */
public interface IBaseWorkbookRangeBorderItemAtRequest {

    /**
     * Patches the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(WorkbookRangeBorder srcWorkbookRangeBorder, final ICallback<WorkbookRangeBorder> callback);

    /**
     * Patches the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder with which to PATCH
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookRangeBorder patch(WorkbookRangeBorder srcWorkbookRangeBorder) throws ClientException;

    /**
     * Puts the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookRangeBorder srcWorkbookRangeBorder, final ICallback<WorkbookRangeBorder> callback);

    /**
     * Puts the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder to PUT
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     WorkbookRangeBorder put(WorkbookRangeBorder srcWorkbookRangeBorder) throws ClientException;
    /**
     * Gets the WorkbookRangeBorder
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookRangeBorder> callback);

    /**
     * Gets the WorkbookRangeBorder
     *
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookRangeBorder get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookRangeBorderItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookRangeBorderItemAtRequest expand(final String value);

}

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
 * The class for the Base Planner Assigned To Task Board Task Format Request.
 */
public class BasePlannerAssignedToTaskBoardTaskFormatRequest extends BaseRequest implements IBasePlannerAssignedToTaskBoardTaskFormatRequest {

    /**
     * The request for the PlannerAssignedToTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BasePlannerAssignedToTaskBoardTaskFormatRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<PlannerAssignedToTaskBoardTaskFormat> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     *
     * @return the PlannerAssignedToTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerAssignedToTaskBoardTaskFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerAssignedToTaskBoardTaskFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat, final ICallback<PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerAssignedToTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerAssignedToTaskBoardTaskFormat patch(final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat, final ICallback<PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.POST, callback, newPlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the new object to create
     * @return the created PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerAssignedToTaskBoardTaskFormat post(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.POST, newPlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerAssignedToTaskBoardTaskFormatRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerAssignedToTaskBoardTaskFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerAssignedToTaskBoardTaskFormatRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerAssignedToTaskBoardTaskFormatRequest)this;
     }

}


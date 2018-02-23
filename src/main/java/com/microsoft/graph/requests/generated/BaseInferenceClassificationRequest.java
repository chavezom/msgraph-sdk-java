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
 * The class for the Base Inference Classification Request.
 */
public class BaseInferenceClassificationRequest extends BaseRequest implements IBaseInferenceClassificationRequest {

    /**
     * The request for the InferenceClassification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseInferenceClassificationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<InferenceClassification> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the InferenceClassification from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<InferenceClassification> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the InferenceClassification from the service
     *
     * @return the InferenceClassification from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassification get() throws ClientException {
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
     * Patches this InferenceClassification with a source
     *
     * @param sourceInferenceClassification the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final InferenceClassification sourceInferenceClassification, final ICallback<InferenceClassification> callback) {
        send(HttpMethod.PATCH, callback, sourceInferenceClassification);
    }

    /**
     * Patches this InferenceClassification with a source
     *
     * @param sourceInferenceClassification the source object with updates
     * @return the updated InferenceClassification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassification patch(final InferenceClassification sourceInferenceClassification) throws ClientException {
        return send(HttpMethod.PATCH, sourceInferenceClassification);
    }

    /**
     * Creates a InferenceClassification with a new object
     *
     * @param newInferenceClassification the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final InferenceClassification newInferenceClassification, final ICallback<InferenceClassification> callback) {
        send(HttpMethod.POST, callback, newInferenceClassification);
    }

    /**
     * Creates a InferenceClassification with a new object
     *
     * @param newInferenceClassification the new object to create
     * @return the created InferenceClassification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassification post(final InferenceClassification newInferenceClassification) throws ClientException {
        return send(HttpMethod.POST, newInferenceClassification);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IInferenceClassificationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (InferenceClassificationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IInferenceClassificationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (InferenceClassificationRequest)this;
     }

}


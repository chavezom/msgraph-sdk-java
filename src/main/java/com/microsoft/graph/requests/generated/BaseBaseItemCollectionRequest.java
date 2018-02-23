// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Base Item Collection Request.
 */
public class BaseBaseItemCollectionRequest extends BaseCollectionRequest<BaseBaseItemCollectionResponse, IBaseItemCollectionPage> implements IBaseBaseItemCollectionRequest {

    /**
     * The request builder for this collection of BaseItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseBaseItemCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseBaseItemCollectionResponse.class, IBaseItemCollectionPage.class);
    }

    public void get(final ICallback<IBaseItemCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IBaseItemCollectionPage get() throws ClientException {
        final BaseBaseItemCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final BaseItem newBaseItem, final ICallback<BaseItem> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new BaseItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newBaseItem, callback);
    }

    public BaseItem post(final BaseItem newBaseItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new BaseItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newBaseItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IBaseItemCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (BaseItemCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IBaseItemCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (BaseItemCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IBaseItemCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (BaseItemCollectionRequest)this;
    }

    public IBaseItemCollectionPage buildFromResponse(final BaseBaseItemCollectionResponse response) {
        final IBaseItemCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new BaseItemCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseItemCollectionPage page = new BaseItemCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

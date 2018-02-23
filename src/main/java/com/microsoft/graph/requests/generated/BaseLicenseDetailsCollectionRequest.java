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
 * The class for the Base License Details Collection Request.
 */
public class BaseLicenseDetailsCollectionRequest extends BaseCollectionRequest<BaseLicenseDetailsCollectionResponse, ILicenseDetailsCollectionPage> implements IBaseLicenseDetailsCollectionRequest {

    /**
     * The request builder for this collection of LicenseDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseLicenseDetailsCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseLicenseDetailsCollectionResponse.class, ILicenseDetailsCollectionPage.class);
    }

    public void get(final ICallback<ILicenseDetailsCollectionPage> callback) {
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

    public ILicenseDetailsCollectionPage get() throws ClientException {
        final BaseLicenseDetailsCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final LicenseDetails newLicenseDetails, final ICallback<LicenseDetails> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new LicenseDetailsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newLicenseDetails, callback);
    }

    public LicenseDetails post(final LicenseDetails newLicenseDetails) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new LicenseDetailsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newLicenseDetails);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ILicenseDetailsCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (LicenseDetailsCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ILicenseDetailsCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (LicenseDetailsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ILicenseDetailsCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (LicenseDetailsCollectionRequest)this;
    }

    public ILicenseDetailsCollectionPage buildFromResponse(final BaseLicenseDetailsCollectionResponse response) {
        final ILicenseDetailsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new LicenseDetailsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final LicenseDetailsCollectionPage page = new LicenseDetailsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BasePostForwardRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Post Forward Request Builder.
 */
public class PostForwardRequestBuilder extends BasePostForwardRequestBuilder implements IPostForwardRequestBuilder {

    /**
     * The request builder for this PostForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     * @param toRecipients the toRecipients
     */
    public PostForwardRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String comment, final java.util.List<Recipient> toRecipients) {
        super(requestUrl, client, requestOptions, comment, toRecipients);
    }
}

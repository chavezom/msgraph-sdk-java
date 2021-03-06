// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.requests.extensions.IListItemCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base List Item Collection Page.
 */
public class BaseListItemCollectionPage extends BaseCollectionPage<ListItem, IListItemCollectionRequestBuilder> implements IBaseListItemCollectionPage {

    /**
     * A collection page for ListItem
     *
     * @param response the serialized BaseListItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseListItemCollectionPage(final BaseListItemCollectionResponse response, final IListItemCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

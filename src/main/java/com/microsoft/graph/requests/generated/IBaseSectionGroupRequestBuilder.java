// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.ISectionGroupRequest;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Section Group Request Builder.
 */
public interface IBaseSectionGroupRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISectionGroupRequest instance
     */
    ISectionGroupRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISectionGroupRequest instance
     */
    ISectionGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for Notebook
     *
     * @return the INotebookRequestBuilder instance
     */
    INotebookRequestBuilder parentNotebook();

    /**
     * Gets the request builder for SectionGroup
     *
     * @return the ISectionGroupRequestBuilder instance
     */
    ISectionGroupRequestBuilder parentSectionGroup();

    IOnenoteSectionCollectionRequestBuilder sections();

    IOnenoteSectionRequestBuilder sections(final String id);

    ISectionGroupCollectionRequestBuilder sectionGroups();

    ISectionGroupRequestBuilder sectionGroups(final String id);

}

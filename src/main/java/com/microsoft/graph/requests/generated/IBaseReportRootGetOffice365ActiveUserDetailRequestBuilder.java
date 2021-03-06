// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActiveUserDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Office365Active User Detail Request Builder.
 */
public interface IBaseReportRootGetOffice365ActiveUserDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOffice365ActiveUserDetailRequest
     *
     * @return the IReportRootGetOffice365ActiveUserDetailRequest instance
     */
    IReportRootGetOffice365ActiveUserDetailRequest buildRequest();

    /**
     * Creates the IReportRootGetOffice365ActiveUserDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ActiveUserDetailRequest instance
     */
    IReportRootGetOffice365ActiveUserDetailRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

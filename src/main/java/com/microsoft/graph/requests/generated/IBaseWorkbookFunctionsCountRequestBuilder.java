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
 * The interface for the Base Workbook Functions Count Request Builder.
 */
public interface IBaseWorkbookFunctionsCountRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCountRequest
     *
     * @return the IWorkbookFunctionsCountRequest instance
     */
    IWorkbookFunctionsCountRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsCountRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCountRequest instance
     */
    IWorkbookFunctionsCountRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

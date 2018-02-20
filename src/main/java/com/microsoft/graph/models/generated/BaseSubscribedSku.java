// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Subscribed Sku.
 */
public class BaseSubscribedSku extends Entity implements IJsonBackedObject {


    /**
     * The Capability Status.
     * For example, "Enabled".
     */
    @SerializedName("capabilityStatus")
    @Expose
    public String capabilityStatus;

    /**
     * The Consumed Units.
     * The number of licenses that have been assigned.
     */
    @SerializedName("consumedUnits")
    @Expose
    public Integer consumedUnits;

    /**
     * The Prepaid Units.
     * Information about the number and status of prepaid licenses.
     */
    @SerializedName("prepaidUnits")
    @Expose
    public LicenseUnitsDetail prepaidUnits;

    /**
     * The Service Plans.
     * Information about the service plans that are available with the SKU. Not nullable
     */
    @SerializedName("servicePlans")
    @Expose
    public java.util.List<ServicePlanInfo> servicePlans;

    /**
     * The Sku Id.
     * The unique identifier (GUID) for the service SKU.
     */
    @SerializedName("skuId")
    @Expose
    public java.util.UUID skuId;

    /**
     * The Sku Part Number.
     * The SKU part number; for example: "AAD_PREMIUM" or "RMSBASIC".
     */
    @SerializedName("skuPartNumber")
    @Expose
    public String skuPartNumber;

    /**
     * The Applies To.
     * For example, "User" or "Company".
     */
    @SerializedName("appliesTo")
    @Expose
    public String appliesTo;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

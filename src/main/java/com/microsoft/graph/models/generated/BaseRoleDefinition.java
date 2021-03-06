// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RolePermission;
import com.microsoft.graph.models.extensions.RoleAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.generated.BaseRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.RoleAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Role Definition.
 */
public class BaseRoleDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * Display Name of the Role definition.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * Description of the Role definition.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Role Permissions.
     * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.
     */
    @SerializedName("rolePermissions")
    @Expose
    public java.util.List<RolePermission> rolePermissions;

    /**
     * The Is Built In.
     * Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
     */
    @SerializedName("isBuiltIn")
    @Expose
    public Boolean isBuiltIn;

    /**
     * The Role Assignments.
     * List of Role assignments for this role definition.
     */
    public RoleAssignmentCollectionPage roleAssignments;


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
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("roleAssignments")) {
            final BaseRoleAssignmentCollectionResponse response = new BaseRoleAssignmentCollectionResponse();
            if (json.has("roleAssignments@odata.nextLink")) {
                response.nextLink = json.get("roleAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleAssignments").toString(), JsonObject[].class);
            final RoleAssignment[] array = new RoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleAssignments = new RoleAssignmentCollectionPage(response, null);
        }
    }
}

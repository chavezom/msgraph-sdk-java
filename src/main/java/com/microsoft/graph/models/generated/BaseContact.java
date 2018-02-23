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
 * The class for the Base Contact.
 */
public class BaseContact extends OutlookItem implements IJsonBackedObject {


    /**
     * The Parent Folder Id.
     * The ID of the contact's parent folder.
     */
    @SerializedName("parentFolderId")
    @Expose
    public String parentFolderId;

    /**
     * The Birthday.
     * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("birthday")
    @Expose
    public java.util.Calendar birthday;

    /**
     * The File As.
     * The name the contact is filed under.
     */
    @SerializedName("fileAs")
    @Expose
    public String fileAs;

    /**
     * The Display Name.
     * The contact's display name.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Given Name.
     * The contact's given name.
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Initials.
     * The contact's initials.
     */
    @SerializedName("initials")
    @Expose
    public String initials;

    /**
     * The Middle Name.
     * The contact's middle name.
     */
    @SerializedName("middleName")
    @Expose
    public String middleName;

    /**
     * The Nick Name.
     * The contact's nickname.
     */
    @SerializedName("nickName")
    @Expose
    public String nickName;

    /**
     * The Surname.
     * The contact's surname.
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Title.
     * The contact's title.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Yomi Given Name.
     * The phonetic Japanese given name (first name) of the contact.
     */
    @SerializedName("yomiGivenName")
    @Expose
    public String yomiGivenName;

    /**
     * The Yomi Surname.
     * The phonetic Japanese surname (last name)  of the contact.
     */
    @SerializedName("yomiSurname")
    @Expose
    public String yomiSurname;

    /**
     * The Yomi Company Name.
     * The phonetic Japanese company name of the contact.
     */
    @SerializedName("yomiCompanyName")
    @Expose
    public String yomiCompanyName;

    /**
     * The Generation.
     * The contact's generation.
     */
    @SerializedName("generation")
    @Expose
    public String generation;

    /**
     * The Email Addresses.
     * The contact's email addresses.
     */
    @SerializedName("emailAddresses")
    @Expose
    public java.util.List<EmailAddress> emailAddresses;

    /**
     * The Im Addresses.
     * The contact's instant messaging (IM) addresses.
     */
    @SerializedName("imAddresses")
    @Expose
    public java.util.List<String> imAddresses;

    /**
     * The Job Title.
     * The contact's job title.
     */
    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;

    /**
     * The Company Name.
     * The name of the contact's company.
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Department.
     * The contact's department.
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Office Location.
     * The location of the contact's office.
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Profession.
     * The contact's profession.
     */
    @SerializedName("profession")
    @Expose
    public String profession;

    /**
     * The Business Home Page.
     * The business home page of the contact.
     */
    @SerializedName("businessHomePage")
    @Expose
    public String businessHomePage;

    /**
     * The Assistant Name.
     * The name of the contact's assistant.
     */
    @SerializedName("assistantName")
    @Expose
    public String assistantName;

    /**
     * The Manager.
     * The name of the contact's manager.
     */
    @SerializedName("manager")
    @Expose
    public String manager;

    /**
     * The Home Phones.
     * The contact's home phone numbers.
     */
    @SerializedName("homePhones")
    @Expose
    public java.util.List<String> homePhones;

    /**
     * The Mobile Phone.
     * The contact's mobile phone number.
     */
    @SerializedName("mobilePhone")
    @Expose
    public String mobilePhone;

    /**
     * The Business Phones.
     * The contact's business phone numbers.
     */
    @SerializedName("businessPhones")
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The Home Address.
     * The contact's home address.
     */
    @SerializedName("homeAddress")
    @Expose
    public PhysicalAddress homeAddress;

    /**
     * The Business Address.
     * The contact's business address.
     */
    @SerializedName("businessAddress")
    @Expose
    public PhysicalAddress businessAddress;

    /**
     * The Other Address.
     * Other addresses for the contact.
     */
    @SerializedName("otherAddress")
    @Expose
    public PhysicalAddress otherAddress;

    /**
     * The Spouse Name.
     * The name of the contact's spouse.
     */
    @SerializedName("spouseName")
    @Expose
    public String spouseName;

    /**
     * The Personal Notes.
     * The user's notes about the contact.
     */
    @SerializedName("personalNotes")
    @Expose
    public String personalNotes;

    /**
     * The Children.
     * The names of the contact's children.
     */
    @SerializedName("children")
    @Expose
    public java.util.List<String> children;

    /**
     * The Extensions.
     * The collection of open extensions defined for the contact. Read-only. Nullable.
     */
    public ExtensionCollectionPage extensions;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     */
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     */
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Photo.
     * Optional contact picture. You can get or set a photo for a contact.
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;


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


        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("singleValueExtendedProperties")) {
            final BaseSingleValueLegacyExtendedPropertyCollectionResponse response = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("singleValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("singleValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), JsonObject[].class);
            final SingleValueLegacyExtendedProperty[] array = new SingleValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SingleValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("multiValueExtendedProperties")) {
            final BaseMultiValueLegacyExtendedPropertyCollectionResponse response = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("multiValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("multiValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), JsonObject[].class);
            final MultiValueLegacyExtendedProperty[] array = new MultiValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MultiValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            multiValueExtendedProperties = new MultiValueLegacyExtendedPropertyCollectionPage(response, null);
        }
    }
}

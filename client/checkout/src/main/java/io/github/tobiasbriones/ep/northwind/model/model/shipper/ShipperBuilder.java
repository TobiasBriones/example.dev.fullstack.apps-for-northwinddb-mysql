/*
 * Copyright (c) 2020 Tobias Briones.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.github.tobiasbriones.ep.northwind.model.model.shipper;

// Notice that Customer and Employee and Supplier and Shipper are the exact same
// model ...

/**
 * Defines a ShipperBuilder pattern for the {@link Shipper} model.
 */
public final class ShipperBuilder {

    private final int id;
    private String company;
    private String lastName;
    private String firstName;
    private String email;
    private String jobTitle;
    private String businessPhone;
    private String homePhone;
    private String mobilePhone;
    private String faxNumber;
    private String address;
    private String city;
    private String stateProvince;
    private String zipPostalCode;
    private String countryRegion;
    private String webPage;
    private String notes;
    private String attachments;

    public ShipperBuilder(int id) {
        this.id = id;
        company = "";
        lastName = "";
        firstName = "";
        email = "";
        jobTitle = "";
        businessPhone = "";
        homePhone = "";
        mobilePhone = "";
        faxNumber = "";
        address = "";
        city = "";
        stateProvince = "";
        zipPostalCode = "";
        countryRegion = "";
        webPage = "";
        notes = "";
        attachments = "";
    }

    //                                                                        //
    //                      ACCESSOR AND MUTATOR METHODS                      //
    //                                                                        //

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public ShipperBuilder setCompany(String value) {
        company = value;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ShipperBuilder setLastName(String value) {
        lastName = value;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public ShipperBuilder setFirstName(String value) {
        firstName = value;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ShipperBuilder setEmail(String value) {
        email = value;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public ShipperBuilder setJobTitle(String value) {
        jobTitle = value;
        return this;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public ShipperBuilder setBusinessPhone(String value) {
        businessPhone = value;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public ShipperBuilder setHomePhone(String value) {
        homePhone = value;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public ShipperBuilder setMobilePhone(String value) {
        mobilePhone = value;
        return this;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public ShipperBuilder setFaxNumber(String value) {
        faxNumber = value;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ShipperBuilder setAddress(String value) {
        address = value;
        return this;
    }

    public String getCity() {
        return city;
    }

    public ShipperBuilder setCity(String value) {
        city = value;
        return this;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public ShipperBuilder setStateProvince(String value) {
        stateProvince = value;
        return this;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public ShipperBuilder setZipPostalCode(String value) {
        zipPostalCode = value;
        return this;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public ShipperBuilder setCountryRegion(String value) {
        countryRegion = value;
        return this;
    }

    public String getWebPage() {
        return webPage;
    }

    public ShipperBuilder setWebPage(String value) {
        webPage = value;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public ShipperBuilder setNotes(String value) {
        notes = value;
        return this;
    }

    public String getAttachments() {
        return attachments;
    }

    public ShipperBuilder setAttachments(String value) {
        attachments = value;
        return this;
    }
    //                  END OF ACCESSOR AND MUTATOR METHODS                   //

    @Override
    public String toString() {
        return "ShipperBuilder[" +
               "id=" + id + ", " +
               "company=" + company + ", " +
               "lastName=" + lastName + ", " +
               "firstName=" + firstName + ", " +
               "email=" + email + ", " +
               "jobTitle=" + jobTitle + ", " +
               "businessPhone=" + businessPhone + ", " +
               "homePhone=" + homePhone + ", " +
               "mobilePhone=" + mobilePhone + ", " +
               "faxNumber=" + faxNumber + ", " +
               "address=" + address + ", " +
               "city=" + city + ", " +
               "stateProvince=" + stateProvince + ", " +
               "zipPostalCode=" + zipPostalCode + ", " +
               "countryRegion=" + countryRegion + ", " +
               "webPage=" + webPage + ", " +
               "notes=" + notes + ", " +
               "attachments=" + attachments + ", " +
               "]";
    }

    public Shipper build() {
        return new Shipper(
            id,
            company,
            lastName,
            firstName,
            email,
            jobTitle,
            businessPhone,
            homePhone,
            mobilePhone,
            faxNumber,
            address,
            city,
            stateProvince,
            zipPostalCode,
            countryRegion,
            webPage,
            notes,
            attachments
        );
    }

}
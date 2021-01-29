package com.ironhack.prcompany.classes;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String salutation;


    public Name(String firstName, String middleName, String lastName, String salutation) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salutation = salutation;
    }

    //  Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}

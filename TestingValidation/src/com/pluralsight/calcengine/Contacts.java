package com.pluralsight.calcengine;

public class Contacts {
    private String firstName;
    private String LastName;
    private  String phoneNumber;

    public Contacts(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        LastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void validateFirstName(){
        if (this.firstName.isBlank())
            throw new RuntimeException("first name cannot be null");
    }
    public void validateLastName(){
        if (this.firstName.isBlank())
            throw new RuntimeException("last name cannot be null");
    }
    public void validatePhoneNumber(){
        if (this.firstName.isBlank())
            throw new RuntimeException("phone number cannot be null");
    }

    @Override
    public String toString() {
        return "" +
                "" + firstName + '\'' +
                "," + LastName + '\'' +
                "," + phoneNumber + '\''
                ;
    }
}

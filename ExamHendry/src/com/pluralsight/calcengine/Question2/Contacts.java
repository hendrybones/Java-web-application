package com.pluralsight.calcengine.Question2;

public class Contacts {
    private String firstName;
    private String secondName;
    private String phoneNumber;

    public Contacts(String firstName, String secondName, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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
        if (this.phoneNumber.isBlank())
            throw new RuntimeException("phone number cannot be null");

        if (this.phoneNumber.length()!=8){
            throw new RuntimeException("phone number should be 8 digits long");

        }
    }


    @Override
    public String toString() {
        return "" +
                "" + firstName + '\'' +
                "," + secondName + '\'' +
                "," + phoneNumber + '\''
                ;
    }

}

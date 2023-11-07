package org.example.models;

import java.time.LocalDate;

public class User {
    private String LastName;
    private String FirstName;
    private String MiddleName;
    LocalDate DateOfBirth;
    long PhoneNumber;
    Gender Gender;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public org.example.models.Gender getGender() {
        return Gender;
    }

    public void setGender(org.example.models.Gender gender) {
        Gender = gender;
    }
}

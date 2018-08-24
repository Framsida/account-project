package com.qa.account;

import org.json.*;
import java.util.Map;

public class Account {
    private String firstName;
    private String lastName;
    private int accountNumber;

    public Account(String firstName, String lastName, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "FirstName = " + firstName + "LastName = " + lastName + "AccountNumber = " + accountNumber;

    }

    public Map<String, Object> toMap() {
        return ((new JSONObject(this)).toMap());
    }
}

package com.userregistration;

import java.util.regex.Pattern;

public class RegistrationOfUser {
    private static final String firastName = "^[A-Z]{1}[a-z]{2,}$";
    private static final String lastName = "^[A-Z]{1}[a-z]{2,}$";
    private static final String email = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public boolean validateFirstName(String firastName){
        Pattern pattern= Pattern.compile(firastName);
        return pattern.matcher(firastName).matches();
    }

    public boolean validateLastname(String lastName){
        Pattern pattern = Pattern.compile(lastName);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(email);
        return pattern.matcher(email).matches();
    }
}
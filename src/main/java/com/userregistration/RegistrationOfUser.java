package com.userregistration;

import java.util.regex.Pattern;

public class RegistrationOfUser {
    private static final String firastName = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String firastName){
        Pattern pattern= Pattern.compile(firastName);
        return pattern.matcher(firastName).matches();
    }
}

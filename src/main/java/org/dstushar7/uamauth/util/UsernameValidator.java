package org.dstushar7.uamauth.util;

public class UsernameValidator {

    public boolean isValid(String username) {
        if (username == null) {
            return false;
        }

        if (username.length() < 3) {
            return false;
        }
        return username.matches("^[a-zA-Z0-9]+$"); // Only alphanumeric characters allowed
    }
}
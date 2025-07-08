package org.dstushar7.uamauth.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserNameValidatorTest {

    @Test
    void validateUserName() {
        UsernameValidator validator = new UsernameValidator();
        assertTrue(validator.isValid("validUser123"), "Username Should be valid");
    }

    @Test
    void testInvalidUsernameWithSpecialChars() {
        UsernameValidator validator = new UsernameValidator();
        assertFalse(validator.isValid("invalid@User"), "Username with special characters should be invalid");
    }


    @Test
    void testInvalidUsernameTooShort() {
        UsernameValidator validator = new UsernameValidator();
        assertFalse(validator.isValid("ab"), "Username shorter than 3 characters should be invalid");
    }
}

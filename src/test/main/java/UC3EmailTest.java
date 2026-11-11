
/*
 * This class tests email validation using JUnit 5.
 * It checks valid email formats and invalid email structures.
 */

package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UC3EmailTest {

    UC3EmailValidator validator =
            new UC3EmailValidator();

    @Test
    public void givenValidEmailShouldReturnTrue() {

        assertTrue(validator.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenValidEmailWithoutOptionalPartsShouldReturnTrue() {

        assertTrue(validator.validateEmail("abc@bl.com"));
    }

    @Test
    public void givenEmailWithoutAtSymbolShouldReturnFalse() {

        assertFalse(validator.validateEmail("abc.bl.com"));
    }

    @Test
    public void givenEmailWithoutDomainShouldReturnFalse() {

        assertFalse(validator.validateEmail("abc@"));
    }

    @Test
    public void givenEmailWithoutTopLevelDomainShouldReturnFalse() {

        assertFalse(validator.validateEmail("abc@bl"));
    }

    @Test
    public void givenEmailWithMultipleDotsShouldReturnFalse() {

        assertFalse(validator.validateEmail("abc@bl..com"));
    }

    @Test
    public void givenNullEmailShouldReturnFalse() {

        assertFalse(validator.validateEmail(null));
    }
}

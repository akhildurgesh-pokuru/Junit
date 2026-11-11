
/*
 * This class tests mobile number validation using JUnit 5.
 * It verifies country code, space, and exactly 10 mobile digits.
 */

package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UC4MobileTest {

    UC4MobileValidator validator =
            new UC4MobileValidator();

    @Test
    public void givenValidMobileShouldReturnTrue() {

        assertTrue(validator.validateMobile("91 9919819801"));
    }

    @Test
    public void givenMobileWithoutSpaceShouldReturnFalse() {

        assertFalse(validator.validateMobile("919919819801"));
    }

    @Test
    public void givenMobileWithLessThanTenDigitsShouldReturnFalse() {

        assertFalse(validator.validateMobile("91 991981980"));
    }

    @Test
    public void givenMobileWithMoreThanTenDigitsShouldReturnFalse() {

        assertFalse(validator.validateMobile("91 99198198012"));
    }

    @Test
    public void givenMobileWithInvalidCountryCodeShouldReturnFalse() {

        assertFalse(validator.validateMobile("AB 9919819801"));
    }

    @Test
    public void givenNullMobileShouldReturnFalse() {

        assertFalse(validator.validateMobile(null));
    }
}

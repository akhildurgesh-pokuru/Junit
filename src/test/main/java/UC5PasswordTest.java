
/*
 * This class tests all four password validation rules using JUnit 5.
 * It verifies minimum length, uppercase, numeric digit, and exactly one special character.
 */

package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UC5PasswordTest {

    UC5PasswordValidator validator =
            new UC5PasswordValidator();

    // UC5: Minimum 8 characters
    @Test
    public void givenPasswordWithMinimumEightCharactersShouldReturnTrue() {

        assertTrue(validator.validateMinimumLength("Akhil123@"));
    }

    @Test
    public void givenPasswordWithLessThanEightCharactersShouldReturnFalse() {

        assertFalse(validator.validateMinimumLength("Ab1@"));
    }

    // UC6: At least one uppercase letter
    @Test
    public void givenPasswordWithUppercaseShouldReturnTrue() {

        assertTrue(validator.validateUpperCase("Akhil123@"));
    }

    @Test
    public void givenPasswordWithoutUppercaseShouldReturnFalse() {

        assertFalse(validator.validateUpperCase("akhil123@"));
    }

    // UC7: At least one numeric digit
    @Test
    public void givenPasswordWithNumberShouldReturnTrue() {

        assertTrue(validator.validateNumber("Akhil123@"));
    }

    @Test
    public void givenPasswordWithoutNumberShouldReturnFalse() {

        assertFalse(validator.validateNumber("Akhilpok@"));
    }

    // UC8: Exactly one special character
    @Test
    public void givenPasswordWithExactlyOneSpecialCharacterShouldReturnTrue() {

        assertTrue(validator.validateSpecialCharacter("Akhil123@"));
    }

    @Test
    public void givenPasswordWithMultipleSpecialCharactersShouldReturnFalse() {

        assertFalse(validator.validateSpecialCharacter("Akhil123@@"));
    }

    @Test
    public void givenPasswordWithoutSpecialCharacterShouldReturnFalse() {

        assertFalse(validator.validateSpecialCharacter("Akhil1234"));
    }

    // Validate all password rules together
    @Test
    public void givenValidPasswordShouldReturnTrue() {

        assertTrue(validator.validatePassword("Akhil123@"));
    }

    @Test
    public void givenInvalidPasswordShouldReturnFalse() {

        assertFalse(validator.validatePassword("akhil123"));
    }

    @Test
    public void givenNullPasswordShouldReturnFalse() {

        assertFalse(validator.validatePassword(null));
    }
}

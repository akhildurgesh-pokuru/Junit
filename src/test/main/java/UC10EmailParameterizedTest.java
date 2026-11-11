
/*
 * This class performs parameterized email validation using JUnit 5.
 * It tests multiple valid and invalid email samples with expected results.
 */

package com.bridgelabz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class UC10EmailParameterizedTest {

    UC3EmailValidator validator =
            new UC3EmailValidator();

    @ParameterizedTest
    @CsvSource({
            "abc.xyz@bl.co.in, true",
            "abc@bl.co, true",
            "john.doe@gmail.com, true",
            "abc@bl.com, true",
            "test.user@yahoo.in, true",
            "abc, false",
            "abc@, false",
            "abc@bl, false",
            "abc@bl.c, false",
            "abc@bl..com, false",
            "@bl.co.in, false",
            "abc.xyz@bl, false",
            "abc@bl.co.in.extra, false"
    })
    public void givenMultipleEmailsShouldValidateCorrectly(
            String email, boolean expected) {

        assertEquals(expected, validator.validateEmail(email));
    }
}

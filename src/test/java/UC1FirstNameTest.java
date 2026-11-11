
/*
 * This class tests first name validation using JUnit 5.
 * It verifies valid names and invalid names through happy and sad test cases.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UC1FirstNameTest {

    UC1FirstNameValidator validator =
            new UC1FirstNameValidator();

    @Test
    public void givenValidFirstNameShouldReturnTrue() {

        assertTrue(validator.validateFirstName("Akhil"));
    }

    @Test
    public void givenFirstNameStartingWithSmallLetterShouldReturnFalse() {

        assertFalse(validator.validateFirstName("akhil"));
    }

    @Test
    public void givenFirstNameWithLessThanThreeCharactersShouldReturnFalse() {

        assertFalse(validator.validateFirstName("Ak"));
    }

    @Test
    public void givenFirstNameWithNumbersShouldReturnFalse() {

        assertFalse(validator.validateFirstName("Akhil123"));
    }

    @Test
    public void givenNullFirstNameShouldReturnFalse() {

        assertFalse(validator.validateFirstName(null));
    }
}

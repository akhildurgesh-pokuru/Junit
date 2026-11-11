
/*
 * This class tests last name validation using JUnit 5.
 * It verifies uppercase, minimum length, and alphabet-only requirements.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UC2LastNameTest {

    UC2LastNameValidator validator =
            new UC2LastNameValidator();

    @Test
    public void givenValidLastNameShouldReturnTrue() {

        assertTrue(validator.validateLastName("Pokuru"));
    }

    @Test
    public void givenLastNameStartingWithSmallLetterShouldReturnFalse() {

        assertFalse(validator.validateLastName("pokuru"));
    }

    @Test
    public void givenLastNameWithLessThanThreeCharactersShouldReturnFalse() {

        assertFalse(validator.validateLastName("Po"));
    }

    @Test
    public void givenLastNameWithNumbersShouldReturnFalse() {

        assertFalse(validator.validateLastName("Pokuru123"));
    }

    @Test
    public void givenNullLastNameShouldReturnFalse() {

        assertFalse(validator.validateLastName(null));
    }
}

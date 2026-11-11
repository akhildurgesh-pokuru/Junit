/*
 * This class validates the user's first name.
 * The first name must start with an uppercase letter and contain at least 3 letters.
 */


public class UC1FirstNameValidator {

    public boolean validateFirstName(String firstName) {

        boolean result = firstName != null &&
                firstName.matches("^[A-Z][a-zA-Z]{2,}$");

        ValidationLogger.logValidation("First Name", result);

        return result;
    }
}

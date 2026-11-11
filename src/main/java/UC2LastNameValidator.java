
/*
 * This class validates the user's last name.
 * The last name must start with an uppercase letter and contain at least 3 letters.
 */

package com.bridgelabz;

public class UC2LastNameValidator {

    public boolean validateLastName(String lastName) {

        boolean result = lastName != null &&
                lastName.matches("^[A-Z][a-zA-Z]{2,}$");

        ValidationLogger.logValidation("Last Name", result);

        return result;
    }
}

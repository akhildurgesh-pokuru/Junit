
/*
 * This class validates the user's email address.
 * It checks mandatory and optional email parts with correctly positioned dots and @.
 */

package com.bridgelabz;

public class UC3EmailValidator {

    public boolean validateEmail(String email) {

        String emailRegex =
                "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@" +
                        "[a-zA-Z0-9]+\\.[a-zA-Z]{2,}" +
                        "(\\.[a-zA-Z]{2,})?$";

        boolean result = email != null && email.matches(emailRegex);

        ValidationLogger.logValidation("Email", result);

        return result;
    }
}

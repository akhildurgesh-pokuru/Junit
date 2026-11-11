
/*
 * This class validates the user's password according to all four password rules.
 * It checks minimum length, uppercase, numeric digit, and exactly one special character.
 */

package com.bridgelabz;

public class UC5PasswordValidator {

    // UC5: Minimum 8 characters
    public boolean validateMinimumLength(String password) {

        return password != null && password.length() >= 8;
    }

    // UC6: At least one uppercase character
    public boolean validateUpperCase(String password) {

        return password != null && password.matches(".*[A-Z].*");
    }

    // UC7: At least one numeric digit
    public boolean validateNumber(String password) {

        return password != null && password.matches(".*[0-9].*");
    }

    // UC8: Exactly one special character
    public boolean validateSpecialCharacter(String password) {

        if (password == null) {
            return false;
        }

        int specialCount = 0;

        for (char ch : password.toCharArray()) {

            if (!Character.isLetterOrDigit(ch) &&
                    !Character.isWhitespace(ch)) {

                specialCount++;
            }
        }

        return specialCount == 1;
    }

    // Check all password rules together
    public boolean validatePassword(String password) {

        boolean lengthValid = validateMinimumLength(password);
        boolean upperValid = validateUpperCase(password);
        boolean numberValid = validateNumber(password);
        boolean specialValid = validateSpecialCharacter(password);

        boolean result = lengthValid && upperValid &&
                numberValid && specialValid;

        ValidationLogger.logValidation("Password", result);

        return result;
    }
}

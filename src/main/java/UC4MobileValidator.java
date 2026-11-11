
/*
 * This class validates the user's mobile number.
 * It checks for a country code, a space, and exactly 10 mobile digits.
 */

package com.bridgelabz;

public class UC4MobileValidator {

    public boolean validateMobile(String mobile) {

        boolean result = mobile != null &&
                mobile.matches("^[0-9]{1,3} [0-9]{10}$");

        ValidationLogger.logValidation("Mobile Number", result);

        return result;
    }
}

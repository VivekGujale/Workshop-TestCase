//Validate input must have alphanumeric and at least have one symbol n should have min 6 digit long

package org.example.Workshop;

import java.util.regex.Pattern;

public class AlphaNumericPassword {
    public static boolean validationCheck(String password) {
        return Pattern.matches("[A-Za-z0-9]*[!@#$%^&*][A-Za-z0-9]{2,}",password);
    }
}

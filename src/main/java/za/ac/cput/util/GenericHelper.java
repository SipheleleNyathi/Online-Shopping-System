package za.ac.cput.util;

import java.util.regex.Pattern;

public class GenericHelper {

    //The absence of the @ symbol in the email address will fail the validation.
    // Simple Regular Expression email validation
    public static boolean isValidUserEmail(String email, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }
}

package za.ac.cput.util;


import java.util.UUID;
import java.util.regex.Pattern;

public class Helper {

    public static boolean isNull(String s){

        return (s == null || s.isEmpty() || s.equalsIgnoreCase("null"));
    }

    public static String generateId(){

        return UUID.randomUUID().toString();
    }

    //The absence of the @ symbol in the email address will fail the validation.
    public static boolean isValidUserEmail(String email, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }
}

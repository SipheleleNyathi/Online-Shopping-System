package za.ac.cput.factory;
/*
UserFactory.java
Factory class for User
Author: Siphelele Nyathi 218334028
Date: O4.04.2022
 */
import za.ac.cput.entity.User;
import java.util.UUID;
import java.util.regex.Pattern;

public class UserFactory {

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public static User createUser(String name, String email, String password, String address) {

        String uniqueId = UUID.randomUUID().toString();

        if (!UserFactory.patternMatches(email, "^(.+)@(\\\\S+)$"))
            return null;

        if(name.isEmpty() || password.isEmpty() || address.isEmpty())
                return null;

                return new User.Builder().setUserId(uniqueId)
                        .setName(name)
                        .setEmail(email)
                        .setAddress(address)
                        .setPassword(password)
                        .build();
    }
}

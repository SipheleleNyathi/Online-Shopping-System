package za.ac.cput.factory;
/*
UserFactory.java
Factory class for User
Author: Siphelele Nyathi 218334028
Date: O4.04.2022
 */

import za.ac.cput.entity.User;
import za.ac.cput.util.Helper;

import java.util.UUID;


public class UserFactory {

    public static User createUser(String name, String email, String password, String address) {

        String uniqueId = UUID.randomUUID().toString();

        if (Helper.isValidUserEmail(email, "^(.+)@(\\\\S+)$"))

        if(Helper.isNull(name) || Helper.isNull(password) || Helper.isNull(address))
                return null;

                return new User.Builder().setUserId(uniqueId)
                        .setName(name)
                        .setEmail(email)
                        .setAddress(address)
                        .setPassword(password)
                        .build();
    }
}

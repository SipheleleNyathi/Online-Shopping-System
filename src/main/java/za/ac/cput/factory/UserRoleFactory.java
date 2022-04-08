package za.ac.cput.factory;
/*
UserRoleFactory.java
Factory class for UserRole
Author: Siphelele Nyathi 218334028
Date: O4.04.2022
 */
import za.ac.cput.entity.UserRole;
import za.ac.cput.util.GenericHelper;

import java.util.UUID;

public class UserRoleFactory {

    public static UserRole createRole(String roleType){

        if (GenericHelper.isNullorEmpty(roleType))
            return null;


            return new UserRole.Builder()
                    .setRoleId(GenericHelper.generateId())
                    .setRoleType(roleType)
                    .build();
    }
}

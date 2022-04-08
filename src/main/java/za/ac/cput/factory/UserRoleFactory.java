package za.ac.cput.factory;
/*
UserRoleFactory.java
Factory class for UserRole
Author: Siphelele Nyathi 218334028
Date: O4.04.2022
 */
import za.ac.cput.entity.UserRole;
import java.util.UUID;

public class UserRoleFactory {

    public static UserRole createRole(String roleType){

        String uniqueId = UUID.randomUUID().toString();

        if (roleType.isEmpty() || roleType.equals("null"))
            return null;


            return new UserRole.Builder()
                    .setRoleId(uniqueId)
                    .setRoleType(roleType)
                    .build();
    }
}

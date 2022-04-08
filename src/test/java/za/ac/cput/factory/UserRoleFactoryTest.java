package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.UserRole;

import static org.junit.jupiter.api.Assertions.*;

class UserRoleFactoryTest {

    @Test
    void createRole() {

        UserRole role = UserRoleFactory.createRole("Administrator");
        System.out.println(role.toString());
        assertNotNull(role);
    }
}
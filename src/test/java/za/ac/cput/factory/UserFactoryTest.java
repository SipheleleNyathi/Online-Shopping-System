package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    public void test(){

        User user = UserFactory.createUser("Siphelele", "user@gmail.com", "12345", "Cape Town");
        System.out.println(user.toString());
        assertNotNull(user);
    }
}
/*
 * CategoryServiceImplTest.java
 * Service Implementation Test class for Category
 * Author: Sharfaa Sedick Anthony 220041571
 * //25.10.2022
 * */

package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Category;
import za.ac.cput.domain.Product;
import za.ac.cput.factory.CategoryFactory;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class CategoryServiceImplTest {
    private static final Category category1 = CategoryFactory.createCategory("98765432","Home", "Tissues");
    private static final Category category2 = CategoryFactory.createCategory("12345678","Fashion", "Trousers");
    private static final Category category3 = CategoryFactory.createCategory("07651452","Beauty", "Lipstick");
    @Autowired
    private CategoryServiceImpl service;

    @Test
    void a_save() {
        System.out.println("Created: ");
        Category created1 = service.save(category1);
        assertNotNull(created1);
        System.out.println(created1);

        Category created2 = service.save(category2);
        assertNotNull(created2);
        System.out.println(created2);

        Category created3 = service.save(category3);
        assertNotNull(created3);
        System.out.println(created3);
    }

    @Test
    void b_read() {
        Category read = service.read(category1.getCategoryId());
        assertEquals(category1.getCategoryId(), read.getCategoryId());
        System.out.println("Show Shipments: " + read);
    }

    @Test
    void f_delete() {
        boolean success = service.delete(category3.getCategoryId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getALl() {
        System.out.println("Get All");
        System.out.println(service.findAll());
    }
}
//25.10.2022
package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Order;
import za.ac.cput.domain.OrderDetails;
import za.ac.cput.factory.OrderDetailsFactory;
import za.ac.cput.factory.OrderFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class OrderServiceImplTest {

    private static final OrderDetails details = OrderDetailsFactory.createOrderDetails( 5, "R20","R100");
    private static final Order order = OrderFactory.createOrder("1", "13/08/2022", "Ready", "Edvalter","Cape Town", Integer.parseInt("0999999"), details);

    @Autowired
    private OrderServiceImpl service;


    @Test
    void a_save()
    {
        System.out.println("Order Created: ");
        Order request = service.save(order);
        assertNotNull(request);
        System.out.println(request);
    }

    @Test
    void b_read()
    {
        Order read = service.read(order.getOrderId());
        assertEquals(read.getOrderId(), order.getOrderId());
        System.out.println("Read: " + read);
    }

    @Test
    void f_delete()
    {
        boolean success = service.delete(order.getOrderId());
        assertTrue(success);
        System.out.println("Order Canceled: " + success);
    }

    @Test
    void d_findAll()
    {
        System.out.println("Get All");
        System.out.println(service.findAll());
    }


}
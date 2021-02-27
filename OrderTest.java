import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    private Order order;

    @BeforeEach
    void setUp() {
        this.order = new Order(5, "Router", 5000.00);
    }

    @Test
    void testGetQuantity() {
        //given
        int expectedQuantity = 5;
        //when
        int actualQuantity = order.getQuantity();
        //then
        assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    void testSetQuantity() {
        //given
        int expectedQuantity = 7;
        //when
        order.setQuantity(7);
        //then
        assertEquals(expectedQuantity, order.getQuantity());
    }

    @Test
    void testGetItemName() {
        //given
        String expectedName = "Router";
        //when
        String actualName = order.getItemName();
        //then
        assertEquals(expectedName, actualName);
    }

    @Test
    void testSetItemName() {
        //given
        String expectedName = "Router1";
        //when
        order.setItemName("Router1");
        //then
        assertEquals(expectedName, order.getItemName());
    }

    @Test
    void testGetPrice() {
        //given
        Double expectedPrice = 5000.00;
        //when
        Double actualPrice = order.getPrice();
        //then
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void testSetPrice() {
        //given
        Double expectedPrice = 5000.00;
        //when
        Double actualPrice = order.getPrice();
        //then
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void testGetPriceWithTex() {
        //given
        Double expectedTex = 280.75;
        //when
        order.setPriceWithTex(expectedTex);
        Double actualTex = order.getPriceWithTex();
        //then
        assertEquals(expectedTex, actualTex);
    }

    @Test
    void testSetPriceWithTex() {
        //when
        Order expectedTex = order.setPriceWithTex(578.90);
        //then
        assertEquals(expectedTex, order);
    }

}

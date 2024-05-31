package users;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductTest {

    private Product productMock;


    @BeforeEach
    void setUp() {

        productMock = mock(Product.class);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculatePrice() {

        when(productMock.calculatePrice(10000, 0.3)).thenReturn(14285.71);

        double price = productMock.calculatePrice(10000,0.3);

        assertEquals(14285.71,price,0.01);

    }
}
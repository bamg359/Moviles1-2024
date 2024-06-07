import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductoTest {


    private Producto producto;


    @BeforeEach
    void setUp() {

        producto = mock(Producto.class);
    }

    @Test
    void calculatePrice() {

        when(producto.calculatePrice(10000, 0.3)).thenReturn(14285.71);

        double price= producto.calculatePrice(10000, 0.3);

        assertEquals(14285.71, price, 0.01);

    }
}
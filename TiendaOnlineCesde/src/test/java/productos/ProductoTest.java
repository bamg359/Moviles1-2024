package productos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductoTest {


    Producto productoMock;

    @BeforeEach
    void setUp() {

        productoMock = mock(Producto.class);
    }

    @Test
    void calcularPrecio() {

        when(productoMock.calcularPrecio(10000,0.3)).thenReturn(14285.71);

        double precio = productoMock.calcularPrecio(10000, 0.3);


        assertEquals(14285.71, precio,0.01);

    }
}
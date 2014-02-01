/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaupc;

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author pcsidsub
 */
public class CarritoTest {
    
    private Carrito carrito;
    
    
    public CarritoTest() {
        carrito = new Carrito();
    }

    @Test
    public void necesitoAgregarProductosAlCarrito() {
        Producto producto = new Producto("001", "Carne", 20.00);
        carrito.agregarProducto(producto);
        Assert.assertEquals(1, carrito.cantidadDeProductos());
    }
    
    @Test
    public void necesitoConocerElTotalAPagar(){
        ArrayList<Producto> productos = creadorProductos();       
        carrito.agregarCompra(productos);
        Assert.assertEquals(38.0, carrito.totalAPagar());
        
    }
    
    private ArrayList<Producto> creadorProductos(){
        Producto producto1 = new Producto("002", "Leche", 10.0);
        Producto producto2 = new Producto("003", "Papa", 15.0);
        Producto producto3 = new Producto("004", "Cebolla", 13.0);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        return productos;
    }
    
}
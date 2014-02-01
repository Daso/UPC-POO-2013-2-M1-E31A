/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaupc;

import java.util.ArrayList;
/**
 *
 * @author pcsidsub
 */
public class Carrito {
     private ArrayList<Producto> productos = new ArrayList<>();
     
     public void agregarProducto(Producto producto){
         productos.add(producto);
     }
     
     public void agregarCompra(ArrayList<Producto> compras){
         productos = compras;
     }
     
     public int cantidadDeProductos(){
         return productos.size();
     }
     
     public double totalAPagar(){
        double total = 0.0;
        for(Producto producto : productos){
           total += producto.getPrecio();
        }
         
        return total; 
     }
     
}

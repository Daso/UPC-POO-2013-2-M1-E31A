/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaupc;

/**
 *
 * @author pcsidsub
 */
public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}

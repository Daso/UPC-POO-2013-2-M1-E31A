/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaupc;

/**
 *
 * @author pcsidsub
 */
public class TiendaUPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Jorge Urrutia"); 
        System.out.println(cliente.getContador());
        Cliente cliente2 = new Cliente("Sandra Gomez");
        System.out.println(cliente2.getContador());
        Cliente cliente3 = new Cliente("Sandra Jimenez");
        System.out.println(cliente3.getContador());
        System.out.println(cliente.getContador());
    }
}

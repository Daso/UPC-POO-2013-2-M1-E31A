/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaupc;

/**
 *
 * @author pcsidsub
 */
public class Normal extends Tarjeta{

    public Normal(String numero, double saldo) {
        super(numero, saldo);
    }
    
    @Override
    public String reporte(){
        return "Soy tarjeta Normal, núm: " + numero + " saldo: " + saldo;
    }
    
}


package tiendaupc;


public class Oro extends Tarjeta {
    private double millas;

    public Oro(String numero, double saldo) {
        super(numero, saldo);
        millas = 0.0;
    }
    
    @Override
    public String reporte(){
        return "Soy una tarjeta oro, num: " + numero + " saldo: " + saldo + " millas : " + millas;
    }
}

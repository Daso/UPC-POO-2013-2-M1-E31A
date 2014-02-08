
package tiendaupc;


public abstract class Tarjeta {
    protected String numero;
    protected double saldo;

    public Tarjeta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public abstract String reporte();
    
}

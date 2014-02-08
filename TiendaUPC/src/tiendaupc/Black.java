
package tiendaupc;

public class Black extends Tarjeta{
    private double consumos;

    public Black(String numero, double saldo) {
        super(numero, saldo);
        consumos = 0.0;
    }
    @Override
    public String reporte(){
        return "Tarjeta Black, los datos son privados";
    }
    
}

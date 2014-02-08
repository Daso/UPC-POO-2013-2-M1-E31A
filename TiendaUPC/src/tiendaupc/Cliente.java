
package tiendaupc;

import java.util.ArrayList;

public class Cliente {
    private static int contador;
    private String nombre;
    private long saldo;
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>(); 
    
    public Cliente() {
    }
    
    public Cliente(String nombre) {
        this.nombre = nombre;
        contador++;
    }

    public Cliente(String nombre, long saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public Cliente(long DNI) {
        this.saldo = DNI;
    }

    public int getContador() {
        return contador;
    }
    
      
    
    
    
    public void agregarTarjeta(Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }
    
    public String reporteTarjetas(){
        String mensaje = " ";
        mensaje +=  "Mi nombre es: " + nombre + '\n';
        for(Tarjeta tarjeta : tarjetas){
            mensaje += tarjeta.reporte();
            mensaje += '\n';
        }
        return mensaje;
        
    }
}

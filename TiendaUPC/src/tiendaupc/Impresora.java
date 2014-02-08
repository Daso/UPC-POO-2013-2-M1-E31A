package tiendaupc;

public abstract class Impresora {
    
    public static String imprimirReporte(Cliente cliente){
        return cliente.reporteTarjetas();
    }
    
}

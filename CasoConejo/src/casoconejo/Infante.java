
package casoconejo;


public class Infante {
    private String nombre;
    private int edad;

    public Infante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String mostrarZanahoria(Conejo conejo){
      String mensaje = "Soy " + nombre + " y juego con " + conejo.getNombre();
      mensaje += " y yo soy el conejo " + conejo.getNombre() + " " + conejo.acercarse();        
      return mensaje;
        
    }
    
    public String tocarOreja(Conejo conejo){
      String mensaje = "Soy " + nombre + " y juego con " + conejo.getNombre();
      mensaje += " y yo soy el conejo " + conejo.getNombre() + " " + conejo.moverCola();
      return mensaje;
    }
}

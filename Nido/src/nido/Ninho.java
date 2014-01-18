
package nido;


public class Ninho {
    private String nombre;
    private int edad;
    private Conejo conejo;
    
    public Ninho(String nombre, String nombreConejo){
       this.nombre = nombre;
       this.conejo = new Conejo(nombreConejo);
       this.edad = 0;
    }    
    
    public String tocarOreja(){
        
        return "Soy "+ nombre + " y estoy tocando la oreja " + conejo.moverColita();
    }
    
    public String mostrarZanahoria(){
        return "Soy " + nombre + " y muestro una zanahoria " + conejo.acercarse();
    }
    
}

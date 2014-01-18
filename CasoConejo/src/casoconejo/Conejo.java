package casoconejo;

public class Conejo {
    private String nombre;

    public Conejo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String moverCola(){
        return " estoy moviendo la cola ";
    }
    
    public String acercarse(){
        return " me estoy acercando ";
    }
    
}

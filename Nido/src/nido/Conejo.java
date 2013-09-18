package nido;

public class Conejo {

    private String nombre;

    public Conejo(String nombre) {
        this.nombre = nombre;
    }

    public String acercarse() {
        return "Soy " + nombre + " y me estoy acercando";
    }

    public String moverColita() {
        return "Soy " + nombre + " y estoy moviendo la colita";
    }
}

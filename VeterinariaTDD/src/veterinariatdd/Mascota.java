package veterinariatdd;

public abstract class Mascota {

    protected String nombre;
    protected String raza;
    protected boolean vacuna;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.vacuna = false;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String identificarse(){
        return "Soy una mascota ";
    }
    
    public abstract double costoBanho();
    
}

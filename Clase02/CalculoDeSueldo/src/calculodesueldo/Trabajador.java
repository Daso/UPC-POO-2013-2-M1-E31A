
package calculodesueldo;


public class Trabajador {
  private String codigo;
  private String nombre;
  private float sueldoBase;

    public Trabajador(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    
    
    public String getCodigo() {
        return codigo;
    }
  
    public double calcularSueldo(double ventas){
        return (sueldoBase + (ventas * 0.1));
    }
  
  
}

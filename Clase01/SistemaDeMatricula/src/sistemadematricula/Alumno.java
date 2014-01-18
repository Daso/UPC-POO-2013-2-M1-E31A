package sistemadematricula;


public class Alumno {
    private String codigo;
    private String nombre;
    
    public void asignarCodigo(String codigoRecibido){
        codigo = codigoRecibido;
    }
    
    public void asignarNombre(String nombreRecibido){
        nombre = nombreRecibido;
    }    
    
    public String saludo(){
       return "Mi código: " + codigo + " nombre: " + nombre; 
    }
    
    
}


package veterinaria;


public class Mascota {
    
    private String nombre;
    private String raza;
    private int edad;
    
    public void bautizar(String nombre){
        this.nombre = nombre;
    }
    
    public String comer(){
        return "Estoy comiendo";        
    }
    
    public String caminar(){
        return "Estoy caminando";
    }    
}
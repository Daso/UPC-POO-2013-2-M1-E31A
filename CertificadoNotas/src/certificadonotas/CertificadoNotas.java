
package certificadonotas;


public class CertificadoNotas {

    
    public static void main(String[] args) {
        
    }

    public String crearCurso(String nombre) {
        Curso curso = new Curso(nombre);
        return curso.getNombre();
    }

    
}

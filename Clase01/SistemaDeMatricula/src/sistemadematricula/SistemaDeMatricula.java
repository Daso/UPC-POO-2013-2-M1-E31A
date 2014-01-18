package sistemadematricula;

public class SistemaDeMatricula {
    
    public static void main(String[] args) {
       Alumno alumno = new Alumno();
       alumno.asignarCodigo("0009");
       alumno.asignarNombre("Carlos");
       
       System.out.println(alumno.saludo());     
    }
}

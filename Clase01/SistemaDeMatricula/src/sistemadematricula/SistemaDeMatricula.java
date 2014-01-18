package sistemadematricula;

public class SistemaDeMatricula {
    
    public static void main(String[] args) {
      Alumno alumno1 = new Alumno("001", "Carlos");
      Alumno alumno2 = new Alumno("002", "Pedro");
      Alumno alumno3 = new Alumno("003", "Sophia");
      Alumno alumno4 = new Alumno("004", "July");
      
      Curso curso01 = new Curso("MBI");
      Curso curso02 = new Curso("Inglés II");
      
      curso01.matricularAlumno(alumno1);
      curso01.matricularAlumno(alumno2);
      curso01.matricularAlumno(alumno4);
      
      curso02.matricularAlumno(alumno4);
      curso02.matricularAlumno(alumno3);
      
      System.out.println(curso01.listaDeMatriculados());
      System.out.println(curso02.listaDeMatriculados());
      
    }
}

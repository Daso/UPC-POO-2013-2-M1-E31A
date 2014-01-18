package sistemadematricula;

import java.util.ArrayList;


public class Curso {    
    
    private String nombre; 
    private ArrayList<Alumno> participantes = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getParticipantes() {
        return participantes;
    }

    public void matricularAlumno(Alumno alumno){
        participantes.add(alumno);
    }
    
    public String listaDeMatriculados(){        
        String mensaje = "";
        mensaje += '\n';
        mensaje += nombre;
        mensaje += '\n';
        mensaje += "------";
        mensaje += '\n';
        for(Alumno alumno : participantes){
            mensaje += alumno.getNombre();
            mensaje += '\n';
        }
        mensaje += "------";
        return mensaje;
    }
}


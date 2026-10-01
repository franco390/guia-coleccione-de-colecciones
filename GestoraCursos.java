package Model;

import java.util.HashMap;
import java.util.HashSet;

public class GestoraCursos {

    private HashMap<String, HashSet<Alumno>> cursos;

    public GestoraCursos() {
        this.cursos = new HashMap<>();
    }

    public boolean agregarAlumno (String nombre, Alumno alumno){

        if(cursos.containsKey(nombre)){
            return false;
        }
        cursos.put(nombre, new HashSet<>());
        return true;

    }

    public boolean inscribirAlumno(String cursoDeterminado, Alumno alumno){

        if(cursos.containsKey(cursoDeterminado)){
            return false;
        }

        return cursos.get(cursoDeterminado).add(alumno);
    }

    public boolean eliminarAlumno(String nombreCurso, String dni){

        if (!cursos.containsKey(nombreCurso)){
            return false;
        }

        HashSet<Alumno> alumnosCursos = cursos.get(nombreCurso);

        for (Alumno a : alumnosCursos){
            if (a.getDni().equals(dni)){

                alumnosCursos.remove(a);
                return true;
            }
        }
        return false;
    }

    public String consultarAlumno(String nombreCurso){

        if (!cursos.containsKey(nombreCurso)){
            return "El curso " + nombreCurso + "no existe";
        }

        StringBuilder sb = new StringBuilder();

        HashSet<Alumno> alumnosCursos = cursos.get(nombreCurso);

        for (Alumno a : alumnosCursos){

            sb.append("DNI: ").append(a.getDni())
                    .append("Nombre: ").append(a.getNombre())
                    .append("Apellido: ").append(a.getApellido());

        }
        return sb.toString();
    }

    public String buscarAlumno(String nombreCurso){

        if (!cursos.containsKey(nombreCurso)){

            return "El alumno no existe.";
        }

        HashSet<Alumno> alumnosCursos = new HashSet<>();

        for ()
    }


}

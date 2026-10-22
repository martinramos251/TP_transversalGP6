package Vista;

import Entidades.Alumno;

/* Esta clase fue hecha para tener otro toString para la clase Alumno.
Crear un metodo en la clase alumno especialmente para mostrar sus datos ya no era una opcion viable). */
public class AlumnoString {
    private Alumno alumno;

    public AlumnoString(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    @Override
    public String toString() {
        return "DNI: " + alumno.getDni() + "  -  " + alumno.getNombre();
    }   
}

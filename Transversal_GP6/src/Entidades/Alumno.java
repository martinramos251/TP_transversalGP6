package Entidades;

import java.time.LocalDate;

public class Alumno {
    int idAlumno = 0;
    int dni;
    String nombre;
    LocalDate fechaN;
    boolean activo;

    public Alumno() {
    }

    public Alumno(int dni, String nombre, LocalDate fechaN, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

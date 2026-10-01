package Entidades;

import java.time.LocalDate;

public class Alumno {
    int idAlumno;
    int dni;
    String nombre;
    LocalDate fechaNac;
    boolean activo;

    public Alumno() {
    }

    public Alumno(int dni, String nombre, LocalDate fechaN, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaN;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", dni=" + dni + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", activo=" + activo + '}';
    }
    
    
}

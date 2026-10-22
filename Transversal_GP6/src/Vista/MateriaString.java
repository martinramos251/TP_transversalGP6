package Vista;

import Entidades.Materia;

/* Esta clase fue hecha para tener otro toString para la clase Materia.
Crear un metodo en la clase materia especialmente para mostrar sus datos ya no era una opcion viable). */
public class MateriaString {
    private Materia materia;

    public MateriaString(Materia materia) {
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return "ID: " + materia.getIdMateria() + "  -  " + materia.getNombre();
    }
}

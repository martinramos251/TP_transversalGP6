package Vista;

import Entidades.Alumno;
import Entidades.Cursada;
import Entidades.Materia;
import Persistencia.AlumnoData;
import Persistencia.MateriaData;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MateriasAlumnos extends javax.swing.JInternalFrame {
    //Crea el modelo por default de la tabla y sobrescribe el metodo de la clase para hacer que las celdas no sean editabes.
    private DefaultTableModel modeloAlumno = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modeloCursada = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    //Creacion de un objeto AlumnoData, MateriaData y los ArrayList donde estaran todas las materias y alumnos traidos de la base de datos.
    AlumnoData ad;
    MateriaData md;
    List<Alumno> allAlumnos;
    List<Materia> allMaterias;
    
    public MateriasAlumnos() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);
        
        //Inicializa el objeto de tipo AlumnoData y MateriaData, carga los respectivos ArrayList.
        try {
            ad = new AlumnoData();
            md = new MateriaData();
            allAlumnos = ad.listarAlumnos();
            allMaterias = md.listarMaterias();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        cargarCabeceras();
        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCBmaterias = new javax.swing.JComboBox<>();
        JLfiltrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTalumnos = new javax.swing.JTable();
        JCBalumnos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTcursadas = new javax.swing.JTable();
        JLcursadaNombre = new javax.swing.JLabel();
        JLporNombre1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ver Materias de Alumno");

        JCBmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBmateriasActionPerformed(evt);
            }
        });

        JLfiltrar.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        JLfiltrar.setText("Filtrar");

        JTalumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTalumnos);

        JCBalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBalumnosActionPerformed(evt);
            }
        });

        JTcursadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTcursadas);

        JLcursadaNombre.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JLcursadaNombre.setText("VER CURSADAS POR NOMBRE");

        JLporNombre1.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JLporNombre1.setText("POR MATERIA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(JLfiltrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(JLporNombre1)
                                .addGap(60, 60, 60)
                                .addComponent(JCBmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLcursadaNombre)
                                    .addComponent(JCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JLfiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLporNombre1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(JLcursadaNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Muestra todos los alumnos que estan cursando la materia que se seleccione.
    private void JCBmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBmateriasActionPerformed
        if (JCBmaterias.getSelectedIndex() != -1) {
            borrarFilasA();
            try {
                MateriaString ms = (MateriaString) JCBmaterias.getSelectedItem();
                if (ms != null) {
                    Materia m = ms.getMateria();
                    for (Cursada c : Menu.cd.inscripcionesMateria(m.getNombre())) {
                        modeloAlumno.addRow(new Object[]{c.getAlumno().getIdAlumno(), c.getAlumno().getDni(),
                            c.getAlumno().getNombre(), c.getAlumno().getFechaNac(), c.getAlumno().getActivo()});
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JCBmateriasActionPerformed
    
    //Muestra todas las cursadas que tiene el alumno seleccionado.
    private void JCBalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBalumnosActionPerformed
        if (JCBalumnos.getSelectedIndex() != -1) {
            borrarFilasC();
            try {
                AlumnoString as = (AlumnoString) JCBalumnos.getSelectedItem();
                if (as != null) {
                    Alumno a = as.getAlumno();
                    for (Cursada c : Menu.cd.inscripcionesAlumno(a.getNombre())) {
                        modeloCursada.addRow(new Object[]{c.getIdCursada(), c.getAlumno().getIdAlumno(), c.getMateria().getNombre(), c.getNota()});
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JCBalumnosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<AlumnoString> JCBalumnos;
    private javax.swing.JComboBox<MateriaString> JCBmaterias;
    private javax.swing.JLabel JLcursadaNombre;
    private javax.swing.JLabel JLfiltrar;
    private javax.swing.JLabel JLporNombre1;
    private javax.swing.JTable JTalumnos;
    private javax.swing.JTable JTcursadas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    /**
    * Agrega las cabeceras a las tablas.
    */
    private void cargarCabeceras() {
        modeloAlumno.addColumn("idAlumno");
        modeloAlumno.addColumn("Dni");
        modeloAlumno.addColumn("Nombre");
        modeloAlumno.addColumn("FechaNacimiento");
        modeloAlumno.addColumn("Activo");
        JTalumnos.setModel(modeloAlumno);
        
        modeloCursada.addColumn("idCursada");
        modeloCursada.addColumn("idAlumno");
        modeloCursada.addColumn("Materia");
        modeloCursada.addColumn("Nota");
        JTcursadas.setModel(modeloCursada);
    }
    
    /**
    * Permite borrar las filas de la tabla cursada segun el alumno que se seleccione.
    */
    private void borrarFilasA() {
        int filas = JTalumnos.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloAlumno.removeRow(f);
        }
    }
    
    /**
    * Permite borrar las filas de la tabla alumnos segun la materia que se seleccione.
    */
    private void borrarFilasC() {
        int filas = JTcursadas.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloCursada.removeRow(f);
        }
    }
    
    /**
     * Carga los respectivos ComboBox de materias y cursadas.
     */
    private void cargarComboBox(){
        for (Materia m : allMaterias) {
           JCBmaterias.addItem(new MateriaString(m)); 
        }
        
        for (Alumno a : allAlumnos) {
            JCBalumnos.addItem(new AlumnoString(a));
        }
    }
}

package Vista;

import Entidades.Alumno;
import Entidades.Materia;
import Entidades.Cursada;
import Persistencia.AlumnoData;
import Persistencia.MateriaData;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InscribirAlumno extends javax.swing.JInternalFrame {

    //Crea el modelo por default de la tabla para materias y alumnos, sobrescribe el metodo de la clase para hacer que las celdas no sean editabes.
    private DefaultTableModel modeloMateria = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modeloAlumno = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    //Creacion de un objeto AlumnoData, MateriaData y los ArrayList donde estaran todas las materias y alumnos traidos de la base de datos.
    AlumnoData ad;
    MateriaData md;
    List<Alumno> allAlumnosAct;
    List<Materia> allMateriasAct;

    public InscribirAlumno() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);

        //Evita que se puedan seleccionar ambos radioButtons.
        BGinscripto.add(JRBinscriptas);
        BGinscripto.add(JRBnoInscriptas);

        //Este conjunto permite que solo se pueda buscar un alumno por sola una opcion (id o dni), y evita que se puedan seleccionar ambos radioButtons.
        JRBid.setSelected(true);
        BGbuscar.add(JRBid);
        BGbuscar.add(JRBdni);
        JTFbuscarDni.setEnabled(false);

        //Inicializa el objeto de tipo AlumnoData y MateriaData, carga los respectivos ArrayList.
        try {
            ad = new AlumnoData();
            md = new MateriaData();
            allAlumnosAct = ad.listarAlumnosAlta();
            allMateriasAct = md.listarMateriasAlta();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        cargarCabeceras();
        cargarDatosAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGinscripto = new javax.swing.ButtonGroup();
        BGbuscar = new javax.swing.ButtonGroup();
        JLinscripciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTmaterias = new javax.swing.JTable();
        JBanular = new javax.swing.JButton();
        JRBinscriptas = new javax.swing.JRadioButton();
        JRBnoInscriptas = new javax.swing.JRadioButton();
        JBinscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTalumnos = new javax.swing.JTable();
        JPbuscar_id = new javax.swing.JPanel();
        JLid = new javax.swing.JLabel();
        JRBid = new javax.swing.JRadioButton();
        JTFid = new javax.swing.JTextField();
        JLbuscarAlumnos = new javax.swing.JLabel();
        JLbuscarDni = new javax.swing.JLabel();
        JTFbuscarDni = new javax.swing.JTextField();
        JRBdni = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Inscribir a Materia");

        JLinscripciones.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        JLinscripciones.setText("Inscripciones");

        JTmaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JTmaterias);

        JBanular.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JBanular.setText("Anular inscripcion");
        JBanular.setEnabled(false);
        JBanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBanularActionPerformed(evt);
            }
        });

        JRBinscriptas.setText("Materias Inscriptas");
        JRBinscriptas.setEnabled(false);
        JRBinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBinscriptasActionPerformed(evt);
            }
        });

        JRBnoInscriptas.setText("Materias no inscriptas");
        JRBnoInscriptas.setEnabled(false);
        JRBnoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnoInscriptasActionPerformed(evt);
            }
        });

        JBinscribir.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JBinscribir.setText("Inscribir");
        JBinscribir.setEnabled(false);
        JBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBinscribirActionPerformed(evt);
            }
        });

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
        JTalumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTalumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTalumnos);

        JPbuscar_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLid.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLid.setText("ID");

        JRBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBidActionPerformed(evt);
            }
        });

        JTFid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFidKeyReleased(evt);
            }
        });

        JLbuscarAlumnos.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JLbuscarAlumnos.setText("Buscar Alumno: ");

        JLbuscarDni.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLbuscarDni.setText("DNI");

        JTFbuscarDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFbuscarDniKeyReleased(evt);
            }
        });

        JRBdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBdniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPbuscar_idLayout = new javax.swing.GroupLayout(JPbuscar_id);
        JPbuscar_id.setLayout(JPbuscar_idLayout);
        JPbuscar_idLayout.setHorizontalGroup(
            JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbuscar_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLbuscarAlumnos)
                .addGap(12, 12, 12)
                .addComponent(JLid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRBid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(JLbuscarDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFbuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRBdni)
                .addGap(18, 18, 18))
        );
        JPbuscar_idLayout.setVerticalGroup(
            JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbuscar_idLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBdni)
                    .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLbuscarDni)
                        .addComponent(JTFbuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLid)
                        .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLbuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JRBid))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(JRBinscriptas)
                                .addGap(29, 29, 29)
                                .addComponent(JRBnoInscriptas))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(JBinscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBanular, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLinscripciones)
                        .addGap(311, 311, 311))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLinscripciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBinscriptas)
                    .addComponent(JRBnoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBanular, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBinscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Eliminar elementos de la tabla mientras se busca (por id).
    private void JTFidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFidKeyReleased
        borrarFilas();
        for (Alumno a : allAlumnosAct) {
            String id = String.valueOf(a.getIdAlumno());
            if (id.startsWith(JTFid.getText())) {
                modeloAlumno.addRow(new Object[]{a.getIdAlumno(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo()});
            }
        }
        BGinscripto.clearSelection();
        modeloMateria.setRowCount(0);
    }//GEN-LAST:event_JTFidKeyReleased

    //Eliminar elementos de la tabla mientras se busca (por DNI).
    private void JTFbuscarDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFbuscarDniKeyReleased
        borrarFilas();
        for (Alumno a : allAlumnosAct) {
            String dni = String.valueOf(a.getDni());
            if (dni.startsWith(JTFbuscarDni.getText())) {
                modeloAlumno.addRow(new Object[]{a.getIdAlumno(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo()});
            }
        }
        BGinscripto.clearSelection();
        modeloMateria.setRowCount(0);
    }//GEN-LAST:event_JTFbuscarDniKeyReleased

    //Limpieza al intentar buscar por dni, bloqueo campo id.
    private void JRBdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBdniActionPerformed
        borrarFilas();
        JTFid.setEnabled(false);
        JTFbuscarDni.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_JRBdniActionPerformed

    //Limpieza al intentar buscar por id, bloqueo campo dni.
    private void JRBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBidActionPerformed
        borrarFilas();
        JTFid.setEnabled(true);
        JTFbuscarDni.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_JRBidActionPerformed
    
    //Habilita los botones para ver las meterias inscriptas/no inscriptas cuando se selecciona un elemento de la tabla.
    private void JTalumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTalumnosMouseClicked
        BGinscripto.clearSelection();
        modeloMateria.setRowCount(0);
        JBanular.setEnabled(false);
        JBinscribir.setEnabled(false);
        
        int filaS = JTalumnos.getSelectedRow();
        if (filaS != -1) {
            JRBinscriptas.setEnabled(true);
            JRBnoInscriptas.setEnabled(true);
        }
    }//GEN-LAST:event_JTalumnosMouseClicked
    
    /* Permite que al hacer click en los radioButtons para filtrar entre materias inscriptas y no inscriptas,
    se carguen en la tabla las materias que correspondan. */
    private void JRBinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBinscriptasActionPerformed
        modeloMateria.setRowCount(0);
        int filaS = JTalumnos.getSelectedRow();
        if (filaS != -1) {
            int dniAlumno = (int) JTalumnos.getValueAt(filaS, 1);
            JBinscribir.setEnabled(false);
            JBanular.setEnabled(true);
            try {
                for (Materia m : Menu.cd.siInscripto(dniAlumno)) {
                    modeloMateria.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getEstado()});
                }      
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JRBinscriptasActionPerformed

    private void JRBnoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnoInscriptasActionPerformed
        modeloMateria.setRowCount(0);
        int filaS = JTalumnos.getSelectedRow();
        if (filaS != -1) {
            int dniAlumno = (int) JTalumnos.getValueAt(filaS, 1);
            JBanular.setEnabled(false);
            JBinscribir.setEnabled(true);
            try {
                for (Materia m : Menu.cd.noInscripto(dniAlumno)) {
                    modeloMateria.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getEstado()});
                }   
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JRBnoInscriptasActionPerformed
    
    //Permite inscribir un alumno a una materia.
    private void JBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBinscribirActionPerformed
        Cursada c;
        Alumno a;
        Materia m;
        
        int filaAlumnoS = JTalumnos.getSelectedRow();
        int filaMateriaS = JTmaterias.getSelectedRow();
        if (filaAlumnoS != -1 && filaMateriaS != -1) {
            int idAlumno = (int) JTalumnos.getValueAt(filaAlumnoS, 0);
            int idMateria = (int) JTmaterias.getValueAt(filaMateriaS, 0);
            a = new Alumno();
            m = new Materia();
            a.setIdAlumno(idAlumno);
            m.setIdMateria(idMateria);
            c = new Cursada(a, m);
            try {
                Menu.cd.inscribirAlumnoMateria(c);
                modeloMateria.removeRow(filaMateriaS);
                JOptionPane.showMessageDialog(this, "El alumno fue inscripto con éxito!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno y una materia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBinscribirActionPerformed
    
    //Permite anular la inscripcion de un alumno a una materia.
    private void JBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBanularActionPerformed
        Alumno a;
        Materia m;
        
        int filaAlumnoS = JTalumnos.getSelectedRow();
        int filaMateriaS = JTmaterias.getSelectedRow();
        if (filaAlumnoS != -1 && filaMateriaS != -1) {
            int idAlumno = (int) JTalumnos.getValueAt(filaAlumnoS, 0);
            int idMateria = (int) JTmaterias.getValueAt(filaMateriaS, 0);
            a = new Alumno();
            m = new Materia();
            a.setIdAlumno(idAlumno);
            m.setIdMateria(idMateria);
            try {
                Menu.cd.borrarInscripcion(idAlumno, idMateria);
                modeloMateria.removeRow(filaMateriaS);
                JOptionPane.showMessageDialog(this, "Inscripcion anulada con éxito!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno y una materia", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBanularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGbuscar;
    private javax.swing.ButtonGroup BGinscripto;
    private javax.swing.JButton JBanular;
    private javax.swing.JButton JBinscribir;
    private javax.swing.JLabel JLbuscarAlumnos;
    private javax.swing.JLabel JLbuscarDni;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLinscripciones;
    private javax.swing.JPanel JPbuscar_id;
    private javax.swing.JRadioButton JRBdni;
    private javax.swing.JRadioButton JRBid;
    private javax.swing.JRadioButton JRBinscriptas;
    private javax.swing.JRadioButton JRBnoInscriptas;
    private javax.swing.JTextField JTFbuscarDni;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTable JTalumnos;
    private javax.swing.JTable JTmaterias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    /**
     * Agrega las cabeceras a las tablas.
     */
    private void cargarCabeceras() {
        modeloMateria.addColumn("idMateria");
        modeloMateria.addColumn("Materia");

        modeloAlumno.addColumn("idAlumno");
        modeloAlumno.addColumn("Dni");
        modeloAlumno.addColumn("Nombre");
        modeloAlumno.addColumn("FechaNacimiento");
        modeloAlumno.addColumn("Activo");

        JTmaterias.setModel(modeloMateria);
        JTalumnos.setModel(modeloAlumno);
    }

    /**
    * Carga los alumnos y las materias a las tablas.
    */
    private void cargarAllDatos() {
        for (Alumno a : allAlumnosAct) {
            modeloAlumno.addRow(new Object[]{a.getIdAlumno(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo()});
        }
        for (Materia m : allMateriasAct) {
            modeloMateria.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getEstado()});
        }
    }

    /**
     * Carga los alumnos a la tabla.
     */
    private void cargarDatosAlumnos() {
        for (Alumno a : allAlumnosAct) {
            modeloAlumno.addRow(new Object[]{a.getIdAlumno(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo()});
        }
    }

    /**
     * Carga las materias a la tabla.
     */
    private void cargarDatosMateria() {
        for (Materia m : allMateriasAct) {
            modeloMateria.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getEstado()});
        }
    }

    /**
     * Muestra todas las cursadas del ArrayList.
     */
    private void mostrarLista() {
        System.out.println("------------------------");
        for (Cursada c : Menu.allCursadas) {
            System.out.println(c);
            System.out.println("------------------------");
        }
        System.out.println("");
        System.out.println("");
    }

    /**
     * Permite borrar las filas mientras se encribe en los campos de filtrar.
     */
    private void borrarFilas() {
        int filas = JTalumnos.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloAlumno.removeRow(f);
        }
    }

    /**
     * Vacia/restablece todos los campos.
     */
    private void limpiar() {
        JTFid.setText("");
        JTFbuscarDni.setText("");
        modeloAlumno.setRowCount(0);
        modeloMateria.setRowCount(0);
        cargarDatosAlumnos();
        JBinscribir.setEnabled(false);
        JBanular.setEnabled(false);
        BGinscripto.clearSelection();
        JRBinscriptas.setEnabled(false);
        JRBnoInscriptas.setEnabled(false);
        JBanular.setEnabled(false);
        JBinscribir.setEnabled(false);
    }   

}

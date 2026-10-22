package Vista;

import Entidades.Alumno;
import Persistencia.AlumnoData;
import java.awt.Image;
import java.time.ZoneId;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioAlumnos extends javax.swing.JInternalFrame {
    //Crea el modelo por default de la tabla y sobrescribe el metodo de la clase para hacer que las celdas no sean editabes.
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    //Creacion de un objeto AlumnoData y el ArrayList donde estaran todos los alumnos traidos de la base de datos.
    AlumnoData ad;
    List<Alumno> allAlumnos;

    public FormularioAlumnos() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);

        //Este conjunto permite que solo se pueda buscar un alumno por sola una opcion (id o dni), y evita que se puedan seleccionar ambos radioButtons.
        JRBid.setSelected(true);
        BGbuscar.add(JRBid);
        BGbuscar.add(JRBdni);
        JTFbuscarDni.setEnabled(false);

        //Inicializa el objeto de tipo AlumnoData y carga el ArrayList de alumnos (allAlumnos).
        try {
            ad = new AlumnoData();
            allAlumnos = ad.listarAlumnos();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        mostrarLista();
        cargarCabecera();
        cargarDatos();

        //Redimensionar iconos con el metodo.
        JBborrar.setIcon(redimensionIcon("/Imagen/eliminar.png", 25, 25));
        JBactualizar.setIcon(redimensionIcon("/Imagen/actualizar.png", 25, 25));
        JBlimpiar.setIcon(redimensionIcon("/Imagen/escoba.png", 25, 25));
        JBalta.setIcon(redimensionIcon("/Imagen/check.png", 25, 25));
        JBbaja.setIcon(redimensionIcon("/Imagen/cruz.png", 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGbuscar = new javax.swing.ButtonGroup();
        JLalumnos = new javax.swing.JLabel();
        JPbuscar_id = new javax.swing.JPanel();
        JLid = new javax.swing.JLabel();
        JRBid = new javax.swing.JRadioButton();
        JTFid = new javax.swing.JTextField();
        JLbuscarAlumnos = new javax.swing.JLabel();
        JLbuscarDni = new javax.swing.JLabel();
        JTFbuscarDni = new javax.swing.JTextField();
        JRBdni = new javax.swing.JRadioButton();
        JLnombre = new javax.swing.JLabel();
        JTFnombre = new javax.swing.JTextField();
        JLfechaNac = new javax.swing.JLabel();
        JDCfechaNac = new com.toedter.calendar.JDateChooser();
        JLactivo = new javax.swing.JLabel();
        JCactivo = new javax.swing.JCheckBox();
        JBguardar = new javax.swing.JButton();
        JBborrar = new javax.swing.JButton();
        JBactualizar = new javax.swing.JButton();
        JBlimpiar = new javax.swing.JButton();
        JBalta = new javax.swing.JButton();
        JBbaja = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTalumnos = new javax.swing.JTable();
        JLdni = new javax.swing.JLabel();
        JTFdni = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario de Alumnos");

        JLalumnos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        JLalumnos.setText("Alumnos");

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

        JLnombre.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLnombre.setText("NOMBRE:");

        JTFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFnombreKeyTyped(evt);
            }
        });

        JLfechaNac.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLfechaNac.setText("Fecha de nacimiento :");

        JDCfechaNac.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JDCfechaNacPropertyChange(evt);
            }
        });

        JLactivo.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLactivo.setText("Activo");

        JCactivo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JCactivo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        JBguardar.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/guardar.png"))); // NOI18N
        JBguardar.setText("Guardar");
        JBguardar.setEnabled(false);
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        JBborrar.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBborrar.setText("Borrar");
        JBborrar.setEnabled(false);
        JBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBborrarActionPerformed(evt);
            }
        });

        JBactualizar.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBactualizar.setText("Actualizar");
        JBactualizar.setEnabled(false);
        JBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactualizarActionPerformed(evt);
            }
        });

        JBlimpiar.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBlimpiar.setText("Limpiar");
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });

        JBalta.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBalta.setText("Dar de Alta");
        JBalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBaltaActionPerformed(evt);
            }
        });

        JBbaja.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBbaja.setText("Dar de Baja");
        JBbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbajaActionPerformed(evt);
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
        jScrollPane2.setViewportView(JTalumnos);

        JLdni.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLdni.setText("DNI:");

        JTFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFdniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(JLalumnos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBbaja, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(JBalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLactivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCactivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLfechaNac)
                                .addGap(18, 18, 18)
                                .addComponent(JDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(JLdni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JLalumnos)
                .addGap(29, 29, 29)
                .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLdni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLfechaNac))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLactivo)
                    .addComponent(JCactivo))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBalta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Borrar un alumno.
    private void JBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBborrarActionPerformed
        Iterator<Alumno> it = allAlumnos.iterator(); //Se crea para borrar tambien al alumno del ArrayList.
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar al alumno?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        int filaS = JTalumnos.getSelectedRow(); //Obtiene el indice de la fila que el usuario selecciono en la tabla.
        if (filaS != -1) {

            int id = (int) JTalumnos.getValueAt(filaS, 0); //Obtiene el valor que se encuentra en esa fila justo en esa columna.
            if (respuesta == JOptionPane.YES_OPTION) { //Si la respuesta fue "Si".
                while (it.hasNext()) {
                    if (it.next().getIdAlumno() == id) { //Se fija que el valor del idAlumno coincide con el valor extraido de esa fila seleccionada en la columna idAlumno.
                        it.remove(); //Si coincide lo elimina.
                        break;
                    }
                }
                
                try {
                    //Permite que si se borra el alumno, tambien se va a eliminar la cursada que contenga el id del alumno eliminado.
                    Menu.cd.borrarInscripcion(id);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                ad.borrarAlumno(id); //Ejecuta el metodo de AlumnoData para borrar al alumno de la base de datos.
                modelo.removeRow(filaS); //Elimina al alumno seleccionado de la tabla.
                limpiar(); //Limpia todo al terminar.
                mostrarLista(); //Muestra la lista para corroborar que se actualizo el ArrayList.
                JOptionPane.showMessageDialog(this, "Alumno eliminado!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBborrarActionPerformed

    //Limpia todo.
    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_JBlimpiarActionPerformed

    //Rellenar los campos al hacer click en la tabla.
    private void JTalumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTalumnosMouseClicked
        int filaS = JTalumnos.getSelectedRow();
        if (filaS != -1) {
            int dni = (int) JTalumnos.getValueAt(filaS, 1);
            String nombre = (String) JTalumnos.getValueAt(filaS, 2);
            LocalDate fechaNacimiento = (LocalDate) JTalumnos.getValueAt(filaS, 3);
            boolean activo = (boolean) JTalumnos.getValueAt(filaS, 4);
            Date fechaNac = Date.from(fechaNacimiento.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

            JTFdni.setText(dni + "");
            JTFnombre.setText(nombre);
            JDCfechaNac.setDate(fechaNac);
            JCactivo.setSelected(activo);
        }

        JBborrar.setEnabled(true);
        JBactualizar.setEnabled(true);
        JCactivo.setEnabled(false);
    }//GEN-LAST:event_JTalumnosMouseClicked

    //Eliminar elementos de la tabla mientras se busca (por dni).
    private void JTFbuscarDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFbuscarDniKeyReleased
        borrarFilas();
        for (Alumno a : allAlumnos) {
            String dni = String.valueOf(a.getDni());
            if (dni.startsWith(JTFbuscarDni.getText())) {
                modelo.addRow(new Object[]{a.getIdAlumno(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo()});
            }
        }
    }//GEN-LAST:event_JTFbuscarDniKeyReleased

    //Eliminar elementos de la tabla mientras se busca (por id).
    private void JTFidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFidKeyReleased
        borrarFilas();
        for (Alumno a : allAlumnos) {
            String id = String.valueOf(a.getIdAlumno());
            if (id.startsWith(JTFid.getText())) {
                modelo.addRow(new Object[]{a.getIdAlumno(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo()});
            }
        }
    }//GEN-LAST:event_JTFidKeyReleased

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

    //Guarda un alumno (realiza verificaciones).
    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        try {
            //Variables para almacenar los datos extraidos.
            String dniTexto = JTFdni.getText().trim();
            String nombre = JTFnombre.getText().trim();
            LocalDate fechaNacimiento = JDCfechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean activo = JCactivo.isSelected();
            Alumno a;

            //Varibales para la verificacion de datos.
            int longitudDni = dniTexto.length();
            boolean disparador = true;
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaMaxima = fechaActual.minusYears(16);

            //Verificacion de datos.
            if (longitudDni == 7 || longitudDni == 8) { //Verficacion de DNI (cantidad de digitos).
                int dni = Integer.parseInt(dniTexto);
                for (Alumno alu : allAlumnos) { //Recorre el Arraylist para verficacion de DNI repetido.
                    if (alu.getDni() == dni) {
                        disparador = false;
                        break;
                    }
                }
                if (disparador) { //Verficacion de DNI repetido.
                    if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) { //Verficacion de nombre. Funcion que fue investigada, permite que solo acepte letras de la a-z, "Ñ" y tildes (no acepta espacios).
                        if (nombre.length() <= 20) { //Verificacion para que el nombre no supere los 20 caracteres admitidos por la base de datos.
                            if (fechaNacimiento.isBefore(fechaMaxima) || fechaNacimiento.isEqual(fechaMaxima)) { //Verificacion de fecha de nacimiento.
                                a = new Alumno(dni, nombre, fechaNacimiento, activo);
                                ad.guardarAlumno(a);
                                allAlumnos.add(a);
                                limpiar();
                                mostrarLista(); //Muestra la lista para corroborar que se actualizo el ArrayList.
                                JOptionPane.showMessageDialog(this, "Alumno guardado!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Fecha no admitida", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        }else{
                           JOptionPane.showMessageDialog(this, "El nombre debe contener maximo 20 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE); 
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Nombre invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Este DNI ya se encuentra registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DNI invalido, debe contener una combinacion de 7-8 numeros,\nse aceptan solo numeros, sin puntos y espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Datos incompletos/incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Fecha invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBguardarActionPerformed

    //Dar de baja a un alumno.
    private void JBbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbajaActionPerformed
        int filaS = JTalumnos.getSelectedRow();
        if (filaS != -1) { //Solo entra si hay una fila seleccionada.
            int id = (int) JTalumnos.getValueAt(filaS, 0);
            boolean estado = (boolean) JTalumnos.getValueAt(filaS, 4);
            if (estado) {
                ad.altaBajaLogica(id, false);
                for (Alumno a : allAlumnos) { //Recorre el ArrayList para verificar si el alumno esta dado de baja o alta.
                    if (a.getIdAlumno() == id) {
                        a.setActivo(false);
                        modelo.setValueAt(false, filaS, 4);
                        JCactivo.setSelected(false);
                        break;
                    }
                }
                try {
                    //Permite que si se da de baja un alumno, se va a eliminar la cursada que contenga el id del alumno dado de baja.
                    Menu.cd.borrarInscripcion(id);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(this, "El alumno ha sido dado de baja con exito!");
            } else {
                JOptionPane.showMessageDialog(this, "No puede dar de baja a un alumno que ya lo esta! :b", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBbajaActionPerformed

    //Dar de alta a un alumno.
    private void JBaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaltaActionPerformed
        int filaS = JTalumnos.getSelectedRow(); //Traer la fila que estoy seleccionando.
        if (filaS != -1) {
            int id = (int) JTalumnos.getValueAt(filaS, 0);
            boolean estado = (boolean) JTalumnos.getValueAt(filaS, 4);
            if (estado) {
                JOptionPane.showMessageDialog(this, "No puede dar de alta a un alumno que ya lo esta! :b", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ad.altaBajaLogica(id, true);
                for (Alumno a : allAlumnos) { //Recorre el ArrayList para verificar si el alumno esta dado de baja o alta.
                    if (a.getIdAlumno() == id) {
                        a.setActivo(true);
                        modelo.setValueAt(true, filaS, 4);
                        JCactivo.setSelected(true);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(this, "El alumno ha sido dado de alta con exito!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBaltaActionPerformed

    //Habilita el boton guardar cuando interactua con la fecha (todos los campos tienen que estar llenos).
    private void JDCfechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JDCfechaNacPropertyChange
        habilitarGuardar();
    }//GEN-LAST:event_JDCfechaNacPropertyChange

    //Habilita el boton guardar cuando interactua con el campo de nombre (todos los campos tienen que estar llenos).
    private void JTFnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFnombreKeyTyped
        habilitarGuardar();
    }//GEN-LAST:event_JTFnombreKeyTyped

    //Habilita el boton guardar cuando interactua con el campo de DNI (todos los campos tienen que estar llenos).
    private void JTFdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFdniKeyTyped
        habilitarGuardar();
    }//GEN-LAST:event_JTFdniKeyTyped

    //Permite actualizar los datos de un alumno.
    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        try {
            //Variables para almacenar los datos extraidos.
            String dniTexto = JTFdni.getText().trim();
            String nombre = JTFnombre.getText().trim();
            LocalDate fechaNacimiento = JDCfechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean activo = JCactivo.isSelected();
            Alumno a;

            //Varibales para la verificacion de datos.
            int longitudDni = dniTexto.length();
            boolean disparador = true;
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaMaxima = fechaActual.minusYears(16);
            int filaS = JTalumnos.getSelectedRow();

            //Verificacion de datos.    
            if (filaS != -1) { //Todo funcionara si hay una fila seleccionada.
                int id = (int) JTalumnos.getValueAt(filaS, 0);
                if (longitudDni == 7 || longitudDni == 8) { //Verficacion de DNI (cantidad de digitos).
                    int dni = Integer.parseInt(dniTexto);
                    for (Alumno alu : allAlumnos) { //Recorre el Arraylist para verficacion de DNI repetido, evita el DNI del alumno seleccionado.
                        if (alu.getIdAlumno() == id) {
                            continue;
                        }
                        if (alu.getDni() == dni) {
                            disparador = false;
                            break;
                        }
                    }
                    if (disparador) { //Verficacion de DNI repetido.
                        if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) { //Verficacion de nombre. Funcion que fue investigada, permite que solo acepte letras de la a-z, "Ñ" y tildes (no acepta espacios).
                            if (nombre.length() <= 20) { //Verificacion para que el nombre no supere los 20 caracteres admitidos por la base de datos.
                                if (fechaNacimiento.isBefore(fechaMaxima) || fechaNacimiento.isEqual(fechaMaxima)) { //Verificacion de fecha de nacimiento.
                                    a = new Alumno(dni, nombre, fechaNacimiento, activo);
                                    a.setIdAlumno(id);
                                    for (Alumno act : allAlumnos) { //Actualizacion del alumno en el ArrayList para actualizar la tabla.
                                        if (act.getIdAlumno() == id) {
                                            if (act.getDni() != dni) {
                                                act.setDni(dni);
                                                modelo.setValueAt(dni, filaS, 1);
                                            }
                                            if (!act.getNombre().equals(nombre)) {
                                                act.setNombre(nombre);
                                                modelo.setValueAt(nombre, filaS, 2);
                                            }
                                            if (!act.getFechaNac().equals(fechaNacimiento)) {
                                                act.setFechaNac(fechaNacimiento);
                                                modelo.setValueAt(fechaNacimiento, filaS, 3);
                                            }
                                            break;
                                        }
                                    }
                                    ad.actualizarAlumno(a);
                                    limpiar();
                                    mostrarLista(); //Muestra la lista para corroborar que se actualizo el ArrayList.
                                    JOptionPane.showMessageDialog(this, "Alumno actualizado!");
                                } else {
                                    JOptionPane.showMessageDialog(this, "Fecha no admitida", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "El nombre debe contener maximo 20 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Nombre invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Este DNI ya se encuentra registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "DNI invalido, debe contener una combinacion de 7-8 numeros,\nse aceptan solo numeros, sin puntos y espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para actualizar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Datos incompletos/incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Fecha invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGbuscar;
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBalta;
    private javax.swing.JButton JBbaja;
    private javax.swing.JButton JBborrar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JCheckBox JCactivo;
    private com.toedter.calendar.JDateChooser JDCfechaNac;
    private javax.swing.JLabel JLactivo;
    private javax.swing.JLabel JLalumnos;
    private javax.swing.JLabel JLbuscarAlumnos;
    private javax.swing.JLabel JLbuscarDni;
    private javax.swing.JLabel JLdni;
    private javax.swing.JLabel JLfechaNac;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JPanel JPbuscar_id;
    private javax.swing.JRadioButton JRBdni;
    private javax.swing.JRadioButton JRBid;
    private javax.swing.JTextField JTFbuscarDni;
    private javax.swing.JTextField JTFdni;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JTable JTalumnos;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    /**
     * Permite redimensionar a gusto las imagenes.
     *
     * @param ruta
     * @param ancho
     * @param alto
     * @return
     */
    private ImageIcon redimensionIcon(String ruta, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);

        return new ImageIcon(imagenRedimensionada);
    }

    /**
     * Vacia/restablece todos los campos.
     */
    private void limpiar() {
        JTFid.setText("");
        JTFdni.setText("");
        JTFnombre.setText("");
        JTFbuscarDni.setText("");
        JDCfechaNac.setDate(null);
        JCactivo.setSelected(false);
        JCactivo.setEnabled(true);
        modelo.setRowCount(0);
        cargarDatos();
        JBguardar.setEnabled(false);
        JBborrar.setEnabled(false);
        JBactualizar.setEnabled(false);
    }

    /**
     * Agrega las cabeceras a la tabla con sus respectivos nombres.
     */
    private void cargarCabecera() {
        modelo.addColumn("idAlumno");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("FechaNacimiento");
        modelo.addColumn("Activo");

        JTalumnos.setModel(modelo);
    }
    
    /**
     * Muestra todos los alumnos del ArrayList.
     */
    private void mostrarLista() {
        System.out.println("------------------------");
        for (Alumno a : allAlumnos) {
            System.out.println(a);
            System.out.println("------------------------");
        }
        System.out.println("");
        System.out.println("");
    }

    /**
     * Carga los alumnos a la tabla.
     */
    private void cargarDatos() {
        for (Alumno a : allAlumnos) {
            modelo.addRow(new Object[]{a.getIdAlumno(), a.getDni(), a.getNombre(), a.getFechaNac(), a.getActivo()});
        }
    }

    /**
     * Permite borrar las filas mientras se encribe en los campos de filtrar.
     */
    private void borrarFilas() {
        int filas = JTalumnos.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    /**
     * Compruba si todos los campos (nombre, dni y fecha) estan llenos, si lo
     * estan se activa el boton guardar.
     */
    private void habilitarGuardar() {
        boolean fechaLlena = JDCfechaNac.getDate() != null;
        if (!JTFnombre.getText().trim().isEmpty() && !JTFdni.getText().trim().isEmpty() && fechaLlena) {
            JBguardar.setEnabled(true);
        } else {
            JBguardar.setEnabled(false);
        }
    }
}

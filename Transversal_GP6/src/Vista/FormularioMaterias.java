package Vista;

import Entidades.Materia;
import Persistencia.MateriaData;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioMaterias extends javax.swing.JInternalFrame {
    //Crea el modelo por default de la tabla y sobrescribe el metodo de la clase para hacer que las celdas no sean editabes.
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    //Creacion de un objeto MateriaData y el ArrayList donde estaran todos las materias traidas de la base de datos.
    MateriaData md;
    List<Materia> allMaterias = new ArrayList<>();

    public FormularioMaterias() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);

        //Este conjunto permite que solo se pueda buscar una materia por sola una opcion (id o nombre), y evita que se puedan seleccionar ambos radioButtons.
        JRBid.setSelected(true);
        BGfiltrar.add(JRBid);
        BGfiltrar.add(JRBnombre);
        JTFbuscarNombre.setEnabled(false);

        //Inicializa el objeto de tipo MateriaData y carga el ArrayList de materias (allMaterias).
        try {
            md = new MateriaData();
            allMaterias = md.listarMaterias();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        cargarCabecera();
        cargarDatos();
        mostrarMaterias();

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

        BGfiltrar = new javax.swing.ButtonGroup();
        JLinscripciones = new javax.swing.JLabel();
        JLactivo = new javax.swing.JLabel();
        JCestado = new javax.swing.JCheckBox();
        JBguardar = new javax.swing.JButton();
        JBborrar = new javax.swing.JButton();
        JBactualizar = new javax.swing.JButton();
        JBlimpiar = new javax.swing.JButton();
        JBalta = new javax.swing.JButton();
        JBbaja = new javax.swing.JButton();
        JLbuscarMateria = new javax.swing.JLabel();
        JTFnombre = new javax.swing.JTextField();
        JLnombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTmaterias = new javax.swing.JTable();
        JPbuscar_id = new javax.swing.JPanel();
        JLid = new javax.swing.JLabel();
        JRBid = new javax.swing.JRadioButton();
        JTFid = new javax.swing.JTextField();
        JLfiltrarMateria = new javax.swing.JLabel();
        JLbuscarNombre = new javax.swing.JLabel();
        JTFbuscarNombre = new javax.swing.JTextField();
        JRBnombre = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario de Materias");

        JLinscripciones.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        JLinscripciones.setText("Materias");

        JLactivo.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLactivo.setText("Estado");

        JCestado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JCestado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

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

        JLbuscarMateria.setFont(new java.awt.Font("Dubai Medium", 1, 20)); // NOI18N
        JLbuscarMateria.setText("Buscar Materia");

        JTFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFnombreKeyTyped(evt);
            }
        });

        JLnombre.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLnombre.setText("NOMBRE:");

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
        JTmaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTmateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTmaterias);

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

        JLfiltrarMateria.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JLfiltrarMateria.setText("Filtrar:");

        JLbuscarNombre.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLbuscarNombre.setText("NOMBRE");

        JTFbuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFbuscarNombreKeyReleased(evt);
            }
        });

        JRBnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBnombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPbuscar_idLayout = new javax.swing.GroupLayout(JPbuscar_id);
        JPbuscar_id.setLayout(JPbuscar_idLayout);
        JPbuscar_idLayout.setHorizontalGroup(
            JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbuscar_idLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JLfiltrarMateria)
                .addGap(18, 18, 18)
                .addComponent(JLid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRBid)
                .addGap(41, 41, 41)
                .addComponent(JLbuscarNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFbuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRBnombre)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        JPbuscar_idLayout.setVerticalGroup(
            JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbuscar_idLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBnombre)
                    .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLbuscarNombre)
                        .addComponent(JTFbuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLid)
                        .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLfiltrarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLactivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JBbaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JBalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JCestado)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(JLinscripciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(JLbuscarMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JLinscripciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLbuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLactivo)
                    .addComponent(JCestado))
                .addGap(27, 27, 27)
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
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Limpia todo.
    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_JBlimpiarActionPerformed

    //Eliminar elementos de la tabla mientras se busca (por id).
    private void JTFidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFidKeyReleased
        borrarFilas();
        for (Materia m : allMaterias) {
            String id = String.valueOf(m.getIdMateria());
            if (id.startsWith(JTFid.getText())) {
                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getEstado()});
            }
        }
    }//GEN-LAST:event_JTFidKeyReleased

    //Eliminar elementos de la tabla mientras se busca (por nombre).
    private void JTFbuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFbuscarNombreKeyReleased
        borrarFilas();
        for (Materia m : allMaterias) {
            String dni = String.valueOf(m.getNombre().toLowerCase());
            if (dni.startsWith(JTFbuscarNombre.getText().toLowerCase())) {
                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getEstado()});
            }
        }
    }//GEN-LAST:event_JTFbuscarNombreKeyReleased

    //Limpieza al intentar buscar por nombre, bloqueo campo id.
    private void JRBnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBnombreActionPerformed
        borrarFilas();
        JTFid.setEnabled(false);
        JTFbuscarNombre.setEnabled(true);
        cargarDatos();
        limpiar();
    }//GEN-LAST:event_JRBnombreActionPerformed

    //Limpieza al intentar buscar por id, bloqueo campo nombre.
    private void JRBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBidActionPerformed
        borrarFilas();
        JTFid.setEnabled(true);
        JTFbuscarNombre.setEnabled(false);
        cargarDatos();
        limpiar();
    }//GEN-LAST:event_JRBidActionPerformed

    //Rellenar los campos al hacer click en la tabla.
    private void JTmateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTmateriasMouseClicked
        int filaS = JTmaterias.getSelectedRow();
        if (filaS != -1) {
            String nombre = (String) JTmaterias.getValueAt(filaS, 1);
            boolean estado = (boolean) JTmaterias.getValueAt(filaS, 2);

            JTFnombre.setText(nombre);
            JCestado.setSelected(estado);
        }

        JBborrar.setEnabled(true);
        JBactualizar.setEnabled(true);
        JCestado.setEnabled(false);
    }//GEN-LAST:event_JTmateriasMouseClicked
    
    //Dar de alta una materia.
    private void JBaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaltaActionPerformed
        int filaS = JTmaterias.getSelectedRow(); //Trae la fila que estoy seleccionando.
        if (filaS != -1) {
            int id = (int) JTmaterias.getValueAt(filaS, 0);
            boolean estado = (boolean) JTmaterias.getValueAt(filaS, 2);
            if (estado) {
                JOptionPane.showMessageDialog(this, "No puede dar de alta a una materia que ya lo esta! :b", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                md.altaBajaLogica(id, true);
                for (Materia m : allMaterias) { //Recorre el ArrayList para verificar si la materia esta dada de baja o alta.
                    if (m.getIdMateria() == id) {
                        m.setEstado(true);
                        modelo.setValueAt(true, filaS, 2);
                        JCestado.setSelected(true);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(this, "La materia se ha dado de alta exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBaltaActionPerformed
    
    //Dar de baja una materia.
    private void JBbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbajaActionPerformed
        int filaS = JTmaterias.getSelectedRow();
        if (filaS != -1) { //Solo entra si hay una fila seleccionada.
            int id = (int) JTmaterias.getValueAt(filaS, 0);
            boolean estado = (boolean) JTmaterias.getValueAt(filaS, 2);
            String nombreMateria = (String) JTmaterias.getValueAt(filaS, 1);
            if (estado) {
                md.altaBajaLogica(id, false);
                for (Materia m : allMaterias) { //Recorre el ArrayList para verificar si la materia esta dada de baja o alta.
                    if (m.getIdMateria() == id) {
                        m.setEstado(false);
                        modelo.setValueAt(false, filaS, 2);
                        JCestado.setSelected(false);
                        break;
                    }
                }
                try {
                    //Permite que si se da de baja una materia, se va a eliminar la cursada que contenga el nombre de la materia dada de baja.
                    Menu.cd.borrarInscripcion(nombreMateria);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(this, "La materia ha sido dada de baja con éxito!");
            } else {
                JOptionPane.showMessageDialog(this, "No puede dar de baja a una materia que ya lo esta! :b", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBbajaActionPerformed
    
    //Borrar una materia.
    private void JBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBborrarActionPerformed
        Iterator<Materia> it = allMaterias.iterator(); //Se crea para borrar la materia del ArrayList.
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la materia?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        int filaS = JTmaterias.getSelectedRow(); //Obtiene el indice de la fila que el usuario selecciona en la tabla.
        if (filaS != -1) {
            int id = (int) JTmaterias.getValueAt(filaS, 0); //Obtiene el valor que se encuentra en esa fila justo en esa columna.
            String nombreMateria = (String) JTmaterias.getValueAt(filaS, 1);
            if (respuesta == JOptionPane.YES_OPTION) { //Si la respuesta fue "Si".
                while (it.hasNext()) {
                    if (it.next().getIdMateria() == id) { //Se fija que el valor del idMateria coincide con el valor extraido de esa fila seleccionada en la columna idMateria.
                        it.remove(); //Si coincide la elimina.
                        break;
                    }
                }

                try {
                    //Permite que si se borra la materia, tambien se va a eliminar la cursada que contenga el nombre de la materia eliminada.
                    Menu.cd.borrarInscripcion(nombreMateria.toLowerCase()); 
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                md.borrarMateria(id); //Ejecuta el metodo de MateriaData para borrar la materia de la base de datos.
                modelo.removeRow(filaS); //Elimina la materia seleccionada de la tabla.
                limpiar(); //Limpia todo al terminar.
                mostrarMaterias(); //Muestra las materias para corroborar que se actualizo el ArrayList.
                JOptionPane.showMessageDialog(this, "Materia eliminada!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBborrarActionPerformed
    
    //Habilita el boton guardar cuando interactua con el campo de nombre.
    private void JTFnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFnombreKeyTyped
        habilitarGuardar();
    }//GEN-LAST:event_JTFnombreKeyTyped
    
    //Guarda una materia (realiza verificaciones).
    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        try {
            //Variables para almacenar los datos extraidos.
            String nombre = JTFnombre.getText().trim();
            boolean activo = JCestado.isSelected();
            Materia m;
            boolean disparador = true;

            //Verificacion de datos.
            for (Materia materia : allMaterias) {
                if (materia.getNombre().equalsIgnoreCase(nombre)) { //Recorre el Arraylist para verficacion de nombre repetido.
                    disparador = false;
                    JOptionPane.showMessageDialog(this, "El nombre ya está cargado en la base de datos. Ingrese otro.");
                    break;
                }
            }
            if (disparador) { //Verficacion de nombre repetido.
                if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) { //Verificacion de nombre. Funcion que fue investigada, permite que solo acepte letras de la a-z, "Ñ", tildes y espacios.
                    m = new Materia(nombre, activo);
                    md.guardarMateria(m);
                    allMaterias.add(m);
                    limpiar();
                    mostrarMaterias(); //Muestra las materias para corroborar que se actualizo el ArrayList.
                    JOptionPane.showMessageDialog(this, "Materia guardada con éxito!");
                } else {
                    JOptionPane.showMessageDialog(this, "Nombre invalido", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Datos incompletos/incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBguardarActionPerformed

    //Permite actualizar los datos de una materia.
    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        try {
            //Variables para almacenar los datos extraidos.
            String nombre = JTFnombre.getText().trim();
            boolean activo = JCestado.isSelected();
            Materia m;

            //Varibales para la verificacion de datos.
            int filaS = JTmaterias.getSelectedRow();
            boolean disparador = true;

            //Verificacion de datos.    
            if (filaS != -1) { //Todo funcionara si hay una fila seleccionada.
                int id = (int) JTmaterias.getValueAt(filaS, 0);
                for (Materia materia : allMaterias) {
                    if (materia.getNombre().equalsIgnoreCase(nombre)) { //Recorre el Arraylist para verficacion de nombre repetido.
                        disparador = false;
                        JOptionPane.showMessageDialog(this, "El nombre ya está cargado en la base de datos");
                        break;
                    }

                }
                if (disparador) { //Verficacion de nombre repetido.
                    if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) { //Verificacion de nombre. Funcion que fue investigada, permite que solo acepte letras de la a-z, "Ñ", tildes y espacios.
                        m = new Materia(nombre, activo);
                        m.setIdMateria(id);
                        for (Materia act : allMaterias) { //Actualizacion de la materia en el ArrayList para actualizar la tabla.
                            if (act.getIdMateria() == id) {
                                if (!act.getNombre().equals(nombre)) {
                                    act.setNombre(nombre);
                                    modelo.setValueAt(nombre, filaS, 1);
                                } else {
                                    JOptionPane.showMessageDialog(this, "Nombre en uso");
                                }
                                break;
                            }
                        }
                        md.actualizarMateria(m);
                        limpiar();
                        mostrarMaterias(); //Muestra las materias para corroborar que se actualizo el ArrayList.
                        JOptionPane.showMessageDialog(this, "Materia actualizada!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Nombre inválido", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para actualizar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Datos incompletos/incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGfiltrar;
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBalta;
    private javax.swing.JButton JBbaja;
    private javax.swing.JButton JBborrar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JCheckBox JCestado;
    private javax.swing.JLabel JLactivo;
    private javax.swing.JLabel JLbuscarMateria;
    private javax.swing.JLabel JLbuscarNombre;
    private javax.swing.JLabel JLfiltrarMateria;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLinscripciones;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JPanel JPbuscar_id;
    private javax.swing.JRadioButton JRBid;
    private javax.swing.JRadioButton JRBnombre;
    private javax.swing.JTextField JTFbuscarNombre;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JTable JTmaterias;
    private javax.swing.JScrollPane jScrollPane1;
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
        JTFnombre.setText("");
        JTFbuscarNombre.setText("");
        JCestado.setSelected(false);
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
        modelo.addColumn("idMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");

        JTmaterias.setModel(modelo);
    }

    /**
     * Permite borrar las filas mientras se encribe en los campos de filtrar.
     */
    private void borrarFilas() {
        int filas = JTmaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    /**
     * Carga los alumnos a la tabla.
     */
    private void cargarDatos() {
        for (Materia m : allMaterias) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getEstado()});
        }
    }
    
    /**
     * Muestra todas las materias del ArrayList.
     */
    private void mostrarMaterias() {
        System.out.println("------------------------");
        for (Materia m : allMaterias) {
            System.out.println(m);
            System.out.println("------------------------");
        }
        System.out.println("");
        System.out.println("");
    }
    
    /**
     * Si el campo de nombre esta lleno, se activa el boton guardar.
     */
    private void habilitarGuardar() {
        if (!JTFnombre.getText().trim().isEmpty()) {
            JBguardar.setEnabled(true);
        } else {
            JBguardar.setEnabled(false);
        }
    }
}

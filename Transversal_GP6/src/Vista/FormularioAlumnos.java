package Vista;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class FormularioAlumnos extends javax.swing.JInternalFrame {
    
    // Crea el modelo por default y sobrescribe el metodo de la clase para hacer que las celdas no sean editabes
    private DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };

    public FormularioAlumnos() {
        initComponents();
        ocultarMenu();
        //Evita que se pueda seleccionar mas de una opcion
        BGsexos.add(JRBmasculino);
        BGsexos.add(JRBfemenino);
        BGsexos.add(JRBotro);
        
        cargarCabecera();
        //Redimensionar iconos con el metodo
        JBborrar.setIcon(redimensionIcon("/Imagen/eliminar.png", 25, 25));
        JBactualizar.setIcon(redimensionIcon("/Imagen/actualizar.png", 25, 25));
        JBlimpiar.setIcon(redimensionIcon("/Imagen/escoba.png", 25, 25));
        JBbuscar.setIcon(redimensionIcon("/Imagen/buscar.png", 25, 25));
        JBalta.setIcon(redimensionIcon("/Imagen/check.png", 25, 25));
        JBbaja.setIcon(redimensionIcon("/Imagen/cruz.png", 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGsexos = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JLalumnos = new javax.swing.JLabel();
        JPbuscar_id = new javax.swing.JPanel();
        JLid = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        JBbuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JRBmasculino = new javax.swing.JRadioButton();
        JRBfemenino = new javax.swing.JRadioButton();
        JRBotro = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulario de Alumnos");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        JLalumnos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        JLalumnos.setText("Alumnos");

        JPbuscar_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLid.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLid.setText("ID");

        JTFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidActionPerformed(evt);
            }
        });

        JBbuscar.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        JBbuscar.setText("Buscar");

        javax.swing.GroupLayout JPbuscar_idLayout = new javax.swing.GroupLayout(JPbuscar_id);
        JPbuscar_id.setLayout(JPbuscar_idLayout);
        JPbuscar_idLayout.setHorizontalGroup(
            JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbuscar_idLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JLid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFid, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        JPbuscar_idLayout.setVerticalGroup(
            JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbuscar_idLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLid)
                    .addComponent(JTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JRBmasculino.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JRBmasculino.setText("Masculino");

        JRBfemenino.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JRBfemenino.setText("Femenino");

        JRBotro.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JRBotro.setText("Helicoptero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBotro)
                    .addComponent(JRBfemenino)
                    .addComponent(JRBmasculino))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JRBmasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRBfemenino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRBotro)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel1.setText("Sexo");

        JLnombre.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLnombre.setText("NOMBRE:");

        JLfechaNac.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLfechaNac.setText("Fecha de nacimiento :");

        JLactivo.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLactivo.setText("Activo");

        JCactivo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JCactivo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        JCactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCactivoActionPerformed(evt);
            }
        });

        JBguardar.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/guardar.png"))); // NOI18N
        JBguardar.setText("Guardar");

        JBborrar.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBborrar.setText("Borrar");
        JBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBborrarActionPerformed(evt);
            }
        });

        JBactualizar.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBactualizar.setText("Actualizar");

        JBlimpiar.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBlimpiar.setText("Limpiar");
        JBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimpiarActionPerformed(evt);
            }
        });

        JBalta.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBalta.setText("Dar de Alta");

        JBbaja.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        JBbaja.setText("Dar de Baja");

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
        jScrollPane2.setViewportView(JTalumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(JLalumnos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JPbuscar_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLfechaNac)
                                        .addGap(6, 6, 6)
                                        .addComponent(JDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLactivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCactivo)))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBbaja, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(JBalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JLalumnos)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(JLfechaNac))
                            .addComponent(JDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLactivo)
                            .addComponent(JCactivo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBalta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void JCactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCactivoActionPerformed

    private void JBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBborrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBborrarActionPerformed

    private void JBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_JBlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGsexos;
    private javax.swing.JButton JBactualizar;
    private javax.swing.JButton JBalta;
    private javax.swing.JButton JBbaja;
    private javax.swing.JButton JBborrar;
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBlimpiar;
    private javax.swing.JCheckBox JCactivo;
    private com.toedter.calendar.JDateChooser JDCfechaNac;
    private javax.swing.JLabel JLactivo;
    private javax.swing.JLabel JLalumnos;
    private javax.swing.JLabel JLfechaNac;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JPanel JPbuscar_id;
    private javax.swing.JRadioButton JRBfemenino;
    private javax.swing.JRadioButton JRBmasculino;
    private javax.swing.JRadioButton JRBotro;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JTable JTalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
    //Permiten ocultar la felchita que se encuentra cuando se abre el Internal Frame
    private void ocultarFlechita(Container contenedor) {
        for (Component componente : contenedor.getComponents()) {
            if (componente instanceof JButton) {
                componente.setVisible(false);
                return;
            }

            if (componente instanceof Container) {
                ocultarFlechita((Container) componente);
            }
        }
    }
    private void ocultarMenu() {
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        JComponent barra = ui.getNorthPane();
        ocultarFlechita(barra);
    }
    
    //Permite redimensionar a gusto las imagenes
    private ImageIcon redimensionIcon(String ruta, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);

    return new ImageIcon(imagenRedimensionada);
    }
    
    //Vacia todos los campos
    private void limpiar() {
        JTFid.setText("");
        JTFnombre.setText("");
        JDCfechaNac.setDate(null);
        JCactivo.setSelected(false);
        BGsexos.clearSelection();
        modelo.setRowCount(0);
    }
    
    //Agrega las cabeceras a la tabla
    private void cargarCabecera() {
        modelo.addColumn("idAlumno");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha_Nacimiento");
        modelo.addColumn("Activo");

        JTalumnos.setModel(modelo);
    }
}

package Vista;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;

public class FormularioAlumnos extends javax.swing.JInternalFrame {

    public FormularioAlumnos() {
        initComponents();
        ocultarMenu();
        BGsexos.add(JRBmasculino);
        BGsexos.add(JRBfemenino);
        BGsexos.add(JRBotro);
        //Redimensionar iconos con el metodo
        JBborrar.setIcon(redimensionIcon("/Imagen/eliminar.png", 25, 25));
        JBactualizar.setIcon(redimensionIcon("/Imagen/actualizar.png", 25, 25));
        JBlimpiar.setIcon(redimensionIcon("/Imagen/escoba.png", 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGsexos = new javax.swing.ButtonGroup();
        JLalumnos = new javax.swing.JLabel();
        JPbuscar_id = new javax.swing.JPanel();
        JLid = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
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

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
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

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        JPbuscar_idLayout.setVerticalGroup(
            JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbuscar_idLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPbuscar_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLid)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(55, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLalumnos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLfechaNac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLactivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCactivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLfechaNac)
                            .addComponent(JDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCactivo)
                            .addComponent(JLactivo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void JCactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCactivoActionPerformed

    private void JBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBborrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBborrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGsexos;
    private javax.swing.JButton JBactualizar;
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
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
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
}

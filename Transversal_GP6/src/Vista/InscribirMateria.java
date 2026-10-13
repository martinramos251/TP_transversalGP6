package Vista;

import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class InscribirMateria extends javax.swing.JInternalFrame {

    public InscribirMateria() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);
        
        //Redimensionar iconos con el metodo.
        JBbuscar.setIcon(redimensionIcon("/Imagen/buscar.png", 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        JLinscripciones = new javax.swing.JLabel();
        JPbuscar_id = new javax.swing.JPanel();
        JLid = new javax.swing.JLabel();
        JTFid = new javax.swing.JTextField();
        JBbuscar = new javax.swing.JButton();
        JLbuscarAlumnos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTalumnos = new javax.swing.JTable();
        JPbuscar_id1 = new javax.swing.JPanel();
        JLdni = new javax.swing.JLabel();
        JTFid1 = new javax.swing.JTextField();
        JBbuscar1 = new javax.swing.JButton();
        JLselect = new javax.swing.JLabel();
        JCBmateria = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        setTitle("Inscribir a Materia");

        JLinscripciones.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        JLinscripciones.setText("Inscripciones");

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

        JLbuscarAlumnos.setFont(new java.awt.Font("Dubai Medium", 1, 20)); // NOI18N
        JLbuscarAlumnos.setText("Buscar Alumno");

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

        JPbuscar_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLdni.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        JLdni.setText("DNI");

        JTFid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFid1ActionPerformed(evt);
            }
        });

        JBbuscar1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        JBbuscar1.setText("Buscar");

        javax.swing.GroupLayout JPbuscar_id1Layout = new javax.swing.GroupLayout(JPbuscar_id1);
        JPbuscar_id1.setLayout(JPbuscar_id1Layout);
        JPbuscar_id1Layout.setHorizontalGroup(
            JPbuscar_id1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbuscar_id1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(JLdni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFid1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(JBbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        JPbuscar_id1Layout.setVerticalGroup(
            JPbuscar_id1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbuscar_id1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPbuscar_id1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdni)
                    .addComponent(JTFid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        JLselect.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        JLselect.setText("Seleccione la Materia");

        JCBmateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(JLbuscarAlumnos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(JLinscripciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLselect)
                                .addGap(27, 27, 27)
                                .addComponent(JCBmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JPbuscar_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(JPbuscar_id1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JLinscripciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(JLbuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPbuscar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPbuscar_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLselect)
                    .addComponent(JCBmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(273, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidActionPerformed

    private void JTFid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFid1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBbuscar1;
    private javax.swing.JComboBox<String> JCBmateria;
    private javax.swing.JLabel JLbuscarAlumnos;
    private javax.swing.JLabel JLdni;
    private javax.swing.JLabel JLid;
    private javax.swing.JLabel JLinscripciones;
    private javax.swing.JLabel JLselect;
    private javax.swing.JPanel JPbuscar_id;
    private javax.swing.JPanel JPbuscar_id1;
    private javax.swing.JTextField JTFid;
    private javax.swing.JTextField JTFid1;
    private javax.swing.JTable JTalumnos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    //Permiten ocultar la felchita que se encuentra cuando se abre el Internal Frame.
//    private void ocultarFlechita(Container contenedor) {
//        for (Component componente : contenedor.getComponents()) {
//            if (componente instanceof JButton) {
//                componente.setVisible(false);
//                return;
//            }
//
//            if (componente instanceof Container) {
//                ocultarFlechita((Container) componente);
//            }
//        }
//    }
//    private void ocultarMenu() {
//        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
//        JComponent barra = ui.getNorthPane();
//        ocultarFlechita(barra);
//    }
    
    //Permite redimensionar a gusto las imagenes.
    private ImageIcon redimensionIcon(String ruta, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);

        return new ImageIcon(imagenRedimensionada);
    }
}

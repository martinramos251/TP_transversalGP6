package Vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class MateriasAlumnos extends javax.swing.JInternalFrame {
    //Crea el modelo por default y sobrescribe el metodo de la clase para hacer que las celdas no sean editabes.
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public MateriasAlumnos() {
        initComponents();
        UtilidadesGenerales.ocultarMenu(this);
        cargarCabeceras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCBmaterias = new javax.swing.JComboBox<>();
        JLfiltrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTalumnos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ver Materias de Alumno");

        JCBmaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(JCBmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(JLfiltrar)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JLfiltrar)
                .addGap(18, 18, 18)
                .addComponent(JCBmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBmaterias;
    private javax.swing.JLabel JLfiltrar;
    private javax.swing.JTable JTalumnos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Permite redimensionar a gusto las imagenes.
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
     * Agrega las cabeceras a la tabla.
     */
    private void cargarCabeceras() {
        modelo.addColumn("idAlumno");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("FechaNacimiento");
        modelo.addColumn("Activo");

        JTalumnos.setModel(modelo);
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
    
    
    
}

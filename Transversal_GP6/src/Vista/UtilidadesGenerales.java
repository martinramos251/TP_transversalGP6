package Vista;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class UtilidadesGenerales {

    static void ocultarMenu(JInternalFrame frame) {
        BasicInternalFrameUI ui = (BasicInternalFrameUI) frame.getUI();
        JComponent barra = ui.getNorthPane();
        ocultarFlechita(barra);
    }

    static void ocultarFlechita(Container contenedor) {
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
}

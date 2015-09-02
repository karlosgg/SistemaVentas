/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaventas_1.pkg0;
import UpperEssential.UpperEssentialLookAndFeel;
import Ventanas.Inicio;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author karlos
 */
public class SistemaVentas_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Inicio ventana=new Inicio();
        //UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
        ventana.setTitle("Sistema de Ventas - Versión 1.0");
        ventana.setVisible(true);
    }
    
}

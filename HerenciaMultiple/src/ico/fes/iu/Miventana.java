/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author ibiet
 */
public class Miventana extends JFrame implements WindowListener{

    public Miventana() throws HeadlessException {
    super("Mi ventana ");
        setSize(600, 400);
        setVisible(true);
        addWindowListener(this);
      
        
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
       
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana...");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }
   
    
}

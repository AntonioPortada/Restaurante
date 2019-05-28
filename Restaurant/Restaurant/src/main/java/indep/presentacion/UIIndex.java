/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indep.presentacion;

import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Administrador
 */
public class UIIndex extends JFrame {
    
    public UIIndex(){
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        bar.add(menu);
        setJMenuBar(bar);
    }
}

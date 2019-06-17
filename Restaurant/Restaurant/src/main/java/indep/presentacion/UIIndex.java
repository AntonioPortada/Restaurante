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
    
    private final JMenu menuOptions;
    private final JMenuItem itemReport, itemLogout, itemExit;
    
    private static int level = 0;
    
    public void setLevel(int l){ level = l; }
    public int getLevel(){ return level; }
    
    public UIIndex(){
        JMenuBar bar = new JMenuBar();
        menuOptions = new JMenu("Opciones");
        itemReport = new JMenuItem("Reportes");
        itemLogout = new JMenuItem("Logout");
        itemExit = new JMenuItem("Salir");
        
        if(getLevel() == 1)
            menuOptions.add(itemReport);      
        
        menuOptions.add(itemLogout);
        menuOptions.add(itemExit);
        
        bar.add(menuOptions);
        
        setJMenuBar(bar);
        
        //Eventos del menu
        itemReport.addActionListener(event -> {
            dispose();
            new UIReport().setVisible(true);
        });
        itemLogout.addActionListener(event -> {
            dispose();
            new UILogin().setVisible(true);
        });
        itemExit.addActionListener(event -> {
            System.exit(0);
        });
        
        //validarNivel(level);
        setExtendedState(MAXIMIZED_BOTH);
    }
}

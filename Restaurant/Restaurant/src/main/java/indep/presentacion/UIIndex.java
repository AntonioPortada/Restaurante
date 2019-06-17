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
    private final JMenuItem itemReport, itemExit;
    
    int level = 1;
    
    public UIIndex(){
        JMenuBar bar = new JMenuBar();
        menuOptions = new JMenu("Opciones");
        itemReport = new JMenuItem("Reportes");
        itemExit = new JMenuItem("Salir");
        menuOptions.add(itemReport);
        menuOptions.add(itemExit);
        
        bar.add(menuOptions);
        
        setJMenuBar(bar);
        
        //Eventos del menu
        itemReport.addActionListener(event -> {
            new UIReport().setVisible(true);
        });
        itemExit.addActionListener(event -> {
            System.exit(0);
        });
        
        //validarNivel(level);
    }
    
    /**
     * metodo para habilitar las opciones de la aplicación dependiendo
     * el nivel del usuario
     * @param level 
     */
    public void validarNivel(int level){
            
    }
}

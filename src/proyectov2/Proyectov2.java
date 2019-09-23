/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov2;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;






/**
 *
 * @author Ifyum
 */
public class Proyectov2 extends javax.swing.JFrame{

    /**

     */
    
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
 String ax = System.getProperty("os.name"); 
        // TODO code application logic here
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        interfaz ventana = new interfaz();  
       
        // para linux
       
      
        
    }       
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;
import static proyecto.ayuda.instru;
import static proyecto.ejecucion.suma;

/**
 *
 * @author Ifyum
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
           //Bug  String texto2=JOptionPane.showInputDialog("Escribe el operador 1");
          //Bug   //String texto3=JOptionPane.showInputDialog("Escribe el operador 2"); 
        JOptionPane.showMessageDialog(null, "Este programa es para ayudar a los niños aprender a sumar\n FASE BETA \n========\n", "    v0.2            ADTERTENCIA\n", JOptionPane.ERROR_MESSAGE);
           int op;
        do{
        op=JOptionPane.showOptionDialog( null,"Menu",
  "Created By Rubén Barrera v0.2",JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
  new Object[] { "Instrucciones","Iniciar","salir" },"hola"); 
//fin        
        switch (op){
            case 0:String ints=null;
            System.out.println(instru(ints));
            break;
        case 1:String li=null;
            System.out.println(suma(li));
            break;
            
        }
        }while(op!=2);
    }
    
}

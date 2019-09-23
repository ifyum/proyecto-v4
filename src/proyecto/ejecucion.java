/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ifyum
 */
public class ejecucion {
     static int a,b,n,cont=5;
       static int resp;
    static String suma(String li){
        String lin=null;
   System.out.println(menu(lin));
        
return(li);}
    
    
       public static int resultado( int c) {
   Scanner leer = new Scanner(System.in); 
       c=a+b;
       
            if (n==c || cont==1){
                           JOptionPane.showMessageDialog(null," tu respuesta: "+n+"\n"+"Resultado: "+a+"+"+b+"="+c+"\n", "v0.2     ATENCION\n", JOptionPane.ERROR_MESSAGE);

                    
                 System.out.println("Resultado: "+a+"+"+b+"="+c);
                     
                     
                     }else{ 
                cont=cont-1;
     
         n=Integer.parseInt(JOptionPane.showInputDialog(" incorrecto te quedan "+cont+" intentos \n vuelva a intentarlo \n cuanto es "+a+"+"+b+"= ¿?"));
             		resultado(n);
                }
            
       return (c);
    }
    public static String menu(String lin ) {
 cont=5;
             lin="==ADIOS==";
             
            String tex=JOptionPane.showInputDialog("ingrese primer numero entero: ");
  a=Integer.parseInt(tex);
  String tet=JOptionPane.showInputDialog("su segundo numero entero: ");
  b=Integer.parseInt(tet);
      
          JOptionPane.showMessageDialog(null, " Ahora es el turno del niño de resolver el problema \n haga Click en aceptar y deje al niño resolver la suma\n", "v0.2     ATENCION\n", JOptionPane.ERROR_MESSAGE);
         n=Integer.parseInt(JOptionPane.showInputDialog("cuanto es "+a+"+"+b+"= ¿?"));
         
             		 resultado(n);
         return null;
}
}
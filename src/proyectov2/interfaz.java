/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov2;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



/**
 *
 * @author Ifyum
 */

public class interfaz extends JFrame implements ActionListener {
    
    JLabel texto,texto2,texto3,texto4,texto5,espacio,instru;
    JButton boton,boton2,boton3,salir;
    
    interfaz(){
        
        super("By Rubén Barrera v0.3");
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/Ifyum.jpg")).getImage());
    setBounds(290,270,800,120);  
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    /////
       
  
    ////

    
       texto=new JLabel("ADTERTENCIA\n ESTE PROGRAMA ES PARA AYUDAR A LOS NIÑOS APRENDER A SUMAR \n FASE BETA \n");
       texto2=new JLabel("");
       texto3=new JLabel("");
       texto4=new JLabel("");
        texto5=new JLabel("");
         espacio=new JLabel("");
       boton=new JButton(" Instrucciones ");
       boton2=new JButton(" Sumar ");
       boton3=new JButton(" ver ultimo resultado ");
       salir=new JButton(" Salir ");
       
       boton.addActionListener(this);
       boton2.addActionListener(this);
       boton3.addActionListener(this);
       salir.addActionListener(this);
       add(texto);
    
    add(texto2);
    add(texto3);
    add(texto4);
    add(texto5);
    add(espacio);
    
    add (boton);
    add(boton2);
    add(boton3);
    add(salir);
    }
 
       
   
    @Override
       public void actionPerformed(ActionEvent boto){
                     
          if (boto.getSource()==(boton)){
              espacio.setText("\n");
               texto2.setText("\n primero le das a iniciar \n");
                espacio.setText("\n");
              texto3.setText("\n luego debes ingresar 2 numeros\n");
               espacio.setText("\n");
              texto4.setText(" \n luego se lo pasas al niño para que lo resuelva\n");
               espacio.setText("\n");
              texto5.setText(" \n tendra 5 oportunidades\n ");
              espacio.setText("\n");
          }            
          if (boto.getSource()==(boton2)){
               texto2.setText("\n \n");
              texto3.setText("\n \n");
              texto4.setText(" \n \n");
              texto5.setText(" \n \n ");
              espacio.setText("\n");
           String li = null;
              suma(li);
          }
          if (boto.getSource()==(boton3)){
               texto2.setText("\n \n");
              texto3.setText("\nResultado: "+a+"+"+b+"="+r+"\n");
              texto4.setText("\nTu  ultima respuesta fue "+n+" \n");
              cont=cont-1;
              texto5.setText(" \n intentos que te quedaron \n "+cont+"\n");
              espacio.setText("\n");
       }
   if (boto.getSource()==(salir)){
            
             System.exit(0);
       }


       }

 static int a,b,n,cont=5,r;
       static int resp;
    static String suma(String li){
        String lin=null;
   menu(lin);
        
return(li);}
    
    
       public static int resultado( int c) {
  r=a+b;
       c=a+b;
       
            if (n==c || cont==1){
                           JOptionPane.showMessageDialog(null," tu respuesta: "+n+"\n"+"Resultado: "+a+"+"+b+"="+c+"\n", "v0.2     ATENCION\n", JOptionPane.ERROR_MESSAGE);

                    
                 
                     
                     
                     }else{ 
                cont=cont-1;
     
         n=Integer.parseInt(JOptionPane.showInputDialog(" incorrecto te quedan "+cont+" intentos \n vuelva a intentarlo \n cuanto es "+a+"+"+b+"= ¿?"));
             		resultado(n);
                }
            
       return (c);
    }
       
    public static String menu(String lin ) {
 cont=5;
             
             
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ifyum
 */
public class sumaentxt {
    int a,b,c=0;
    public void archivotxt(){
          Scanner archivo=null;
          try{
              archivo = new Scanner(new File("C:\\Users\\Ifyum\\Dropbox\\doc\\computer classroom\\cc teacher\\matematicas.txt"));
          }catch(Exception e){
              System.out.println("archivo no encontrado");
          }
          int num=0,count=0;
          while(archivo.hasNext()){
             num = archivo.nextInt();
             count = count+num;
             System.out.print(" "+num);
             c=c+1;
             if(c==1){
                 a=num;
             }else{
                 b=num;
             }
          }
    System.out.println(" ");
    System.out.println(a+"+"+b+"="+count);
    }
}

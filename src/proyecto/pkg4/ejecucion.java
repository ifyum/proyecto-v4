/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg4;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Ifyum
 */
public class ejecucion extends javax.swing.JFrame {
  static int a,b,n,cont=5,c;
    /**
     * Creates new form ejecucion
     */
    public ejecucion() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagepacktages/logo CC.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resul = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Resultado = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("V0.5");
        setBackground(new java.awt.Color(255, 153, 51));

        num1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        num1.setText("           0");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel2.setText("+");

        num2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        num2.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setText("=");

        resul.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        resul.setText("0");

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepacktages/Notepad Bloc notes 2-32.png"))); // NOI18N
        jToggleButton1.setText("Ingrese Numeros");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Resultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepacktages/Calculator-32.png"))); // NOI18N
        Resultado.setText("Mostrar Resultado");
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepacktages/Brain-Games-32.png"))); // NOI18N
        jToggleButton2.setText("ingrese respuesta");
        jToggleButton2.setToolTipText("");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Atras");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Resultado)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("V0.5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
  resul.setText("");
        String tex=JOptionPane.showInputDialog("ingrese primer numero entero: ");
            a=Integer.parseInt(tex);
         String tet=JOptionPane.showInputDialog("su segundo numero entero: ");
  b=Integer.parseInt(tet);
     JOptionPane.showMessageDialog(null, " Ahora es el turno del niño de resolver el problema \n haga Click en aceptar y deje al niño resolver la suma\n", "v0.2     ATENCION\n", JOptionPane.ERROR_MESSAGE);
                // TODO add your handling code here:
          
        num1.setText(""+a);
                  num2.setText(""+b );     		 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
        c=a+b;
                  num1.setText(""+a);
                  num2.setText(""+b );
                  resul.setText(""+c);
    }//GEN-LAST:event_ResultadoActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        c=a+b;
      cont=5;
      num1.setText(""+a);
      num2.setText(""+b );
      resul.setText("¿?");
            n=Integer.parseInt(JOptionPane.showInputDialog("cuanto es "+a+"+"+b+"= ¿?"));
        
       do{
            if (n==c || cont==1){
                
                           JOptionPane.showMessageDialog(null," Correcto :) \n"+"Resultado: "+a+"+"+b+"="+c+
                                   "\n", "v0.4     ATENCION\n", JOptionPane.INFORMATION_MESSAGE);
resul.setText(""+c);
                     cont=cont-4;
                     
                     }else{ 
                cont=cont-1;
     
         n=Integer.parseInt(JOptionPane.showInputDialog(" incorrecto :( \n te quedan "+cont+" intentos \n vuelva a intentarlo \n cuanto es "+a+"+"+b+"= ¿?"));
             	 resul.setText("animo");
                
                }
            
     } while (cont!=1);
       
   
 
             	
  


        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed

        ventana v3 =new  ventana();
        v3.setVisible(true);
        v3.setLocationRelativeTo(null);
          dispose();  
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejecucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejecucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Resultado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel resul;
    // End of variables declaration//GEN-END:variables
}

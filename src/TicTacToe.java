
import java.awt.Color;
import static java.awt.PageAttributes.MediaType.B;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marko
 */
public class TicTacToe extends javax.swing.JFrame {
    private String StarGame ="X";
    private int xCount = 0;
    private int oCount =0;
    

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }
private void gameScore(){

playerx.setText(String.valueOf(xCount));
playero.setText(String.valueOf(oCount));

}
private void choose_player(){

if(StarGame.equalsIgnoreCase("X")){
StarGame ="O";

}else{

StarGame ="X";
}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt7 = new javax.swing.JButton();
        txt4 = new javax.swing.JButton();
        txt5 = new javax.swing.JButton();
        txt9 = new javax.swing.JButton();
        txt6 = new javax.swing.JButton();
        txt3 = new javax.swing.JButton();
        txt1 = new javax.swing.JButton();
        txt2 = new javax.swing.JButton();
        txt8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JTextField();
        playero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setBackground(new java.awt.Color(255, 255, 102));
        setFocusable(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("TicTacToe ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        txt7.setBackground(new java.awt.Color(255, 255, 204));
        txt7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });

        txt4.setBackground(new java.awt.Color(255, 255, 204));
        txt4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        txt5.setBackground(new java.awt.Color(255, 255, 204));
        txt5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        txt9.setBackground(new java.awt.Color(255, 255, 204));
        txt9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });

        txt6.setBackground(new java.awt.Color(255, 255, 204));
        txt6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt3.setBackground(new java.awt.Color(255, 255, 204));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt1.setBackground(new java.awt.Color(255, 255, 204));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.setBackground(new java.awt.Color(255, 255, 204));
        txt2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt8.setBackground(new java.awt.Color(255, 255, 204));
        txt8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 51));
        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 51));
        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Player  X::");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Player  O::");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playero)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addComponent(playerx))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed


        JFrame frame =new JFrame("");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_CANCEL_OPTION){
             System.exit(B);
        
        }
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
  // TODO add your handling code here:
  txt1.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt1.setForeground(Color.RED);

  }else{

  txt1.setForeground(Color.BLACK);
  }
  choose_player();
  winningGame();
  
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
        
        txt2.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt2.setForeground(Color.RED);

  }else{

   txt2.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
         txt3.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt3.setForeground(Color.RED);

  }else{

  txt3.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
         txt4.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt4.setForeground(Color.RED);

  }else{

  txt4.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
         txt5.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt5.setForeground(Color.RED);

  }else{

  txt5.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
         txt6.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt6.setForeground(Color.RED);

  }else{

  txt6.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
         txt7.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt7.setForeground(Color.RED);

  }else{

  txt7.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
         txt8.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt8.setForeground(Color.RED);

  }else{

  txt8.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        // TODO add your handling code here:
         txt9.setText(StarGame);
  if(StarGame.equalsIgnoreCase("X")){
  txt9.setForeground(Color.RED);

  }else{

  txt9.setForeground(Color.BLACK);
  }
  choose_player();
   winningGame();
    }//GEN-LAST:event_txt9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
        
        txt4.setText(null);
        txt5.setText(null);
        txt6.setText(null);
        
        txt7.setText(null);
        txt8.setText(null);
        txt9.setText(null);
        
        
        txt1.setBackground(Color.LIGHT_GRAY);
        txt2.setBackground(Color.LIGHT_GRAY);
        txt3.setBackground(Color.LIGHT_GRAY);
        
        
        txt4.setBackground(Color.LIGHT_GRAY);
        txt5.setBackground(Color.LIGHT_GRAY);
        txt6.setBackground(Color.LIGHT_GRAY);
        
        
        txt7.setBackground(Color.LIGHT_GRAY);
        txt8.setBackground(Color.LIGHT_GRAY);
        txt9.setBackground(Color.LIGHT_GRAY);
        
        
        
        
    }//GEN-LAST:event_jButton11ActionPerformed
     
    private void winningGame(){
    
    String b1=txt1.getText();
    String b2=txt2.getText();
    String b3=txt3.getText();
      
     String b4=txt4.getText();
     String b5=txt5.getText();
     String b6=txt6.getText();
      
     String b7=txt7.getText();
     String b8=txt8.getText();
     String b9=txt9.getText();
      
      
     if(b1==("X")&& b2==("X")&& b3==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt1.setBackground(Color.ORANGE);
      txt2.setBackground(Color.ORANGE);
      txt3.setBackground(Color.ORANGE);
     }
     
       
     if(b4==("X")&& b5==("X")&& b6==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt4.setBackground(Color.ORANGE);
      txt5.setBackground(Color.ORANGE);
      txt6.setBackground(Color.ORANGE);
     }
       
     if(b7==("X")&& b8==("X")&& b9==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt7.setBackground(Color.ORANGE);
      txt8.setBackground(Color.ORANGE);
      txt9.setBackground(Color.ORANGE);
     }
     
     
       
     if(b1==("X")&& b4==("X")&& b7==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt1.setBackground(Color.ORANGE);
      txt4.setBackground(Color.ORANGE);
      txt7.setBackground(Color.ORANGE);
     }
      
     
       
     if(b2==("X")&& b5==("X")&& b8==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt2.setBackground(Color.ORANGE);
      txt5.setBackground(Color.ORANGE);
      txt8.setBackground(Color.ORANGE);
     }
     
     
       
     if(b3==("X")&& b6==("X")&& b9==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt3.setBackground(Color.ORANGE);
      txt6.setBackground(Color.ORANGE);
      txt9.setBackground(Color.ORANGE);
     }
     
     
      if(b1==("X")&& b5==("X")&& b9==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt1.setBackground(Color.ORANGE);
      txt5.setBackground(Color.ORANGE);
      txt9.setBackground(Color.ORANGE);
     }
       if(b3==("X")&& b5==("X")&& b7==("X")){
     JOptionPane.showMessageDialog(this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     xCount++;
      gameScore();
      
      txt3.setBackground(Color.ORANGE);
      txt5.setBackground(Color.ORANGE);
      txt7.setBackground(Color.ORANGE);
     }
    }
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField playero;
    private javax.swing.JTextField playerx;
    private javax.swing.JButton txt1;
    private javax.swing.JButton txt2;
    private javax.swing.JButton txt3;
    private javax.swing.JButton txt4;
    private javax.swing.JButton txt5;
    private javax.swing.JButton txt6;
    private javax.swing.JButton txt7;
    private javax.swing.JButton txt8;
    private javax.swing.JButton txt9;
    // End of variables declaration//GEN-END:variables
}

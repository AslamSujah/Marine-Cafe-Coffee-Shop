
package coffeeshop;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lee_Marine_CoffeeShop");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 400));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 20, 120, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 170, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("UserName");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 120, 90, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(240, 120, 190, 30);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(240, 170, 190, 30);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setText("login");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(120, 260, 140, 70);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton2.setText("Cancel");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(300, 260, 140, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Theme21.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        

        if (username.contains("asujah") && password.contains("199375s")) {
            jTextField1.setText("");
            jPasswordField1.setText("");
            close();
            Management ma = new Management();
            ma.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "wrong Username or Password","Wrong",JOptionPane.ERROR_MESSAGE);
            
            jTextField1.setText("");
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        close();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

private void close(){
    WindowEvent winclosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosing);

}

}

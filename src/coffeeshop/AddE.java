
package coffeeshop;

import java.sql.*;
import javax.swing.*;

public class AddE extends javax.swing.JFrame {

    public AddE() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lee_Marine_CoffeeShop");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 680));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" Adding Employees");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 20, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Employee Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 90, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Employee Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 150, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("NIC");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 210, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Salary");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 270, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mobile");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 330, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 390, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Work Hours");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 450, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sex");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 510, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Branch");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(110, 570, 130, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(310, 90, 310, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(310, 150, 310, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(310, 210, 310, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(310, 270, 310, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(310, 330, 310, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(310, 390, 530, 30);

        jButton1.setBackground(new java.awt.Color(255, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Add Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(760, 520, 170, 80);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 Hours", "7 Hours", "8 Hours", "10 Hours", "11 Hours", "12 Hours" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(310, 450, 120, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(310, 510, 120, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "Kandy", "Galle", "Ampara", "Badulla", "Arugambay", "Jaffna", " " }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(310, 570, 120, 30);

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(710, 70, 200, 220);

        jButton2.setBackground(new java.awt.Color(255, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(560, 520, 130, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Theme8.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 680);

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

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String url = "jdbc:derby://localhost:1527/CoffeeShop";
            String username = "EP1834";
            String password = "EP1834";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            
            String Query = "INSERT INTO EMPLOYEES (EMP_ID,EMP_NAME,NIC,MOBILE,ADDRESS,WORK_HOURS,SEX,BRANCH,SALARY) VALUES('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"','"+jComboBox1.getSelectedItem()+"','"+jComboBox2.getSelectedItem()+"','"+jComboBox3.getSelectedItem()+"','"+jTextField4.getText()+"')";
            
            stmt.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Employee added");
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);            
            jTextField5.setText(null);
            jTextField6.setText(null);
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);  
            jTextField4.setText(null);
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Employee em = new Employee();
        em.setVisible(true);
        AddE.this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

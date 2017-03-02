
package coffeeshop;

import java.sql.*;
import javax.swing.*;
import javax.swing.text.Position;

public class SearchE extends javax.swing.JFrame {
    
    final void FillList(){
        try {
            String url = "jdbc:derby://localhost:1527/CoffeeShop";
            String username = "EP1834";
            String password = "EP1834";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            
            String Query = "SELECT * FROM EMPLOYEES";
            ResultSet rs = stmt.executeQuery(Query);
            DefaultListModel DLM = new DefaultListModel();
            
            while(rs.next()){
            DLM.addElement(rs.getString(1));
            }
            
            jList1.setModel(DLM);
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }

    public SearchE() {
        initComponents();
        FillList();
        setLocationRelativeTo(null);
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lee_Marine_CoffeeShop");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 680));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Employee Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 100, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Employee Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 160, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("NIC");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 220, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Salary");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 280, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mobile");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 340, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 400, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Work Hours");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 460, 130, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 100, 310, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(250, 160, 310, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(250, 220, 310, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(250, 280, 310, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(250, 340, 310, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(250, 400, 460, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 Hours", "7 Hours", "8 Hours", "10 Hours", "11 Hours", "12 Hours" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(250, 460, 120, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(250, 520, 120, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "Kandy", "Galle", "Ampara", "Badulla", "Arugambay", "Jaffna", " " }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(250, 580, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Branch");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 580, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sex");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 520, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" Search Employees");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 20, 170, 30);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(780, 210, 190, 220);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(780, 110, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(830, 150, 90, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 480, 130, 80);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setPreferredSize(new java.awt.Dimension(77, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(820, 480, 130, 80);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(460, 480, 110, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Theme9.png"))); // NOI18N
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int result = jList1.getNextMatch(jTextField7.getText(), 0, Position.Bias.Forward);
        jList1.setSelectedIndex(result);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        try {
            String url = "jdbc:derby://localhost:1527/CoffeeShop";
            String username = "EP1834";
            String password = "EP1834";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            
            String Query = "SELECT * FROM EMPLOYEES WHERE EMP_ID = '"+jList1.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
            
            
            while(rs.next()){
           jTextField1.setText(rs.getString(1));
           jTextField2.setText(rs.getString(2));
           jTextField3.setText(rs.getString(3));
           jTextField4.setText(rs.getString(9));
           jTextField5.setText(rs.getString(4));
           jTextField6.setText(rs.getString(5));
           jComboBox1.setSelectedItem(rs.getString(6));
           jComboBox2.setSelectedItem(rs.getString(7));
           jComboBox3.setSelectedItem(rs.getString(8));

            }
         
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String url = "jdbc:derby://localhost:1527/CoffeeShop";
            String username = "EP1834";
            String password = "EP1834";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            
            String Query = "UPDATE EMPLOYEES SET EMP_ID = '"+jTextField1.getText()+"',EMP_NAME = '"+jTextField2.getText()+"',NIC = '"+jTextField3.getText()+"',MOBILE = '"+jTextField5.getText()+"',ADDRESS = '"+jTextField6.getText()+"',WORK_HOURS = '"+jComboBox1.getSelectedItem()+"',SEX = '"+jComboBox2.getSelectedItem()+"',BRANCH = '"+jComboBox3.getSelectedItem()+"',SALARY = '"+jTextField4.getText()+"'WHERE EMP_ID = '"+jList1.getSelectedValue()+"'";
            
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Details Updated");
            FillList();
          
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String url = "jdbc:derby://localhost:1527/CoffeeShop";
            String username = "EP1834";
            String password = "EP1834";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            
            String Query = "DELETE FROM EMPLOYEES WHERE EMP_ID = '"+jList1.getSelectedValue()+"'";
            
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Details Deleted");
            FillList();
          
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Employee em = new Employee();
        em.setVisible(true);
        SearchE.this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}

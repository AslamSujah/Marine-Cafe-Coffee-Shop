
package coffeeshop;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ItemMenu extends javax.swing.JFrame {

    public ItemMenu() {
        initComponents();
        currentDate();
        
        setLocationRelativeTo(null);
        
    }
    public void currentDate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        dateMenu.setText("Date  "+year+"/"+(month+1)+"/"+day);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        timeMenu.setText("Time  "+hour+":"+(minute)+":"+second);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        dateMenu = new javax.swing.JMenu();
        timeMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lee_Marine_CoffeeShop");
        setPreferredSize(new java.awt.Dimension(1000, 680));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 680));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(219, 156, 226));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Administration");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(800, 30, 140, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Items Menu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 0, 160, 60);

        jButton2.setBackground(new java.awt.Color(255, 153, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Cakes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 120, 180, 50);

        jButton3.setBackground(new java.awt.Color(255, 153, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("Juices");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(70, 320, 180, 50);

        jButton4.setBackground(new java.awt.Color(255, 153, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("Ice-Creams");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(70, 520, 180, 50);

        jButton5.setBackground(new java.awt.Color(255, 153, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setText("Coffee");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(740, 120, 180, 50);

        jButton6.setBackground(new java.awt.Color(255, 153, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setText("Sandwiches");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(740, 320, 180, 50);

        jButton7.setBackground(new java.awt.Color(255, 153, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton7.setText("Short Snacks");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(740, 520, 180, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/Cake.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 70, 154, 154);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/Juice.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 280, 154, 154);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/Ice Cream.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 470, 154, 154);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/coffee.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(590, 70, 154, 154);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/Sandwiches.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 270, 154, 154);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/Short Snacks.JPG"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(590, 470, 154, 154);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Theme1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 680);

        dateMenu.setForeground(new java.awt.Color(51, 51, 51));
        dateMenu.setText("Date");
        dateMenu.setPreferredSize(new java.awt.Dimension(100, 19));
        dateMenu.setRequestFocusEnabled(false);
        jMenuBar1.add(dateMenu);

        timeMenu.setText("Time");
        jMenuBar1.add(timeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cakes c = new Cakes();
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Coffees c = new Coffees();
        c.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Juices j = new Juices();
       j.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        IceCreams i = new IceCreams();
        i.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Sandwiches s = new Sandwiches();
        s.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ShortSnacks s = new ShortSnacks();
        s.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        ItemMenu.this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu dateMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu timeMenu;
    // End of variables declaration//GEN-END:variables
}

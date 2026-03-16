/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.activity1oop;


public class FirstFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FirstFrame.class.getName());

    /**
     * Creates new form FirstFrame
     */
    public FirstFrame() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LNField = new javax.swing.JTextField();
        UNField = new javax.swing.JTextField();
        FNField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        PWField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTER");
        jButton1.setActionCommand("REGISTER");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 240, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\RAMOS\\OOP_ACT1\\src\\main\\java\\com\\mycompany\\activity1oop\\banner.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 570, 550));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        LNField.setForeground(new java.awt.Color(153, 153, 153));
        LNField.setText("Enter Last Name");
        LNField.addActionListener(this::LNFieldActionPerformed);
        jPanel1.add(LNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 160, 30));

        UNField.setForeground(new java.awt.Color(153, 153, 153));
        UNField.setText("Enter Username");
        UNField.addActionListener(this::UNFieldActionPerformed);
        jPanel1.add(UNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 330, 30));

        FNField.setForeground(new java.awt.Color(153, 153, 153));
        FNField.setText("Enter First Name");
        FNField.addActionListener(this::FNFieldActionPerformed);
        jPanel1.add(FNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 160, 30));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(this::jPasswordField1ActionPerformed);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 160, 30));

        PWField.setText("ENTER PASSWORD");
        jPanel1.add(PWField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void LNFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void UNFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void FNFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FirstFrame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField FNField;
    private javax.swing.JTextField LNField;
    private javax.swing.JPasswordField PWField;
    private javax.swing.JTextField UNField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration                   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.activity1oop;

import javax.swing.JOptionPane;


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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LNField = new javax.swing.JTextField();
        UNField = new javax.swing.JTextField();
        FNField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        PWField = new javax.swing.JPasswordField();
        course = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
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

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\RAMOS\\OOP_ACT1\\src\\main\\java\\com\\mycompany\\activity1oop\\banner.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 570, 550));

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        LNField.setForeground(new java.awt.Color(153, 153, 153));
        LNField.addActionListener(this::LNFieldActionPerformed);
        jPanel1.add(LNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 160, 30));

        UNField.setForeground(new java.awt.Color(153, 153, 153));
        UNField.addActionListener(this::UNFieldActionPerformed);
        jPanel1.add(UNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 330, 30));

        FNField.setForeground(new java.awt.Color(153, 153, 153));
        FNField.addActionListener(this::FNFieldActionPerformed);
        FNField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FNFieldKeyReleased(evt);
            }
        });
        jPanel1.add(FNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 160, 30));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(this::jPasswordField1ActionPerformed);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 160, 30));

        PWField.setText("ENTER PASSWORD");
        PWField.addActionListener(this::PWFieldActionPerformed);
        jPanel1.add(PWField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 160, 30));

        course.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student", "Abi", "Jurie", "Steven", "Jianna" }));
        course.addActionListener(this::courseActionPerformed);
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 240, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SUBMIT");
        jButton2.setBorder(null);
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String firstName = FNField.getText().trim();
        String lastName = LNField.getText().trim();
        String username = UNField.getText().trim();
        String password = new String(PWField.getPassword());
        
        StudentsInfo_Model object = new StudentsInfo_Model(
            firstName,
            lastName,
            username,
            password
        );
      StudentStorage.students.add(object); // where array is save
        System.out.println(StudentStorage.students.size());
        System.out.println("SUCCCESSFULLY REGISTERED");
        JOptionPane.showMessageDialog(this,"SUCCESFULLY REGISTERED"); 
        
    }                                        

    private void LNFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void UNFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void FNFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
    }                                               

    private void PWFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void FNFieldKeyReleased(java.awt.event.KeyEvent evt) {                                    
        String text = FNField.getText();
        
        if(text.length() <2){
            JOptionPane.showMessageDialog(this,"Please Enter2 or more characters");
        }
    }                                   

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (course.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this,"Please Select a student");
            course.setSelectedIndex(0);
        }
    }                                      

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String selectedData = course.getSelectedItem().toString();
        if(selectedData.equals("Select Student")){ //conditions
            JOptionPane.showMessageDialog(this,"Please Select a student");
        }else{
            JOptionPane.showMessageDialog(this,"You selected" + selectedData);
        }
    }                                        


    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(() -> new FirstFrame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField FNField;
    private javax.swing.JTextField LNField;
    private javax.swing.JPasswordField PWField;
    private javax.swing.JTextField UNField;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}

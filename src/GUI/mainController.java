/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import javaInterfaces.controllerObserverInterface;

/**
 *
 * @author ranga
 */
public class mainController extends javax.swing.JFrame {

    private controllerObserverInterface observer;
    private String[][] msgar = new String[0][2];
    public static mainController mainGui = new mainController();

    private mainController() {

        setVisible(true);
        initComponents();
        setResizable(false);
        setLocation(0, 0);

    }

    public void setObservable(controllerObserverInterface observer) {
        this.observer = observer;
    }

    public static mainController getInstance() {
        return mainGui;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane3 = new javax.swing.JScrollPane();
        SendArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 380));
        getContentPane().setLayout(null);

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SelectDefence", "Tank", "Helicopter", "Submarine" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 70, 117, 26);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Collect Information");
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 70, 150, 26);

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setText("Area Clear");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(482, 25, 90, 20);

        jLabel1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Soldier Count");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(19, 101, 74, 21);

        jLabel2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fuel Amount");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 128, 80, 17);

        jLabel4.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Position");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 175, 60, 17);

        jLabel3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Amount");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 151, 90, 17);

        jSlider1.setBackground(new java.awt.Color(0, 0, 0));
        jSlider1.setForeground(new java.awt.Color(255, 255, 255));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1);
        jSlider1.setBounds(70, 175, 221, 46);

        SendArea.setBackground(new java.awt.Color(242, 242, 242));
        SendArea.setColumns(20);
        SendArea.setLineWrap(true);
        SendArea.setRows(5);
        SendArea.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(SendArea);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(350, 250, 238, 77);

        jTextArea4.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(30, 250, 238, 77);

        jCheckBox2.setBackground(new java.awt.Color(15, 15, 15));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox2.setText("Send Private");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(350, 210, 100, 20);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Main Controller >");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 20, 160, 21);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 210, 80, 26);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Main Controller");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(2, -4, 610, 340);

        pack();
    }// </editor-fold>                        

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

    }                                          

    public void sendMsgArea(String msg) {
        jTextArea4.setText(msg);
    }

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
       
        observer.setSliderLevel(jSlider1.getValue());
    }                                     

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

        boolean isSelected = jCheckBox1.isSelected();

        observer.setData(isSelected);

    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        observer.msgAdminToAll(SendArea.getText());
    }                                        

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea SendArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration                   
}

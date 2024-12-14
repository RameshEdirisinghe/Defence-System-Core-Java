/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javaInterfaces.controllerObserver;

/**
 *
 * @author ranga
 */
public class Tank extends javax.swing.JFrame implements controllerObserver {

    private Observerble ob;

    public Tank(Observerble ob) {
        this.ob = ob;

        setVisible(true);
        initComponents();
        
        int myage = 22;
        
        addsum(myage);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        System.out.println(screenWidth);
        int screenHeight = screenSize.height;

        int frameWidth = 602;
        int frameHeight = 381 + 30;
        setLocation(0, screenHeight - frameHeight);

        jButton1.setEnabled(false);
        jButton5.setEnabled(false);
        jButton3.setEnabled(false);
        jButton2.setEnabled(false);
    }

    public void update(int positionLevel) {

        if (jCheckBox1.isSelected()) {
            if (positionLevel > 20 && positionLevel < 50) {
                jButton1.setEnabled(true);
                jButton5.setEnabled(false);
                jButton3.setEnabled(false);
            } else if (positionLevel > 50 && positionLevel < 60) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(false);
                jButton5.setEnabled(false);
            } else if (positionLevel > 60 && positionLevel < 80) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton5.setEnabled(false);

            } else if (positionLevel > 80) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton5.setEnabled(true);
            } else {
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton5.setEnabled(false);
            }
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton5.setEnabled(false);
        }
    }
    public void addsum(int num){
        ///////
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tankArea = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 381));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Area not cleared");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 30, 92, 16);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Shoot");
        jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton1StateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 70, 145, 26);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Rotate Shooting");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(160, 100, 148, 26);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Radar Operation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 100, 145, 26);

        tankArea.setBackground(new java.awt.Color(242, 242, 242));
        tankArea.setColumns(20);
        tankArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tankArea.setForeground(new java.awt.Color(0, 0, 0));
        tankArea.setRows(5);
        jScrollPane1.setViewportView(tankArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(5, 144, 500, 140);

        jTextField1.setBackground(new java.awt.Color(242, 242, 242));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1, 301, 420, 26);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(430, 300, 70, 26);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 60, 72, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Soldier Count");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 20, 72, 20);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(450, 60, 50, 20);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(450, 20, 50, 20);

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(370, 100, 66, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tank");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(258, 0, 42, 25);

        jSlider2.setBackground(new java.awt.Color(0, 0, 0));
        jSlider2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jSlider2.setForeground(new java.awt.Color(255, 255, 255));
        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(5);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        getContentPane().add(jSlider2);
        jSlider2.setBounds(530, 20, 50, 290);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Missile Operation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 70, 148, 26);

       
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 610, 340);

        pack();
    }// </editor-fold>                        

    public void receivedMsg(String rMsg) {
        tankArea.setText(rMsg);
    }

    public void updateData(boolean data) {

        if (data == true) {
            jLabel2.setText("Area Cleared");
        } else if (data == false) {
            jLabel2.setText("Area Not Cleared");
        }
    }
    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:

    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ob.sendMsg(jTextField1.getText(), "Tank");
        jTextField1.setText("");
    }                                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea tankArea;
    // End of variables declaration                   
}

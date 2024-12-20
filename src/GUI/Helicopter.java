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
public class Helicopter extends javax.swing.JFrame implements controllerObserver {

    private mainController mainGui;
    private Observerble ob;

    /**
     * Creates new form Helicopter
     */
    public Helicopter(Observerble ob) {
        this.ob = ob;

        setVisible(true);
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int frameWidth = 602;
        int frameHeight = 381 + 30;

        setLocation(screenWidth - frameWidth, screenHeight - frameHeight);

        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }

    public void update(int positionLevel) {

        if (jCheckBox1.isSelected()) {
            if (positionLevel > 20 && positionLevel < 50) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
            } else if (positionLevel > 50 && positionLevel < 80) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(false);
            } else if (positionLevel > 80) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);

            } else {
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
            }
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        areaText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        heliArea = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        Slider = new javax.swing.JSlider();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 381));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Helicopter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 100, 25);

        areaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areaText.setForeground(new java.awt.Color(255, 255, 255));
        areaText.setText("Area not cleared");
        getContentPane().add(areaText);
        areaText.setBounds(20, 40, 92, 16);

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
        jButton1.setBounds(20, 70, 145, 26);

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
        jButton2.setBounds(170, 70, 148, 26);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Leser Operation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 100, 145, 26);

        heliArea.setBackground(new java.awt.Color(242, 242, 242));
        heliArea.setColumns(20);
        heliArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        heliArea.setForeground(new java.awt.Color(0, 0, 0));
        heliArea.setRows(5);
        jScrollPane1.setViewportView(heliArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 467, 140);

        jTextField1.setBackground(new java.awt.Color(242, 242, 242));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 280, 398, 30);

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
        jButton4.setBounds(420, 280, 70, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 60, 72, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Soldier Count");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 20, 72, 16);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(470, 60, 50, 26);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(470, 20, 50, 26);

        Slider.setBackground(new java.awt.Color(0, 0, 0));
        Slider.setForeground(new java.awt.Color(255, 255, 255));
        Slider.setMajorTickSpacing(20);
        Slider.setMinorTickSpacing(5);
        Slider.setOrientation(javax.swing.JSlider.VERTICAL);
        Slider.setPaintLabels(true);
        Slider.setPaintTicks(true);
        getContentPane().add(Slider);
        Slider.setBounds(520, 20, 60, 310);

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.setOpaque(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(390, 100, 66, 20);
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
public class Helicopter extends javax.swing.JFrame implements controllerObserver {

    private mainController mainGui;
    private Observerble ob;

    /**
     * Creates new form Helicopter
     */
    public Helicopter(Observerble ob) {
        this.ob = ob;

        setVisible(true);
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int frameWidth = 602;
        int frameHeight = 381 + 30;

        setLocation(screenWidth - frameWidth, screenHeight - frameHeight);

        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }

    public void update(int positionLevel) {

        if (jCheckBox1.isSelected()) {
            if (positionLevel > 20 && positionLevel < 50) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
            } else if (positionLevel > 50 && positionLevel < 80) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(false);
            } else if (positionLevel > 80) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);

            } else {
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
            }
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        areaText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        heliArea = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        Slider = new javax.swing.JSlider();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 381));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Helicopter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 100, 25);

        areaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areaText.setForeground(new java.awt.Color(255, 255, 255));
        areaText.setText("Area not cleared");
        getContentPane().add(areaText);
        areaText.setBounds(20, 40, 92, 16);

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
        jButton1.setBounds(20, 70, 145, 26);

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
        jButton2.setBounds(170, 70, 148, 26);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Leser Operation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 100, 145, 26);

        heliArea.setBackground(new java.awt.Color(242, 242, 242));
        heliArea.setColumns(20);
        heliArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        heliArea.setForeground(new java.awt.Color(0, 0, 0));
        heliArea.setRows(5);
        jScrollPane1.setViewportView(heliArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 467, 140);

        jTextField1.setBackground(new java.awt.Color(242, 242, 242));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 280, 398, 30);

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
        jButton4.setBounds(420, 280, 70, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 60, 72, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Soldier Count");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 20, 72, 16);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(470, 60, 50, 26);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(470, 20, 50, 26);

        Slider.setBackground(new java.awt.Color(0, 0, 0));
        Slider.setForeground(new java.awt.Color(255, 255, 255));
        Slider.setMajorTickSpacing(20);
        Slider.setMinorTickSpacing(5);
        Slider.setOrientation(javax.swing.JSlider.VERTICAL);
        Slider.setPaintLabels(true);
        Slider.setPaintTicks(true);
        getContentPane().add(Slider);
        Slider.setBounds(520, 20, 60, 310);

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.setOpaque(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(390, 100, 66, 20);

        
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 660, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void receivedMsg(String rMsg) {
        heliArea.setText(rMsg);
    }

    public void updateData(boolean data) {
        System.out.println(data);
        if (data == true) {
            areaText.setText("Area Cleared");
        } else if (data == false) {
            areaText.setText("Area Not Cleared");
        }

        this.revalidate(); // Ensures layout changes are applied
        this.repaint();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ob.sendMsg(jTextField1.getText(), "Helicopter");
        jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel areaText;
    private javax.swing.JTextArea heliArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/vecteezy_hud-animation-motion-templet-sci-fi_48672900-ezgif.com-video-to-gif-converter.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 660, 380);

        pack();
    }// </editor-fold>                        

    public void receivedMsg(String rMsg) {
        heliArea.setText(rMsg);
    }

    public void updateData(boolean data) {
        System.out.println(data);
        if (data == true) {
            areaText.setText("Area Cleared");
        } else if (data == false) {
            areaText.setText("Area Not Cleared");
        }

        this.revalidate(); // Ensures layout changes are applied
        this.repaint();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:

    }                                     

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        ob.sendMsg(jTextField1.getText(), "Helicopter");
        jTextField1.setText("");
    }                                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel areaText;
    private javax.swing.JTextArea heliArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}

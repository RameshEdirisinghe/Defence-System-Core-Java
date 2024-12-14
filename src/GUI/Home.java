/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Main.Helicopter;
import Main.Helicopter;
import Main.Submarine;
import Main.Submarine;
import Main.Tank;
import Main.Tank;
import jaco.mp3.player.MP3Player;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 *
 * @author ranga
 */
public class Home extends javax.swing.JFrame {

    private MP3Player bgMusicPlayer;

 
    public Home() {

        initComponents();

        

        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 580));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(88, 210, 238));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
       
        jLabel2.setText("Start Game");
        jLabel2.setMaximumSize(new java.awt.Dimension(364, 128));
        jLabel2.setMinimumSize(new java.awt.Dimension(364, 128));
        jLabel2.setPreferredSize(new java.awt.Dimension(364, 128));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 170, 230, 70);

        
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 50, 290, 100);

       
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 260, 230, 80);

       
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1922, 920));
        jLabel1.setMinimumSize(new java.awt.Dimension(1922, 920));
        jLabel1.setPreferredSize(new java.awt.Dimension(1922, 920));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -150, 1000, 860);

        pack();
    }// </editor-fold>                        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        

        
        Observerble ob = new Observerble();
        
        mainController mainGui = mainController.getInstance();
        mainGui.setObservable(ob);        
        
        ob.addControlObserver(new Submarine(ob));
        ob.addControlObserver(new Tank(ob));
        ob.addControlObserver(new Helicopter(ob));

    }                                    



    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}

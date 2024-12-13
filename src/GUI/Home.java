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
        File mp3File = new File("C:\\Users\\ranga\\Downloads\\bg_sound.mp3");
        if (mp3File.exists()) {
            System.out.println("File found: " + mp3File.getAbsolutePath());
        } else {
            System.out.println("File not found!");
        }
        bgMusicPlayer = new MP3Player(mp3File);
        bgMusicPlayer.setRepeat(true);
        bgMusicPlayer.play();
        initComponents();

        initComponents();

        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hqk720-removebg-preview.png"))); // NOI18N
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/call-of-duty-ghosts (3).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 50, 290, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hq720-removebg-preview.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 260, 230, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/4KWITHCC-ezgif.com-video-to-gif-converter (1).gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1922, 920));
        jLabel1.setMinimumSize(new java.awt.Dimension(1922, 920));
        jLabel1.setPreferredSize(new java.awt.Dimension(1922, 920));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -150, 1000, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // Home Sound
//        File mp3File = new File("C:\\Users\\ranga\\Downloads\\gun-shots-from-a-distance-7-96391.mp3");
//        if (mp3File.exists()) {
//            System.out.println("File found: " + mp3File.getAbsolutePath());
//        } else {
//            System.out.println("File not found!");
//        }
//        MP3Player mp3Player = new MP3Player(mp3File);
//        mp3Player.play();
        
        Observerble ob = new Observerble();
        
        mainController mainGui = new mainController(ob);
        mainGui.setVisible(true);
        
        Helicopter heli = new Helicopter(mainGui);
        Tank warTank = new Tank(mainGui);
        Submarine sub = new Submarine(mainGui);
        
        ob.setVehicles(heli,warTank,sub);
        ob.addControlObserver(heli);
        ob.addControlObserver(warTank);
        ob.addControlObserver(sub);

        
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Main;

import Main.Helicopter;
import Main.Helicopter;
import Main.Submarine;
import Main.Submarine;
import Main.Tank;
import Main.Tank;
import javaInterfaces.controllerObserver;
import javaInterfaces.controllerObserverInterface;

public class Observerble implements controllerObserverInterface {

    private controllerObserver[] con;
    private String[][] msgar = new String[0][2];
    private int position;
    private boolean Data;

    Observerble() {
        con = new controllerObserver[0];

    }



    private void extendsObserverArray() {
        controllerObserver[] tempcon = new controllerObserver[con.length + 1];
        for (int i = 0; i < con.length; i++) {
            tempcon[i] = con[i];
        }
        con = tempcon;
    }

    public void addControlObserver(controllerObserver vehicles) {
        extendsObserverArray();
        con[con.length - 1] = vehicles;
    }

    public void setSliderLevel(int position) {
        if (this.position != position) {
            this.position = position;
        }
        notifyObjects();
        
    }

    public void setData(boolean Data) {

        if (this.Data != Data) {
            this.Data = Data;
        }
        passData();
    }

    public void msgAdminToAll(String msg) {
        for (controllerObserver ob : con) {
            System.out.println(msg);
            ob.receivedMsg(msg);
        }

    }

    public void sendMsg(String msg, String Sender) {
        extendsMsgArray();
        msgar[msgar.length - 1][0] = msg;
        msgar[msgar.length - 1][1] = Sender;
        String msgArea = "";
        for (int i = 0; i < msgar.length; i++) {

            if (msgar[i][1].equals("Helicopter")) {
                msgArea = msgArea + "\n" + msgar[i][1] + ":" + msgar[i][0];
            } else if (msgar[i][1].equals("Tank")) {
                msgArea = msgArea + "\n" + msgar[i][1] + ":" + msgar[i][0];
            } else if (msgar[i][1].equals("Submarine")) {
                msgArea += "\n" + msgar[i][1] + ":" + msgar[i][0];
            } else {
                System.out.println("wrong sender");
            }
            System.out.println(msgArea);

        }
        mainController.getInstance().sendMsgArea(msgArea);

    }

    private void extendsMsgArray() {
        String[][] tempmsg = new String[msgar.length + 1][2];
        for (int i = 0; i < msgar.length; i++) {
            tempmsg[i] = msgar[i];
        }
        msgar = tempmsg;
    }

    public void passData() {

        for (controllerObserver ob : con) {
            System.out.println(Data);
            ob.updateData(Data);
        }

    }

    public void notifyObjects() {

        for (controllerObserver ob : con) {
            
            ob.update(position);
        }

    }
}

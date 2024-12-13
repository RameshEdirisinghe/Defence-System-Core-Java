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
    private int position;
    private Helicopter heli;
    private Tank warTank;
    private Submarine sub;
    private boolean Data;

    Observerble() {
        con = new controllerObserver[0];

    }

    public void setVehicles(Helicopter heli, Tank warTank, Submarine sub) {
        this.heli = heli;
        this.warTank = warTank;
        this.sub = sub;
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

    public void setSliderLevel(int position, String vehicleType) {
        if (this.position != position) {
            this.position = position;
        }
        notifyObjects(vehicleType);
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

    public void passData() {

        for (controllerObserver ob : con) {
            System.out.println(Data);
            ob.updateData(Data);
        }

    }

    public void notifyObjects(String vehicleType) {

        if (vehicleType.equals("Helicopter")) {
            heli.update(position);
        } else if (vehicleType.equals("Tank")) {
            warTank.update(position);
        } else if (vehicleType.equals("Submarine")) {
            sub.update(position);
        }

    }
}

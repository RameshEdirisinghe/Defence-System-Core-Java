/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package GUI;

public class controller implements controllerObserverInterface {

    private controllerObserver[] con;
    private int position;
    private Helicopter heli;
    private Tank warTank;
    private Submarine sub;

    controller(Helicopter heli,Tank warTank,Submarine sub) {
        con = new controllerObserver[0];
        this.heli=heli;
        this.warTank=warTank;
        this.sub=sub;
    }

//    private void extendsObserverArray() {
//        controllerObserver[] tempcon = new controllerObserver[con.length + 1];
//        for (int i = 0; i < con.length; i++) {
//            tempcon[i] = con[i];
//        }
//        con = tempcon;
//    }
//
//    public void addControlObserver(controllerObserver vehicles) {
//        extendsObserverArray();
//        con[con.length - 1] = vehicles;
//    }

    public void setSliderLevel(int position,String vehicleType) {
        if (this.position != position) {
            this.position = position;
        }
        notifyObjects(vehicleType);
    }

    public void notifyObjects(String vehicleType) {
     
            if (vehicleType.equals("Helicopter")) {
                heli.update(position);
                
            }else if(vehicleType.equals("Tank")){
                warTank.update(position);
            }else if(vehicleType.equals("Submarine")){
                sub.update(position);
            }
            
        
    }
}

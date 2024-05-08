/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240508.Ch14_4_interface1;

/**
 *
 * @author xvpow
 */
public class C14_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fly bird = new Bird();
        bird.flying();
        Fly airPlan = new  AirPlan();
        airPlan.flying();
        //AirPlan 飛機飛
    }
    
}

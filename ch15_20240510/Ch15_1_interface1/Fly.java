/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch15_20240510.Ch15_1_interface1;

/**
 *
 * @author xvpow
 */
public interface Fly {
    void flying();
    
    public default void startFlying(){
        System.out.println("準備起飛!");
        System.out.println("加速");
         flying();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240508.Ch14_6_interface3;

/**
 *
 * @author xvpow
 */
public class Monkey implements AnimalSkill {
    public void run(){
        System.out.println("Monkey 跑");
    }
    public void walk(){
         System.out.println("Monkey 走");
    }
    public void jump(){
       System.out.println("Monkey 跳"); 
    }
    public void talk(){
       System.out.println("Monkey talk");    
    }
}

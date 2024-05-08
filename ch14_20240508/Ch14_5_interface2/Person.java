/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240508.Ch14_5_interface2;

/**
 *
 * @author xvpow
 */
public class Person implements Run,Jump {
    private String name;
    public Person(String name){
       this.name = name;
    }
    public void run(){
        System.out.println(name+"人跑");
    }
    public void jump(){
        System.out.println(name+"人跳");
    }
}

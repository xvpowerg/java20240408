/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240426.Ch9_1_obj1;

/**
 *
 * @author xvpow
 */
public class Mouse extends Animal{
    Mouse(){}
    Mouse(String name,int age){
        super(name,age);
    }
    public String getName(){
        return "M:"+super.getName();
    }
}

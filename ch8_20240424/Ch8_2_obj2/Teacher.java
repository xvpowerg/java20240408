/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240424.Ch8_2_obj2;

/**
 *
 * @author xvpow
 */
public class Teacher extends Person {
    Teacher(){}
    Teacher(String name,int age){
        //super()呼叫父類別的建構式
        super(name,age);
    }
    public void printInfo(){
        System.out.print("T:");
        //super. 呼叫父類別函數
        super.printInfo();
    }
}

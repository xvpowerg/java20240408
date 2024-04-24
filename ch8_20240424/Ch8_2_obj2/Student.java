/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240424.Ch8_2_obj2;

/**
 *
 * @author xvpow
 */
public class Student extends Person{
    //建構是無法繼承
    Student(){}
    Student(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    //複寫 (將父類別的方法覆蓋)
    public void printInfo(){
        System.out.print("S:");
        System.out.println(this.getName()+":"+this.getAge());
    }
}

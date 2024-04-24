/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240424.Ch8_2_obj2;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    Person(){}
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void printInfo(){
        System.out.println(this.getName()+":"+this.getAge());
    }
}

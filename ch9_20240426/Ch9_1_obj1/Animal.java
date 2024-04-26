/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240426.Ch9_1_obj1;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int age;
    Animal(){}
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void printinfo(){
        System.out.println(getName()+":"+getAge());
    }
}

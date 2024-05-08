/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240508.Ch14_2_abstract1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    abstract void bark();
    public String toString(){
        return this.getName()+":"+this.getAge();
    }
}

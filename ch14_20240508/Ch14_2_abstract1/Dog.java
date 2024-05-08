/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240508.Ch14_2_abstract1;

/**
 *
 * @author xvpow
 */
public class Dog  extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void bark(){
        System.out.println("汪汪!!");
    }
    public String toString(){
        return "Dog:"+super.toString();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240506.Ch13_1_static1;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    private  static int totalCount = 0;
    Person(String name,int age){
        this.name = name;
        this.age = age;
        totalCount++;
    }
    public static int getTotalCount(){
        return totalCount;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return name+":"+age;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20240503.Ch12_4_override2;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return name+":"+age;
    }
    
    public boolean equals(Object obj){
        
        if (obj instanceof Student == false){
            return false;
        }
        Student st = (Student)obj;
        //比較關係時先比基本型態
        return this.age == st.age &&
                this.name.equals(st.name);
    }
    public String getName(){
        return this.name;
    }
}

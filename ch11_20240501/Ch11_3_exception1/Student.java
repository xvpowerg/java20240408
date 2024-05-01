/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240501.Ch11_3_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age < 0 || age > 200){
            //IllegalArgumentException 無效參數的例外
           throw new IllegalArgumentException("錯誤的年齡");
        }
        this.age = age;
    }
    
    public void printInfo(){
        System.out.println(name+":"+age);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240424.Ch8_1_obj1;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
   //privare將age屬性作限制  只能在同一類別內讀寫
    private int age;
    float height;
    
    Animal(){}
    Animal(String name,int age,float height){
        //this. 意思是當前物件的
        this.name = name;
        //this.age = age;
        setAge(age);
        this.height = height;     
    }
    public void setName(String name){
        if (name.length() < 1 || 
                name.length() >10 || name == null){
            System.out.println("錯誤的Name");
            return;
        }
        
        this.name = name;
    }
    
     public String getName(){
        return name;
    }
    //存錢
    public void setAge(int age){
        if (age >= 0){
            this.age = age;    
        }else{
            System.out.println("錯誤的年齡");
        }
        
    }
    //領錢
    public int getAge(){
        return age;
    }
    void printInfo(){
        System.out.println(getName()+":"+getAge()+":"+height);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240506.Ch13_2_init1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
   private int[] scores = new int[10];
    //初始化區塊
    {
        for (int i = 0; i< scores.length;i++){
             scores[i] = -1;
         }
    }
     
 
     Student(){
         
     }
     
     Student(String name){
         //this();
         this.name = name;
     }
     
     Student(String name ,int age){
         this.name = name;
         this.age = age;
     }
     
     public int getScore(int i){
         return scores[i];
     }
     
     public String toString(){
         return name+":"+age;
     }
}

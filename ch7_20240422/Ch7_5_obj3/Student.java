/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240422.Ch7_5_obj3;

/**
 *
 * @author xvpow
 */
public class Student {
    String name;
    int age;
    int score;
    Student(){}
    Student(String inName,int inAge,int inScore){
        name = inName;
        age = inAge;
        score = inScore;
    }
   void printInfo(){
       System.out.println(name+":"+age+":"+score);
   }
}

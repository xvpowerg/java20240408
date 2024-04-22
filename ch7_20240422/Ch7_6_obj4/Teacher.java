/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240422.Ch7_6_obj4;

/**
 *
 * @author xvpow
 */
public class Teacher {
    String name;
    int age;
    String classId;
    Teacher(){
        this("Empty",0,"Empty");//呼叫其他建構式
    }
    Teacher(String inName){
        this(inName,-1,"A0000");
    }
    Teacher(String inName,int inAge,String inClassId){
        name = inName;
        age = inAge;
        classId = inClassId;
    }
    void printInfo(){
        System.out.println(name+":"+age+":"+classId);
    }
}

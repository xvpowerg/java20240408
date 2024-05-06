/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240506.Ch13_3_init2;

/**
 *
 * @author xvpow
 */
public class Person {
    private static String[] hobbys = new String[10];
    static{
        
         for (int i = 0; i < hobbys.length;i++){
            hobbys[i] = "empty";
        }
        
    }
    Person(){
    
    }
    static String getHobby(int index){
        return hobbys[index];
    }

}

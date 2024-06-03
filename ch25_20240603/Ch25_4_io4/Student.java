/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch25_20240603.Ch25_4_io4;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Student implements Serializable {
    private String name;
    private int score;
    private float height;
    Student(String name,int score,float height){
        this.name = name;
        this.score = score;
        this.height = height;
    }
    
    public String toString(){
        return name+":"+score+":"+height;
    }
}

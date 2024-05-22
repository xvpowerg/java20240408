/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20240522.ch20_2_treeset2;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score1;
    private int score2;
    
    public Student(String name,int score1,int score2){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
    }
    
    public String getName(){
        return name;
    }
    public int getScore1(){
        return this.score1;
    }
    public int getScore2(){
        return this.score2;
    }
    
    public String toString(){
        return this.getName()+":"+this.getScore1()+":"+this.getScore2();
    }
}

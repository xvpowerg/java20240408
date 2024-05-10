/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20240510.Ch15_2_interface2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Person implements MyIterator{
    private String name;
    private ArrayList<String> movieList = new ArrayList();
    
    public String getData(int index){
        
        return movieList.get(index);
    }
    
    public int length(){
        return movieList.size();
    }
    public Person(String name){
        this.name = name;
    }
    public void addMovie(String movie){
        movieList.add(movie);
    }
    
    /*public void foreach(){
        for (String v : movieList){
            System.out.println(v);
        }
    }*/
}

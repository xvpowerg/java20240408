/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20240510.Ch15_4_interface4;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Student implements MyIterator{
    private ArrayList<String> books =
                new ArrayList();
    private String name;
    
    
    public String getData(int index){
        return books.get(index);
    }
    public int length(){
        return books.size();
    }
    public Student(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public void addBook(String book){
        books.add(book);
    }
    
    /*public void foreach(){
        System.out.print(this.name+":");
        for (String book : books){
            System.out.print(book+ " ");
        }
        System.out.println();
    }*/
    
}

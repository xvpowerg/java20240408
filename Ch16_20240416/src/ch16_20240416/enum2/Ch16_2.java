/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240416.enum2;

/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    enum Animal{
        Dog,Cat,Monkey
    }
    public static void main(String[] args) {
      System.out.println(Animal.Dog);
      System.out.println(Animal.Dog.ordinal());
      System.out.println(Animal.Monkey.ordinal()); 
     
     Animal cat =  Animal.valueOf("Cat");
     System.out.println(cat);
     //Animal.valueOf("Bird");
        for(Animal a :  Animal.values()){
                System.out.println(a);
        }
        
      System.out.println("name:"+Animal.Cat.name());  
    }
}

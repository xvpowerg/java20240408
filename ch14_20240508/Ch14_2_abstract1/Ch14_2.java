/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240508.Ch14_2_abstract1;

/**
 *
 * @author xvpow
 */
public class Ch14_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal a1  = new Dog("YuYu",10);
       System.out.println(a1);//Dog:YuYu:10
      Animal a2  = new Cat("ViVi",6);
       //Cat 幫我建立Cat 必須繼承Animal
      System.out.println(a2); //Cat:ViVi:6
      
      a1.bark();
      a2.bark();
       
    }
    
}

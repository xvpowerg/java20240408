/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20240517.Ch18_7_enum1;
/**
 *
 * @author xvpow
 */
public class TestEnum {
   enum Fruit{
       蘋果,奇異果,西瓜
   }
    static void selectFruit(Fruit fruit){
            switch(fruit){
                case 蘋果:
                   System.out.println("蘋果");
                break;
                case 奇異果:
                 System.out.println("奇異果");
                break;
                case 西瓜:
                     System.out.println("西瓜");
                 break; 
            }
        
        
    }
   
   static void selectFruit(int fruit){
       switch(fruit){
           case 1:
               System.out.println("蘋果");
              break;
           case 2:
               System.out.println("奇異果");
               break;
           case 3:
               System.out.println("西瓜");
               break;
           default:
               System.out.println("Error!");
               break;
       }
   } 
    
}

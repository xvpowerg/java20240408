/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240410;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name = null;//null甚麼都沒有 不知道該給甚麼
       //NullPointerException
       switch(name){
           case "Vivin":
               System.out.println("PM");
               break;
           case "Ken":
               System.out.println("RD");
               break;
           case "Lucy":
               System.out.println("HR");
               break;
           default:
                System.out.println("Error");
               break;
       }
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240410;

/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //swtich case
       int action = 1;
       if (action == 1)
           System.out.println("Play");
       else if(action == 2)
           System.out.println("Stop");
       else if (action == 3)
            System.out.println("Exit");
       else
           System.out.println("Error");
       
       switch(action){
           case 1:
               System.out.println("Play");
               break;
           case 2:
               System.out.println("Stop");
               break;
           case 3:
               System.out.println("Exit");
               break;
           default:
               System.out.println("Error");
               break;
       }
       
       
       
       
    }
    
}

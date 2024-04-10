/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240410;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      final int PLAY = 1;//常數   
      final int STOP = 2;//常數
      final int EXIT = 3;
      int action = STOP;
      //switch 的參數 可用 整數(byte short int ) 字元 字串 列舉(enum) 
       switch(action){
           case PLAY:
               System.out.println("Play");
               break;
           default:
              System.out.println("Error");
              break;   
           case STOP:
               System.out.println("Stop");
               break;  
           case EXIT:
               System.out.println("Exit");
               break;
          
       }         
    }
    
}

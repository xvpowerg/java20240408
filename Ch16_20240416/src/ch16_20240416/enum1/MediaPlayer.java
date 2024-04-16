/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20240416.enum1;

/**
 *
 * @author xvpow
 */
public class MediaPlayer {
      static final int PALY = 1;
      static final int STOP = 2;
      static final int PAUSE = 3;
      public enum Action{
          PLAY,STOP,PAUSE
      }
      
      public static void action(Action action){
          switch(action){
              case PLAY:
                  System.out.println("Play");
                  break;
              case STOP:
                   System.out.println("Stop");
                  break;
              case PAUSE:
                  System.out.println("Pause");
                  break;
                  
          }
      }
    public static void action(int action){
      
        switch(action){
            case PALY:
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;
            case PAUSE:
                System.out.println("Pause");
                break;
            default:
                System.out.println("Error");
                break;
        }
        
    }
}

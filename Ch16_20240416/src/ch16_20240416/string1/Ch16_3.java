/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240416.string1;

/**
 *
 * @author xvpow
 */
public class Ch16_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String msg = "Ken,Vivin,Lucy,Joy";
       String[] data =  msg.split(",");
        for (String v : data){
            System.out.println(v);
        }
         System.out.println("=========================");
     String msg2 = "Ken:100,Vivin:75,Lucy:63,Joy:88";
      String[] data2 =   msg2.split(",");
      for (String d : data2){
          String[] data3 =  d.split(":");
          for(String d2 :data3){
              System.out.println(d2);
          }
      }
    }
    
}

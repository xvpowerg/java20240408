/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240415;
import java.util.Arrays;
public class Ch4_1 {
    public static void main(String[] args) {
       int[] scores = new int[5];
       scores[1] = 60;
       scores[3] = 85;
       scores[2] = 71;
     
       for (int i =0; i <scores.length;i++){
           System.out.print(scores[i]+" ");
       } 
       System.out.println();
       for (int v : scores){
           System.out.print(v+" ");
       }
       Arrays.stream(scores).forEach(System.out::println);
    }
    
}

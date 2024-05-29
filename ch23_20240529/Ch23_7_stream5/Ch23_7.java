/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240529.Ch23_7_stream5;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch23_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(70);
       list.add(30);
      Optional<Integer> op1 = list.stream().reduce((v1,v2)->{
           System.out.println(v1+":"+v2);
           return v1+v2;
       });
      System.out.println(op1.get());
       System.out.println("=======================");
     int sum =  list.stream().reduce(5, (v1,v2)->{
          System.out.println(v1+":"+v2);
            return v1 +v2;
      });
      System.out.println(sum);
    }
    
}

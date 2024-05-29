/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240529.Ch23_2_option2;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class TestOption {
    public static void testOption1(){
      Optional<String> op = Optional.empty();
      op = Optional.of("Values");
      if (op.isPresent()){
           System.out.println(op.get());
      }
    }
    public static void testOption2(){
        //不支持null
       // Optional<String> op2 = Optional.of(null);
        //支持null
       Optional<String> op3 = Optional.ofNullable(null);
    }
    public static void testOption3(){
         Optional<String> op3 = Optional.ofNullable("TestValue");
         if (op3.isPresent()){
             //如果Optional是Empty get會產生例外
               System.out.println(op3.get());
         }
         op3.ifPresent(v->{
             System.out.println("ifPresent:"+v);
         });
         //op3 emptye 給某個預設值
         String orElse = op3.orElse("default");
         System.out.println("orElse:"+orElse);
         //op3 emptye 拋例外
        String orElseThrow = op3.orElseThrow();
        System.out.println("orElseThrow:"+orElseThrow);
    }
    
       public static void testOption4(){
         Optional<String> op3 = Optional.ofNullable(null);
         if (op3.isPresent()){
             //如果Optional是Empty get會產生例外
               System.out.println(op3.get());
         }
         op3.ifPresent(v->{
             System.out.println("ifPresent:"+v);
         });
         //op3 emptye 給某個預設值
         String orElse = op3.orElse("default");
         System.out.println("orElse:"+orElse);
         //op3 emptye 拋例外
        String orElseThrow = op3.orElseThrow();
        System.out.println("orElseThrow:"+orElseThrow);
    }
}

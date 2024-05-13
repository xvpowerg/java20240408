/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240513.Ch16_2_interface2;
import java.util.function.Consumer;

public class Ch16_2 {

   static void runToDo(Consumer<String> callback)throws Exception{
       System.out.println("開始下載!!");
       for(int i = 1; i <= 5;i++){
           System.out.print(".");
           Thread.sleep(1000);
       }
       callback.accept("完成!!");
   }
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
       runToDo(new CloseWindow());
    }
    
}

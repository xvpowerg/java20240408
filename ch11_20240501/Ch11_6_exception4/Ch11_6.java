/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240501.Ch11_6_exception4;

/**
 *
 * @author xvpow
 */
public class Ch11_6 {

   static void testFunc(int v){
        if (v > 10){
            throw new RuntimeException("例外發生");
        }
    }
    public static void main(String[] args) {
       try{
           System.out.println("初始化!");
            testFunc(100);   
         
       }catch(RuntimeException ex){
           System.out.println(ex);
       }finally{//一定會執行一次
             System.out.println("清除");   
       }
        
        
    }
    
}

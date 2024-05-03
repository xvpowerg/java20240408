/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20240503.Ch12_2_exception2;

/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    static void testValue(int v)throws MyException{
      System.out.println("開始!!");
        if (v > 10){
            throw new MyException();
        }
      System.out.println("完成");   
    }
    static void testRuntime(int v){
          System.out.println("testRuntime 開始!!");
        if (v < 10){
            throw new MyRuntimeException("錯誤的數字");
        }
       System.out.println("testRuntime 完成!!");
    }
    public static void main(String[] args) {
        try{
            testValue(15);
        }catch(MyException ex){
            System.out.println(ex);
        }
        try{
            testRuntime(5); 
        }catch(MyRuntimeException ex){
            System.out.println(ex);
        }
     
    }
    
}

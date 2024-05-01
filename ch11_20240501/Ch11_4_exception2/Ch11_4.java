/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240501.Ch11_4_exception2;

/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestException tex = new TestException();
       try{
           System.out.println("Test1");
          tex.testFunc(10); //例外發生會中斷
           System.out.println("Test2");
          
       }catch(Exception ex){
           System.out.println(ex);
       }
       int v = 10;
       if(v < 5){
           tex.testFunc2(v);
       } 
       
       try{
           tex.testFunc2(v);
       }catch(RuntimeException ex){
           System.out.println(ex);
       }
       
    }
    
}

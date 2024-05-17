/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240517.Ch18_2_Inner1;

/**
 *
 * @author xvpow
 */
public class Ch18_2 {

    
    private static class MyTestIf implements TestIF{
        public void func1(){
            System.out.println("MyTestIf Func1");
        }
        
        public void func2(){
            System.out.println("MyTestIf Func2");
        }
    }
    
    public static void main(String[] args) {
       MyTestIf myTestIf = new MyTestIf();
       myTestIf.func1();
       myTestIf.func2();
    }
    
}

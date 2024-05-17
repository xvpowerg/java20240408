/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240517.Ch18_4_Inner3;

/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestInnerClass2 tc2 = new TestInnerClass2("Hello!");
       tc2.testRun();
       
       TestInnerClass2.TestMyInner tc3 = 
               new TestInnerClass2("你好!").new TestMyInner(120);
       System.out.println(tc3);
    }
    
}

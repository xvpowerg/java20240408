/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240517.Ch18_3_Inner2;

/**
 *
 * @author xvpow
 */
public class Ch18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestInnerClass.MyStaticClass mstclass = 
                new TestInnerClass.MyStaticClass("Hello!");
        System.out.println(mstclass);
    }
    
}

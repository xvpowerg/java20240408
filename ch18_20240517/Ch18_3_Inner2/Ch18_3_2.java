/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240517.Ch18_3_Inner2;
import ch18_20240517.Ch18_3_Inner2.TestInnerClass.MyStaticClass;
import static ch18_20240517.Ch18_3_Inner2.TestInnerClass.max;
/**
 *
 * @author xvpow
 */
public class Ch18_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyStaticClass msc = new MyStaticClass("你好");
       System.out.println(msc);
      int max =  TestInnerClass.max(2, 5);
      System.out.println(max);
     System.out.println(max(9,2));
    }
    
}

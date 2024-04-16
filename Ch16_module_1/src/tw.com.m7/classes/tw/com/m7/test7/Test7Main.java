/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m7.test7;
import tw.com.m6.test6.TestM6;
import tw.com.m4.test4.TestM4;
import tw.com.m5.test5.TestM5;
/**
 *
 * @author xvpow
 */
public class Test7Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TestM6 tm6 = new TestM6();
      TestM4 m4 = new TestM4();
      TestM5 m5 = new TestM5();
      tm6.showTest4(m4);
      tm6.showTest5(m5);
    }
    
}

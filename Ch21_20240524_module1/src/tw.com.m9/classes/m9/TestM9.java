/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m9;
import m8.TestM8;
import m6.TestM6;
import m7.TestM7;
/**
 *
 * @author xvpow
 */
public class TestM9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestM8 m8 = new TestM8();
        TestM6 m6 = new TestM6();
        TestM7 m7 = new TestM7();
        m8.showTestM6(m6);
        m8.showTestM7(m7);
    }
    
}

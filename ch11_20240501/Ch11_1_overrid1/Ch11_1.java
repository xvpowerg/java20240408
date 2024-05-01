/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240501.Ch11_1_overrid1;

/**
 *
 * @author xvpow
 */
public class Ch11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        t1.testPublic();
        t1.testProtected();
        t1.testDefault();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240501.Ch11_1_overrid1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    public void testPublic(){
        System.out.println("Test2 testPublic");
    }
    protected  void testProtected(){
        System.out.println("Test2 protected");
    }
    void testDefault(){
         System.out.println("Test2 testDefault");
    }
    private void testPrivate(){
         System.out.println("Test2 testPrivate");
    }
}

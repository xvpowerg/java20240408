/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ch10_20240429.ch10_5_overrid1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    public void testPublic(){
        System.out.println("Test2 testPublic");
    }
    //public protected
    protected void testProtected(){
        System.out.println("Test2 testProtected");
    }
    void testDefault(){
        System.out.println("Test2 testDefault");
    }
    //不是複寫
    private void testPrivate(){
        System.out.println("Test2 testPrivate");
    }
}

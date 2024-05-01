/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240501.Ch11_1_2_overrid1;
import ch11_20240501.Ch11_1_overrid1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3  extends Test1{
    @Override
    public void testPublic(){
        System.out.println("Test3 testPublic");
    }
    @Override
    protected void testProtected(){
          System.out.println("Test3 testPritected");
    }
    
   // @Override
    void testDefault(){
        System.out.println("Test3 testDefault");
    }
    
    
}

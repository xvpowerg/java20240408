/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ch10_20240429.ch10_1_2_Obj1;
import Ch10_20240429.ch10_1_Obj1.TestMod1;
/**
 *
 * @author xvpow
 */
public class Ch10_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestMod1 tmod1 = new TestMod1(); 
        System.out.println(tmod1.publiValue);
        TestMod2 tmod2 = new TestMod2();
        tmod2.showProtected();
    }
    
}

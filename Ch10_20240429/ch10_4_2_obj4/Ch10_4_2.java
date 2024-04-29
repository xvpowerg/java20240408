/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ch10_20240429.ch10_4_2_obj4;
import Ch10_20240429.ch10_4_obj4.TestModPublic;
import Ch10_20240429.ch10_4_obj4.TestModProtected;
import Ch10_20240429.ch10_4_obj4.TestModDefault;
import Ch10_20240429.ch10_4_obj4.TestModPrivate;
/**
 *
 * @author xvpow
 */
public class Ch10_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestModPublic t1 = new TestModPublic();
        
        TestMyProtected myp = new TestMyProtected();
        
        TestModPrivate.newTestModPrivate();
        /*
        TestModProtected t2 = new TestModProtected();
        TestModDefault t3 = new TestModDefault();
        TestModPrivate t4 = new TestModPrivate();*/
    }
    
}

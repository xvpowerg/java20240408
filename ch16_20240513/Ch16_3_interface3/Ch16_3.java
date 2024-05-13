/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240513.Ch16_3_interface3;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch16_3 {

    static void testNumber(int v,Supplier<RuntimeException> s){
        if (v <30){
            throw s.get();
        }
        System.out.println(v);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        testNumber(50,new TestNumberSupplier());
        
       testNumber(20,new TestNumberSupplier());
    }
    
}

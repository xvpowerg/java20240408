/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20240513.Ch16_3_interface3;
import java.util.function.Supplier;
import java.lang.IllegalArgumentException;
/**
 *
 * @author xvpow
 */
public class TestNumberSupplier implements Supplier<RuntimeException> {
    public  IllegalArgumentException get(){
        return new IllegalArgumentException("數字錯誤");
    }
}

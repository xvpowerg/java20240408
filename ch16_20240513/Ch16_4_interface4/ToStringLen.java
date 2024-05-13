/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20240513.Ch16_4_interface4;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class ToStringLen implements Function<String,Integer>{
    public Integer apply(String str){
        return str.length();
    }
}

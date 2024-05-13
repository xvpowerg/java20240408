/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20240513.Ch16_6_interface6;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class FilterLen implements Predicate<String>{
    private int len;
    FilterLen(int len){
        this.len = len;
    }
    public boolean test(String s){
        return s.length() > this.len;
    }
}

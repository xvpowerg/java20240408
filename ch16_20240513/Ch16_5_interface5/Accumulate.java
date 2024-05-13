/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20240513.Ch16_5_interface5;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Accumulate implements UnaryOperator<Integer>{
    private int number;
    Accumulate(int number){
        this.number = number;
    }
    public Integer apply(Integer i){
        return i + number;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20240513.Ch16_2_interface2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class CloseWindow implements Consumer<String> {
    public void accept(String s){
        System.out.println(s);
        System.out.println("關閉視窗");
    }
}

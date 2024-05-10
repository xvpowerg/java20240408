/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch15_20240510.Ch15_4_interface4;

/**
 *
 * @author xvpow
 */
//消費者
//如果介面中有一個以上的抽象方法就不是FunctionalInterface
//介面抽象方法只有一個是FunctionalInterface
@FunctionalInterface
public interface Consumer {
    public void accept(String v);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch15_20240510.Ch15_4_interface4;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
    public String getData(int index);
    public int length();
    //會使用default原因是因為會呼叫抽象的介面方法
    public default void foreach(Consumer c){
        for (int i = 0; i < length();i++){
            if (c != null){
                c.accept(getData(i));
                continue;
            }
            System.out.print(getData(i)+" ");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch16_20240513.Ch16_1_interface1;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
    public String getData(int index);
    public int length();
    //會使用default原因是因為會呼叫抽象的介面方法
    public default void foreach(Consumer con){
        for (int i = 0; i < length();i++){
            if (con != null){
                con.accept(getData(i));
            }else{
                 System.out.print(getData(i)+" ");
            }
           
        }
    }
}

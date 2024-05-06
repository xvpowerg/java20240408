/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240506.Ch13_5_shade1;

/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    /*
       遮蔽看類別
       複寫看物件
    遮蔽 靜態 屬性
    複寫 非靜態方法
    */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        //非靜態方法屬於複寫
        t1.func1();
        //屬性 跟 靜態的方法 都屬於遮蔽行為
        System.out.println(t1.msg1);   
        t1.staticFunc();
    }
    
    
}

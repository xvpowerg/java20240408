/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240501.Ch11_2_overrid2;

/**
 *
 * @author xvpow
 */
public class Ch11_2 {
        
    /*
        1 只能越來越公開
        2 回傳值基本型態必須一樣 
        3 回傳值參考型態可以是子類 或一樣
        4 方法與參數必須一樣
        5 例外的拋出
    */

    public static void main(String[] args) {
             Test1 t2 = new Test2();
             t2.sum();
             Test3 t3 =  t2.testFunc();
             System.out.println(t3);
             
    }
    
}

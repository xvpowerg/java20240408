/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ch10_20240429.ch10_5_overrid1;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {

    /*複寫規則Override
        1 Modifier 只能開放不能封閉
        2 回傳值如果是基本型態複寫必須一樣
        3 回傳值如果是參考型態複寫可一樣或子類
        4 函式名稱必須樣 傳入的參數也必須一樣
        5 拋出例外 可不拋 可拋 可拋子例外
    */
    public static void main(String[] args) {
        Test1 t2 = new Test2();
        t2.testPublic();
        t2.testProtected();
        t2.testDefault();
        
    }
    
}

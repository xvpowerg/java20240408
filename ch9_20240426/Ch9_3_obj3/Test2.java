/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240426.Ch9_3_obj3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    Test2(){
        //預設呼叫super() 意思呼叫父類別的預設建構式
        //如果有手動呼叫this(xxx)c或 super(xxxx)
        //就不會預設呼叫super()
        super();
    }
}

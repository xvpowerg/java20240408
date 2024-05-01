/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240501.Ch11_4_exception2;

/**
 *
 * @author xvpow
 */
public class TestException {
    //必須try catch
    public void testFunc(int v)throws Exception{
        if (v > 5){
            throw new Exception();
        }
    }
     //不一定try catch
    public void testFunc2(int v){
        if (v > 5){
            throw new RuntimeException();
        }
    }
}

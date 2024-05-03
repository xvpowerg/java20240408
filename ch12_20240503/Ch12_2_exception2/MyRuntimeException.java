/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20240503.Ch12_2_exception2;

/**
 *
 * @author xvpow
 */
//無規定拋出或catch
public class MyRuntimeException extends RuntimeException {
    MyRuntimeException(){
        
    }
    MyRuntimeException(String msg){
        super(msg);
    }
}

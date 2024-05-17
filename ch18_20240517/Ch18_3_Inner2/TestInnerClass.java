/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20240517.Ch18_3_Inner2;

/**
 *
 * @author xvpow
 */
public class TestInnerClass {
    static class MyStaticClass{
        String msg;
        MyStaticClass(String msg){
            this.msg = msg;
        }
        public String toString(){
            return this.msg;
        }
    } 
    
    static int max(int v1,int v2){
        return v1 > v2 ? v1 :v2;
    }
    
}

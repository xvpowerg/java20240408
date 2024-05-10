/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch15_20240510.Ch15_3_interface3;

/**
 *
 * @author xvpow
 */
public interface Calculate {
    int compute(int v1,int v2);
    public static int add(int v1,int v2){
        return  v1+v2;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20240510.Ch15_3_interface3;

/**
 *
 * @author xvpow
 */
public class MyPower implements Calculate  {
    private int pw = 2;
    public int compute(int v1,int v2){
        if (v2 <= 0){
            //return 1;
            v2 = pw;
        }
        int result = v1;
     
        for (int i = 1; i < v2;i++){
            result *= v1;
        }
        return result;
    }
}

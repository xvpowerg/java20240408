/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240419;

/**
 *
 * @author xvpow
 */
public class Ch6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //封箱基本型態變物件型態
        //因為java有些東西只能存物件(參考型態)
        //整數
        //byte  Byte
        //short Short
        //int Integer
        //long Long
        //浮點數
        //double Double
        //float Float
        //字元
        //char Character
        //布林
         //boolean Boolean
        int v1 = 25;
        //手動封箱
        Integer intObj =  Integer.valueOf(v1);
        System.out.println(intObj);
        //手動解封箱
        int v2 = intObj.intValue();
        System.out.println(v2);
        
        //自動封箱
        int v3 = 72;
        Integer intObj2 = v3;
        System.out.println(intObj2);
        //自動解封箱
        int v4 = intObj2;
        System.out.println(v4);
        
    }
    
}

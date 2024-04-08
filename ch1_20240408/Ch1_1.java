/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240408;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //整數
       //byte 8 bit
       //short 16bit
       //int  32bit // 預設都是整數
       //long 64bit
       //浮點數
       //float 32
       //double 64//預設
       //字元
       //cahr 16 無負數0~65535
       //布林
       //boolean 1
       byte v1 = 122;
       System.out.println(v1);
       int i1 = 56;//大無法接放到小
       //v1 = i1;
       i1 = v1;
       //long v2 = 2147483648L;
       //浮點數
       double d1 = 5.2;
       System.out.println(d1);
       float f1 = 3.141f;//常考
       System.out.println(f1); 
       
       char ch1 = '你';
       System.out.println(ch1);
       System.out.println((int)ch1);
       
       char ch2 = 66;
       System.out.println(ch2);
       
       boolean b1 = true;
       boolean b2 = false;
       System.out.println(b1);
       System.out.println(b2);
       
       var x = 10;//自動推算類型
       System.out.println(x);
    }
    
}

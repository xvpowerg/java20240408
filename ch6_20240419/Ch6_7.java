/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240419;

/**
 *
 * @author xvpow
 */
public class Ch6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 10;
        System.out.println("V1:"+v1+" V2:"+v2);
        System.out.println(v1 == v2);
        
        Integer v3 = 20;
        Integer v4 = 20;
        System.out.println("v3:"+v3+" v4:"+v4);
        System.out.println(v3 == v4); 
        
        Integer v5 = 350;
        Integer v6 = 350;
        int v7 = 350;
        int v8 = 350;
        System.out.println("v5:"+v5+" v6:"+v6);
        System.out.println(v5 == v6); 
         System.out.println(v5.equals(v6) ); 
        System.out.println(v7 == v8); 
        //只要數值是-128~127之間 java的Integer.valueOf 不會建立新的參考物件
        //會使用預設建立好的快取
        Integer v9 = Integer.valueOf(128);
        Integer v10 = Integer.valueOf(128);
        System.out.println(v9 == v10);
        
    }
    
}

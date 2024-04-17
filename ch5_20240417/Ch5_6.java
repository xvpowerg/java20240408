/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240417;

/**
 *
 * @author xvpow
 */
public class Ch5_6 {

    //多載 Overloading
    //改變參數類型 貨數量時 
    //為了相容舊程式碼
    
    static int test1(int v1,int v2){
        int ans = v1 * v2;
        return ans;
    }
    static int test1(int v1,int v2,int v3){
        int ans = test1(v1,v2) * v3;
        return ans;
    }
    static float test1(float v1,float v2){
        float ans = v1 * v2;
        return ans;
    }
    public static void main(String[] args) {
        
        int v = test1(20,5);
        System.out.println(v);    
        float v6 =  test1(15.5f,6.2f);
        System.out.println(v6);
        
        System.out.println(test1(5,2,3));
    }
    
}

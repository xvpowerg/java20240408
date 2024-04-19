/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240419;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {
    //call by value
    static void swap(int x,int y){
        int tmp = x;//10
        x = y; // 20
        y = tmp;//10
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x+":"+y);
        swap(x,y);// 因為是基本型態 所以傳入函式不變
        System.out.println(x+":"+y);
                
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240417;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    //回傳值
    //函式名稱
    //傳入的參數
     static void test1(){
        System.out.println("Test!");
    }
    static void test2(int x,int y){
        for (int i = x;i <= y;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    static int sum(int v1,int v2){
        int ans = v1 + v2;
        return ans;
    }
    
    //傳一個整數陣列 求平均值 
    static float avg( int[] array  ){
        float avg = 0;
        float sum = 0;
        int len = array.length;
        for (int v : array){
            sum += v;
        }
        avg = sum / len;
        return avg;
    }
    //靜態無法呼叫非靜態的
    public static void main(String[] args) {
        // TODO code application logic here
        test1();
        test1();
        test1();
        test2(5,10);
        test2(2,6);
        
        int v = sum(10,5);
        System.out.println(v);
        int[] array = {8,9,3,2,7};
        float a1 = avg(array);
        System.out.println(a1);
    }
    
}

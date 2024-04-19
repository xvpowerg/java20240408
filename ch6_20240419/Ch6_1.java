/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240419;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    static int test1(int a1,int a2){
        int sum = a1 +a2;
        return sum;
    }
    
    static int test1(int a1,int a2,int a3){
        int sum = test1(a1,a2) + a3;
        return sum;
    }
    
    //無參數回傳0 可以傳n筆參數
    //長參數
    static int test1(int ... data){
        int sum = 0;
        for (int v : data){
            sum += v;
        }
        return sum;
    }
    static int test2(int[] values){
        int sum = 0;
        for (int v :values ){
            sum += v;
        }
        return sum;
    }
    public static void main(String[] args) {
              
      int s4 =  test1(5,6,7,1);
      System.out.println(s4);
      int s5 =  test1();
      System.out.println(s5);
      
      int[] array3 = {5,6,8};
      int s6 = test1(array3);
      System.out.println(s6);
      
        
       int s1 = test1(10,20,25);
       System.out.println(s1);
       
      int[] array = {};
      int s2 =  test2(array);
      System.out.println(s2);
      int[] array2 = {7,2,9,11};
      int s3 =  test2(array2);
      System.out.println(s3);

    }
    
}

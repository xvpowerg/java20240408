/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20240503.Ch12_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    static void test1(String name){
        try{
             System.out.println("初始資料....");
            if (name.length() < 2){
                throw new RuntimeException("錯誤的長度");
            }
        }catch(RuntimeException ex){
            System.out.println(ex);
        }finally{
             System.out.println("清空資料....");  
        }
      
      
    }
    
    static void test2(int v){
        try{
            System.out.println("test2 初始資料....");
            if (v > 5){
                return;
            }
           
        }finally{
             System.out.println("test2 清空資料....");
        }
  
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        test1("Test");
        test1("A");
        
        test2(15);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240605.Ch26_2_thread2;

/**
 *
 * @author xvpow
 */
public class Ch26_2 {

    static class Test1{
        int x = 0;
        void print(){
            synchronized (this) {
                 for (int i =1; i <= 10; i++){
                    x++;
                    System.out.println(x);
                }
            } 
           
        }
    }
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       Thread th1 = new Thread(()->{
         t1.print();
       });
       Thread th2 = new Thread(()->{
         t1.print();
       });
       th1.start();
       th2.start();
    }
    
}

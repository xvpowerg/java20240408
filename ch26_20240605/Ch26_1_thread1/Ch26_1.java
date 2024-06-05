/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240605.Ch26_1_thread1;

/**
 *
 * @author xvpow
 */
public class Ch26_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName());
       
       Thread t1 = new Thread(()->{
           System.out.println(Thread.currentThread().getName());
       
       });
       t1.start();
       
       Thread t2 = new Thread(()->{
           System.out.println(Thread.currentThread().getName());
       
       },"MyThread");
       
       t2.start();
       
       Thread t3 = new Thread(()->{
            for (int i =1; i<= 3;i++){
                System.out.println(i);
                try{
                    Thread.sleep(500);
                }catch(Exception ex){
                    
                }
              
            }
            
       
       });
       t3.start();
       
    }
    
}

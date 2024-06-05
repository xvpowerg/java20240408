/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240605.Ch26_4_thread4;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author xvpow
 */
public class Ch26_4 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i =1; i <= 10; i++){
               es.submit(()->{
                    System.out.println(Thread.currentThread().getName());
                    try{
                        Thread.sleep(1000);
                    }catch(Exception ex){

                    }

                 });
        }
     //es.shutdown();//等全跑完停止服務
     es.shutdownNow();//立刻停止服務
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240605.Ch26_5_thread5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
/**
 *
 * @author xvpow
 */
public class Ch26_5 {

  
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        
         Future<Integer> f = es.submit(()->{
            System.out.println("計算中.....");
            TimeUnit.SECONDS.sleep(5);
          return 100;  
        });
         try{
                System.out.println(f.get());
         }catch(Exception ex){
             
         }
         
         System.out.println("完成!!");
        es.shutdown();
    }
    
}

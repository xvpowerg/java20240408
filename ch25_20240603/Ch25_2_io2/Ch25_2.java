/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_2_io2;

/**
 *
 * @author xvpow
 */
public class Ch25_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       try( TestClose t1 = new TestClose("Test1",true);
            TestClose t2 = new TestClose("Test2",true);){
           
           System.out.println("Test Body!");
           throw new Exception("Body!!");
       }catch(Exception ex){
           System.out.println(ex);
         Throwable[] supps =    ex.getSuppressed();
         for (Throwable t : supps){
             System.out.println(t);
         }
       }
    }
    
}

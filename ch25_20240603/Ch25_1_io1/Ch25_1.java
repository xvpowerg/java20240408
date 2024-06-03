/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_1_io1;

/**
 *
 * @author xvpow
 */
public class Ch25_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       try( TestClose t1 = new TestClose("Test1");
            TestClose t2 = new TestClose("Test2",true);){
           
           System.out.println("Test Body!");
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}

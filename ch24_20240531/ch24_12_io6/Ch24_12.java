/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_12_io6;

/**
 *
 * @author xvpow
 */
public class Ch24_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
       try( TestClose t1 = new TestClose("close1");
       TestClose t2 = new TestClose("close2");){
           
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}

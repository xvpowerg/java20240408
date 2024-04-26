/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240426.Ch9_7_obj7;

/**
 *
 * @author xvpow
 */
public class Ch9_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Modifier修飾符
        
        public
        protected
        default(空白不打)
        private
        
        */
       
      Test1 t1 = new Test1();
      System.out.println(t1.testPublic);
      System.out.println(t1.testProtected);
       System.out.println(t1.testDefault);
    }
    
}

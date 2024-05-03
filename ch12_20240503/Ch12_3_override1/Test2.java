/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20240503.Ch12_3_override1;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    //拋跟父類別一樣的例外
//   public void testException()throws ParentException{
//           System.out.println("Test2 testException");
//       }
    //不拋
//        public void testException(){
//           System.out.println("Test2 testException");
//       }
   //拋跟父類別子類型的例外
//      public void testException()throws SubException{
//           System.out.println("Test2 testException");
//       }
//    
//          public void testException()throws SQLException{
//           System.out.println("Test2 testException");
//       }
   //RuntimeException無限制
     public void testException()throws RuntimeException{
           System.out.println("Test2 testException");
       }
}

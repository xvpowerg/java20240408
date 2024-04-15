/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240415;

/**
 *
 * @author xvpow
 */
public class Ch4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //整數
        int[] intArray = new int[5];
        System.out.println(intArray[0]);//0
        //浮點數
        float[] floatArray = new float[3];
        System.out.println(floatArray[0]);//0.0
        //字元
        char[] charArray = new char[3];
         System.out.println(charArray[0]);//空白字元
        //布林
        boolean[] boolArray = new boolean[3];
        System.out.println(boolArray[0]);//false
        //其他
        String[] strArray = new String[3];
        System.out.println(strArray[0]);//null
        
         String[] strArray2 = new String[3];
         strArray2[0] = "A";
         strArray2[1] = "B";
        
         for (String v : strArray2){
              switch(v){
                case "A":
                    System.out.println("Level 1");
                    break;
                 case "B":
                    System.out.println("Level 2");   
                    break;
                 default:
                     System.out.println("Error");
                     break;
            }
        
         }
       
       
    }
    
}

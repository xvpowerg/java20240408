/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240415;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array1 = new int[4][2];
       array1[0][1] = 17;
       array1[1][0] = 8;
       array1[2][0] = 9;
       array1[2][1] = 15;
       
        /*for(int [] a1 : array1){
            for (int v : a1){
                System.out.print(v+" ");
            }
             System.out.println();
        }*/
       
       for(int i=0;i<array1[i].length;i++){
     for(int k=0;k<array1[k].length;k++){
           System.out.print(array1[i][k]+" ");
 }
       System.out.println();
 }
      /*for (int i = 0; i < 4; i++){
          for (int k = 0; k< 2; k++){
             System.out.print(array1[i][k]+" ");
          }
          System.out.println();
      }*/
      
      /*for (int k = 0; k < 2;k++){
          for (int i = 0; i < 4; i++){
            System.out.print(array1[i][k]+" ");
          }
          System.out.println();
      }*/
     /* for (int i = 0; i <array1.length ;i++){
          for (int k = 0;k < array1[k].length ; k++){
              System.out.print(array1[i][k]+" ");
          }
              System.out.println();
      }*/
      
      /*for(int i=0;i<array1.length;i++){
           for(int k=0;k<array1[k].length;k++){
               System.out.print(array1[i][k]+"  ");
            }
            System.out.println();
        }*/
      
    
      
    }
    
    
    
    
   
}

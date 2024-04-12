/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240412;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //用while 寫9x9
        //1*2=2 1*3=3 1*4=4 ..... 1*9=9
        //2*2= 4
        int i = 1;
        int k = 2;
        while (i <= 9){
            k= 2;
            while(k <= 9){
                System.out.printf("%d*%d=%2d ",i,k,(i*k));
                k++;
            }
            System.out.println();
            i++;
        }
    }
    
}

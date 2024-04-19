/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240419;

/**
 *
 * @author xvpow
 */
public class Ch6_4 {
    //call by reference
     static  void swap(int[] array){
       int tmp = array[0];
       array[0] = array[1];
       array[1] = tmp;
    }
    public static void main(String[] args) {
       
       int[] array = {51,23};
       System.out.println(array[0]+":"+array[1]);
       swap(array);
       System.out.println(array[0]+":"+array[1]);
    }
    
}

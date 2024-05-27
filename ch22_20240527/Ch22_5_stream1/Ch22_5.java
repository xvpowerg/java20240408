/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240527.Ch22_5_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch22_5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(25);
        list.add(30);
        list.add(26);
        list.add(18);
        list.add(19);
        list.add(16);
        //30 26 18 16
        /*for (int v : list){
            if (v % 2 == 0){
                System.out.println(v);
            }
        }*/

        list.stream().filter(v->v%2 ==0 ).forEach(v->System.out.println(v));
          
    }
    
}

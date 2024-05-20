/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_2_list2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(25);
        list.add(14);
        int sum  = 0;
        for (int i = 0; i <list.size(); i++){
            sum += list.get(i);
        }
        System.out.println(sum);
        for(int v : list){
            System.out.println(v);
        }
    }
    
}

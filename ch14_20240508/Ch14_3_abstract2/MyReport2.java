/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240508.Ch14_3_abstract2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyReport2  extends ErpReport{
        protected void reportStyle(ArrayList<String> data){
               for (String v: data){
                   System.out.print(v+" ");
               }
        }
}

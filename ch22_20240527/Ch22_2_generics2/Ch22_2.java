/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240527.Ch22_2_generics2;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {
    static void testList1(ArrayList<Test1> list){
        list.add(new Test2());
        list.add(new Test3());
    }
    //只要泛型是Test1的子類 就可傳入參數
    //不可新增
    //可讀
    static void testList2(ArrayList<? extends Test1> list){
        for (Test1 t1 : list){
            System.out.println(t1);
        }
    }
    //只要泛型是Test4的父類 就可傳入參數
    //可新增Test4或子類
    //可讀類型必須是Object
   static void testList3(ArrayList<? super Test4> list){
       list.add(new Test4());
    for (Object v : list){
        System.out.println(v);
    }
       
   }
    
    public static void main(String[] args) {
       Test1 t1 = new Test2();
       Test1 t3 = new Test3();

      ArrayList<Test2> tList2 = new  ArrayList();
      //testList1(tList2);//出錯因為傳入變數泛型是Test2
      
       ArrayList<Test2> tList3 = new  ArrayList();
       tList3.add(new Test2());
       tList3.add(new Test2());
       
      ArrayList<Test3> tList4 = new  ArrayList();
        tList4.add(new Test3());
        tList4.add(new Test3());
         
        testList2(tList3);
        testList2(tList4);
        
      ArrayList<Test1> tList5 = new  ArrayList(); 
      tList5.add(new Test1());
      tList5.add(new Test1());
      ArrayList<Test4> tList6 = new  ArrayList();   
      tList6.add(new Test4());
      tList6.add(new Test4());
      testList3(tList5);
      testList3(tList6);
    
    }
    
}

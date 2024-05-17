/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240517.Ch18_1_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch18_1 {

    static void testCreateItem(String v,
            CreateItem c){
       Item i =  c.create(v);
       System.out.println(i);
    }
    public static void main(String[] args) {
        Item i1 = new Item("F1");
        System.out.println(i1);
        
       testCreateItem("F2",v->new Item(v)); 
      testCreateItem("F3",Item::new); 
    }
    
}

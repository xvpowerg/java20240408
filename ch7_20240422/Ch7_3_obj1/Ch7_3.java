/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240422.Ch7_3_obj1;

/**
 *
 * @author xvpow
 */
public class Ch7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        p1.height = 175;
        p1.name = "Lucy";
        p1.weight = 66;
        //System.out.println(p1.name+":"+p1.height+":"+p1.weight);
        
        Person p2 = new Person();
        p2.height = 150;
        p2.name = "Joy";
        p2.weight = 45;
        //System.out.println(p2.name+":"+p2.height+":"+p2.weight);
        //p2
        //h:150 n:Joy  w 45
        p1.printInfo();
        p2.printInfo();
        
        
    }
    
}

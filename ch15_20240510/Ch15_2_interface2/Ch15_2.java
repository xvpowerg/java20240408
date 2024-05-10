/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20240510.Ch15_2_interface2;

/**
 *
 * @author xvpow
 */
public class Ch15_2 {

    public static void prints(MyIterator st){
        st.foreach();
        System.out.println();
    }
    
    public static void test(int v){
        System.out.println(v);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Ken");
        st1.addBook("Java");
        st1.addBook("Python");
        st1.addBook("Golan");
        prints(st1);
        
        Person p1 = new Person("Iris");
        p1.addMovie("M1");
         p1.addMovie("M2");
          p1.addMovie("M3");
         prints(p1);    
        test(10);
    }
    
}

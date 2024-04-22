/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240422.Ch7_5_obj3;

/**
 *
 * @author xvpow
 */
public class Ch7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Ken";
        st1.age = 18;
        st1.score = 75;
        st1.printInfo();
        Student st2 = new Student("Vivin",25,82);
        st2.printInfo();
    }
    
}

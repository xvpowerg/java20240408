/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240426.Ch9_1_obj1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    
    
    static void prints(Animal ... an){
        for (Animal a: an){
            a.printinfo();
        }
    }
    public static void main(String[] args) {
        Animal a1 = new Animal("Kiki",5);
        a1.printinfo();
        a1.setAge(7);
        a1.printinfo();
        Dog dog1 = new Dog("Lulu",6);
        dog1.printinfo();
        System.out.println(dog1.getName()+":"+dog1.getAge());
        Cat cat1 = new Cat("Kitty",10);
        Mouse mouse1 = new Mouse("MicKey",8);
        cat1.printinfo();
        mouse1.printinfo();
        System.out.println("============================");
        prints(dog1,cat1,mouse1);
     
    }
    
}

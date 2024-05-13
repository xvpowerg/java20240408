/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20240513.Ch16_1_interface1;

public class PersonPrint implements Consumer {
    public void accept(String s){
        System.out.println("Person:"+s);
    }
}

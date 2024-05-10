/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20240510.Ch15_4_interface4;

/**
 *
 * @author xvpow
 */
public class StudentPrint implements Consumer {
    private String name;
      public StudentPrint(String name){
          this.name = name;
      }
       public StudentPrint(){
         
      }
    public void accept(String s){
        if (name != null){
            System.out.print(name+":");
        }
        System.out.println("Titile:"+s);
    }
}

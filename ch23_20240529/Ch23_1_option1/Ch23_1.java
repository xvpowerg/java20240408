/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240529.Ch23_1_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch23_1 {

    static boolean checkLength(Optional<String> nameOption){
        
        if (nameOption.isEmpty()){
            return false;
        }
       
        return nameOption.get().length() >= 2;
    }
    public static void main(String[] args) {
       Student st1 = new Student();
       st1.setName("Ken");
       boolean result = checkLength(st1.getName());
       System.out.println(result);
       Student st2 = new Student();
       boolean result2 = checkLength(st2.getName());
        System.out.println(result2);
    }
    
}

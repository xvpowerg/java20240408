/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240529.Ch23_1_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    public Student(){
    }
    public void setName(String name){
        this.name = name;
    }
    public Optional<String> getName(){
        Optional<String> nameOption = Optional.ofNullable(name);
        return nameOption;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20240527.Ch22_1_generics1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private  ArrayList<T> list = new ArrayList();
    public void add(T str){
        list.add(str);
    }
    public T get(int index){
        return list.get(index);
    }
    public void foreach(Consumer<T> com){
        list.forEach(com);
    }
}

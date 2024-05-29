/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240529.Ch23_6_stream4;
import java.util.ArrayList;
import java.util.stream.IntStream;
/**
 *
 * @author xvpow
 */
public class Item {
    private ArrayList<Integer> data = new ArrayList<>();
    public void add(int d){
        data.add(d);
    }
    public IntStream getStream(){
        return data.stream().mapToInt(v->v);
    }
}

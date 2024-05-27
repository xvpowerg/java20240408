/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240527.Ch22_6_stream2;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Ch22_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //不可修改
      //不可重複使用
      //惰性(不會立刻執行)跟終端(立刻會執行)
       Stream<String> stream =  Stream.of("Ken","Vivin");
       stream.forEach(v->System.out.println(v));
       //不可重複使用
       //stream.filter(v->v.length()>3).forEach(System.out::println);
       
       ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       //filter惰性(不會立刻執行)
       list.stream().filter(v->{
           System.out.println("filter"+v);
           return v.length()>3;
       });
       
       //forEach是終端(立刻會執行)
        list.stream().filter(v->{
           System.out.println("filter"+v);
           return v.length()>3;
       }).forEach(v->System.out.println(v));
        
       //filtere只顯示一個Vivin但是不影響原始的list
       //不可修改
        System.out.println(list);
    }
    
}

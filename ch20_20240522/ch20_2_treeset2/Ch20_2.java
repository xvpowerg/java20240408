/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240522.ch20_2_treeset2;
import java.util.TreeSet;
import java.util.Comparator;
public class Ch20_2 {
    
    private static class MyComp implements Comparator<Student>{
        public int compare(Student st1,Student st2){
            if (st1.getScore1() > st2.getScore1()){
                return 1;
            }else if (st1.getScore1() < st2.getScore1()){
                return -1;
            }else if(st1.getScore2() > st2.getScore2()){
                return 1;
            }else if(st1.getScore2() < st2.getScore2()){
                return -1;
            }
            return st1.getName().compareTo(st2.getName());
        }
    }
    public static void main(String[] args) {
      Student st1 = new Student("Ken",82,73);
      Student st2 = new Student("Vivin",61,84);
      Student st3 = new Student("Lucy",91,38);
      Student st4 = new Student("Ben",82,89);
      Student st5 = new Student("Iris",82,73);
      Student st6 = new Student("Lindy",82,95);
      TreeSet<Student> set = new TreeSet(new MyComp());
      set.add(st1);
      set.add(st2);
      set.add(st3);
      set.add(st4);
      set.add(st5);
      set.add(st6);
      System.out.println(set);
    }
    
}

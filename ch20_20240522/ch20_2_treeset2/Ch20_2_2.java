/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240522.ch20_2_treeset2;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch20_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student("Ken",82,73);
      Student st2 = new Student("Vivin",61,84);
      Student st3 = new Student("Lucy",91,38);
      Student st4 = new Student("Ben",82,89);
      Student st5 = new Student("Iris",82,73);
      Student st6 = new Student("Lindy",82,95);
      TreeSet<Student> set = new TreeSet<>((cst1,cst2)->{
          int cmp = cst1.getScore1() - cst2.getScore1();
          if (cmp != 0){
              return cmp ;
          }
          cmp = cst1.getScore2() - cst2.getScore2();
          if (cmp != 0){
              return cmp ;
          }
          cmp = cst1.getName().compareTo(cst2.getName());
          return cmp ;
      
      });
      set.add(st1);
      set.add(st2);
      set.add(st3);
      set.add(st4);
      set.add(st5);
      set.add(st6);
      System.out.println(set);
    }
    
}

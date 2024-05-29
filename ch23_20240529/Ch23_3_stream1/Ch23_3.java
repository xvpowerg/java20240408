/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240529.Ch23_3_stream1;
import java.util.ArrayList;
import java.util.Optional;
public class Ch23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList <String> list = new ArrayList<>();   
         list.add("Joy");
         list.add("Ken");
         list.add("Lucy");
         list.add("Ken");
         
         long count =  list.stream().count();
         System.out.println(count);
         list.stream().distinct().forEach(v->System.out.println(v));
         System.out.println("=============limit==============");
         list.stream().limit(2).forEach(v->System.out.println(v));
         System.out.println("=============skip==============");
         list.stream().skip(2).forEach(v->System.out.println(v));
           System.out.println("=============filter==============");
         list.stream().filter(v->v.length() == 4).forEach(v->System.out.println(v));
          System.out.println("=============findFirst==============");//回傳第一筆資料
         Optional<String> option1 = 
                 list.stream().filter(v->v.length() == 4).findFirst();
         option1.ifPresent(v->System.out.println(v));
         System.out.println("=============findFirst findAny ==============");
         Optional<String> option2 =  list.stream().findFirst();
         Optional<String> option3 = list.stream().findAny();
         System.out.println(option2.get());
         System.out.println(option3.get());
         System.out.println("=============findFirst findAny2 ==============");
         //parallel不要使用 findFirst 會影響效能
         Optional<String> option4 =  list.stream().parallel().findFirst();
         Optional<String> option5 = list.stream().parallel().findAny();
         System.out.println(option4.get());
         System.out.println(option5.get());
    }
    
}

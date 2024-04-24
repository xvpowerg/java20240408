/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240424.Ch8_1_obj1;

/**
 *
 * @author xvpow
 */
public class Test {
    private String name;
//private將age屬性作限制.只能在同一類別內讀寫
/*int age;*/

private int age;
float height;
//public class下面宣告的這些函式.意義為設定屬性
Test(){}
Test(String name,int age ,float height){
   
   //this.意思是當前物件"的" 
   //this()為呼叫建構式
    /*name = name;
    age = age;
    height = height;*/
    setAge(age);
    this.name = name;
    //this.age = age;
    
    this.height = height;
}
public void setAge(int age){
   
   if(age>=0){
       this.age = age;
   } else{
       System.out.println("錯誤的年齡");
   }
    
}
//領錢
//讀取age這個類別要輸入 public int getAge(){}
public int getAge(){
    return age;
}
public void setName(String name){
    if(name.length()<1||
     name.length()>10||name==null ){
        System.out.println("錯誤的name");
        return;
    }
    
    this.name = name;
    
} 

public String getName(){
    return name;
}

void printInfo(){
     System.out.println(name+":"+getAge()+":"+height);
}


}

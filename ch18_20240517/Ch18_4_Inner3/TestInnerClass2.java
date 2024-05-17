/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20240517.Ch18_4_Inner3;

/**
 *
 * @author xvpow
 */
public class TestInnerClass2 {
    private String name;
    TestInnerClass2(String name){
        this.name = name;
    }
    
     class TestMyInner{
        int value1;
        TestMyInner(int value1){
            this.value1 = value1;
        }
        public String toString(){
            return name+":"+value1;
        }
    }
     
     public void testRun(){
         TestMyInner inner = new TestMyInner(250);
         System.out.println(inner);
     }
    
}

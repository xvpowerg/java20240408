/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20240517.Ch18_5_Inner4;

/**
 *
 * @author xvpow
 */
public class TestInnerClass3 {
    private int value = 10;
   private class MyDog extends Dog{
        public void bark(){
            System.out.println("汪汪");
        }
    }
    public void testRun(){
        Dog dog1 = new Dog();
        dog1.bark();
    }
    public void testRun2(){
        Dog dog2 = new MyDog();
        dog2.bark();
    }
    
    public void testRun3(){
        String msg = "Hello!";
        Dog dog3 = new Dog(){
            public void bark(){
                //不可修改區域變數
                //msg = "LLLL";
                //屬性可以修改
                 value = 20;
                 System.out.println("喵喵~"+msg+value);
            }
        };
        dog3.bark();
    }
}

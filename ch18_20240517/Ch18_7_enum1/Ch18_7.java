/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240517.Ch18_7_enum1;

/**
 *
 * @author xvpow
 */
public class Ch18_7 {
    
    public static void main(String[] args) {
        
        TestEnum.selectFruit(1);
        
        TestEnum.selectFruit(TestEnum.Fruit.西瓜);
        
        System.out.println(TestEnum.Fruit.西瓜.getClass());
        System.out.println(TestEnum.Fruit.西瓜.ordinal());
        System.out.println(TestEnum.Fruit.蘋果.ordinal());
        System.out.println(TestEnum.Fruit.奇異果.ordinal());
        System.out.println(TestEnum.Fruit.奇異果.name()); 
    }
    
}

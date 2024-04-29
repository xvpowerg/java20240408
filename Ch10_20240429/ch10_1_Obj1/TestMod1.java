/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ch10_20240429.ch10_1_Obj1;

/**
 *
 * @author xvpow
 */
public class TestMod1 {
    public String publiValue 
            = "TestMod1 Public";//可以垮Package
    protected String protectedValue //不可垮Package 但繼承時可垮Package
            = "TestMod1 protectedValue";
    String defaultValue = "TestMod1 default";//不可垮Package
    private String privateValue = "TestMod1 privateValue";//不可跨Class
    
}

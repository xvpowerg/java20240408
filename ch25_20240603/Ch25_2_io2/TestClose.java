/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch25_20240603.Ch25_2_io2;

/**
 *
 * @author xvpow
 */
public class TestClose implements AutoCloseable {
    private String name;
    private boolean thEx;
    TestClose(String name,boolean thEx){
        this.name = name;
        this.thEx = thEx;
    }
    TestClose(String name){
        this(name,false);
    }
    public String toString(){
        return name;
    }
    
    public void close()throws Exception{
        System.out.println("close:"+this);
        if (thEx){
            throw new Exception("name:"+name);
        }
    }
    
}

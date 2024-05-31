/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240531.ch24_12_io6;

/**
 *
 * @author xvpow
 */
public class TestClose implements AutoCloseable {
    private String name;
    TestClose(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    
    public void close()throws Exception{
        System.out.println("close:"+this);
    }
    
}

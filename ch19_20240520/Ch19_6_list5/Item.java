/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20240520.Ch19_6_list5;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        
        return this.name +":" + this.price;
    }
    
    public boolean equals(Object obj){
        Item tmpObj = (Item)obj;
        return this.price == tmpObj.price &&
                this.name.equals(tmpObj.name);
    }
}

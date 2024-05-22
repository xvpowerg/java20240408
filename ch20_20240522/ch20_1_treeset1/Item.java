/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20240522.ch20_1_treeset1;

/**
 *
 * @author xvpow
 */
public class Item implements Comparable<Item>{
    private String name;
    private int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return name+":"+price;
    }
    //目前的物件大於傳入的回傳正數
    //目前的物件小於傳入的回傳負數
    //目前的物件等於傳入的回傳0
    public int compareTo(Item it){
        if (this.price > it.price){
            return 1;
        }else if(this.price < it.price){
            return -1;
        }
        return 0;
    }
}

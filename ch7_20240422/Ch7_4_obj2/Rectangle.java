/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240422.Ch7_4_obj2;

/**
 *
 * @author xvpow
 */
public class Rectangle {
     int width;
     int height;
     int area(){
         int ans = width * height;
         return ans;
     }
     void printInfo(){
         System.out.println("Rectangle Area:"+" w:"+width+
                            " h:"+height+" area:"+area());
     }
}

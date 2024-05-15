/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_4_lambda4;

/**
 *
 * @author xvpow
 */
public class Ch17_4 {

    static void testFunc4(int x1,int x2,TestLambda4 lamb){
        float f1 = lamb.func4(x1, x2);
        System.out.println("testFunc4:"+f1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        testFunc4(5,2,(int y1,int y2)->{
        float result = y1 / (float)y2;
        return result;
    });
        
        testFunc4(9,2,(y1,y2)->y1/(float)y2);
        
        
    }
    
}

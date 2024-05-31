/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_7_io1;
import java.io.File;
/**
 *
 * @author xvpow
 */
public class Ch24_7 {
    public static void main(String[] args) {
       File f1 = new File("C:\\mydir\\msg.txt");
       System.out.println(f1.exists());
       System.out.println(f1.isFile());
       System.out.println(f1.isDirectory());
    }
    
}

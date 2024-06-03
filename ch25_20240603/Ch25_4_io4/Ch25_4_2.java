/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_4_io4;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch25_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\st.obj");
        try(FileInputStream fin = new FileInputStream(file);
             ObjectInputStream objIn = new ObjectInputStream(fin)   ){
           Student st = (Student)  objIn.readObject();
           System.out.println(st);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}

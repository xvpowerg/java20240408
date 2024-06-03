/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_3_io3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch25_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        String msg = "Ken!!";
        //序列化
        File file = new File("c:\\mydir\\msg.obj");
        try(FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream obj = new ObjectOutputStream(fout);    ){
            obj.writeObject(msg);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}

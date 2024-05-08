/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240508.Ch14_3_abstract2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public abstract class ErpReport {
    
    protected abstract void reportStyle(ArrayList<String> data);
    
    public void exportReport(){
        ArrayList<String> data = new ArrayList();
        data.add("Ken");
        data.add("Vivin");
        data.add("Lucy");
        
        reportStyle(data);
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240508.Ch14_3_abstract2;

/**
 *
 * @author xvpow
 */
public class Ch14_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int action = 1;
         ErpReport myReport = null;
        switch(action){
            case 1:
                myReport = new MyReport();
                break;
            case 2:
                 myReport = new MyReport2();
                break;
            default:
                throw new RuntimeException(" 錯誤的選項");
        }
      
       myReport.exportReport();
    }
    
}

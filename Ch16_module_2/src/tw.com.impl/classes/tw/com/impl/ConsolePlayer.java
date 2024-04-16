package tw.com.impl;
import tw.com.api.Player;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xvpow
 */
public class ConsolePlayer  implements Player{
    public void play(String  video){
        System.out.println("正在播放:"+video);
    }
}

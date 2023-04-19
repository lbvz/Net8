/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 範例_01;

import java.util.Scanner;



/**
 *
 * @author user
 */
public class 工具 {

    private static Scanner sc = new Scanner (System.in);
    
    
    
    

    public static int 輸入成績() {
        System.out.println("請輸入成績 : ");
        int x;
        x = sc.nextInt();
        return x;

    }

    public static void 跑() {
        //輸入成績();
        成績_1("請輸入英文成績:");
        成績_2("請輸入數學成績:");
        加總(x,y);
        

    }
    public static int 成績_1(String 請輸入螢幕上要顯示的訊息文字){
        System.out.println(請輸入螢幕上要顯示的訊息文字);
        int x;
        x = sc.nextInt();
        System.out.println("英文成績 : " + x + " 分 ");
        return x;
        
    }
    public static int 成績_2(String 請輸入螢幕上要顯示的訊息文字){
        System.out.println(請輸入螢幕上要顯示的訊息文字);
        int y;
        y = sc.nextInt();
        System.out.println("數學成績 : " + y + " 分 ");
        return y;
    
    }
    public static int 加總(int x,int y){
        int z;
        z = x + y;
        return z;
        
    }
}

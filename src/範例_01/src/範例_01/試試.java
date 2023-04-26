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
public class 試試 {

    private static Scanner sc = new Scanner (System.in);
    
     public static int 輸入成績() {
        System.out.println("請輸入成績 : ");
        int x = sc.nextInt();
        
        return x;
}

    public static int 輸入成績(String 請輸入訊息文字) {
        System.out.println("請輸入" + 請輸入訊息文字 + "成績");
        int x = sc.nextInt();
        
        System.out.println(請輸入訊息文字 + "成績 : " + x + " 分 ");
        System.out.println("-------------------------------------");
        return x;

    }

    public static int 加總(int 傳入整數1, int 傳入整數2, int 傳入整數3 ){
        int x = 傳入整數1 + 傳入整數2 + 傳入整數3;
        
        System.out.println("加總 : " + x + " 分");
        return x;

    }
    
    public static double 平均(int 傳入整數1, int 傳入整數2,int 傳入整數3){
        double x = (傳入整數1 + 傳入整數2 + 傳入整數3) / 3;
        
        System.out.println("平均 : " + x + " 分");
        return x;
        
   }
    
     public static void 跑() {
        //輸入成績();
        int x = 輸入成績("英文");
        int y = 輸入成績("數學");
        int z = 輸入成績("國文");
        int a = 加總(x,y,z);
        double b = 平均(x, y, z);
        
      }
     
     }





/**
 *
 * @author user
 */

    
    
    
   

   
   
 
    
       
    


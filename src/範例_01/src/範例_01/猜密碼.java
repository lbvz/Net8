/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 範例_01;

/**
 *
 * @author user
 */
public class 猜密碼 {
    public static int 密碼;
    public static int 你猜;
    
   public static void 初值(){
       密碼 = 3;
       你猜 = (int)(Math.random()*4);
       System.out.println("==============初值==============");
       
       
   }
   public static void 你猜(){
       
       System.out.println("==============你猜==============");
       System.out.println("密碼 ==> 0 ~ 3");
       System.out.println("你猜的答案 : " + 你猜);
       System.out.println("密碼答案 : " + 密碼);
   }
    public static void 顯示結果(){
        if (密碼 == 你猜){
            System.out.println("你答對了");
        }
        else {
            System.out.println("你答錯了");
        }
    }
    public static void 跑(){
        初值();你猜();顯示結果();
    }
}

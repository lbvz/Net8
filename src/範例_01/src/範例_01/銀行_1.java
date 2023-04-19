/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 範例_01;

/**
 *
 * @author USER
 */
public class 銀行_1 {
    public static String t= "王曉明";//帳戶名稱
    public static int x= 5000;//帳戶餘額
    
    
    public static void 初值(){
        System.out.println("帳戶 : " + t);  
        System.out.println("餘額 : " + x +"元");
        //System.out.println("存款 : " + 存款+"元");
        //System.out.println("提款 : " + 提款+"元");
    }
    
    public static void 存提款(){
        int a= (int)(Math.random()*1001);//存款
        int b=(int)(Math.random()*1001);//提款
        int c=(int)(Math.random()*3);//存提
        
        System.out.println("============================");
        if(c>=1){
            System.out.println("存款 : " + a+"元");
            System.out.println("餘額 : " + (x + a)+"元");
        }
        else {
            System.out.println("提款 : " + b+"元");
            System.out.println("餘額 : " + (x-b)+"元");
        }
    }
    public static void 跑(){
        初值();存提款();
    }
}

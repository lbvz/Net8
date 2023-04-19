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
    public static String 帳戶名稱= "王曉明";
    public static int x= 5000;//帳戶餘額
    
    
    public static void 初值(){
      
        
        
        System.out.println("帳戶 : " + 帳戶名稱);  
        System.out.println("餘額 : " + x +"元");
        //System.out.println("存款 : " + 存款+"元");
        //System.out.println("提款 : " + 提款+"元");
    }
    
    public static void 存提款(){
        int a=0;//存款
        int b=0;//提款
        int c=0;//存提
        a= (int)(Math.random()*1001);
        b=(int)(Math.random()*1001);
           c=(int)(Math.random()*3);
        
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

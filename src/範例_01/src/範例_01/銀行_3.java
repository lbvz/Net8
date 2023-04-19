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
public class 銀行_3 {
    public static String 帳戶名稱= "王曉明";
    public static int 帳戶餘額= 5000;
    
    
    public static void 初值(){
      
        
        
        System.out.println("帳戶 : " + 帳戶名稱);  
        System.out.println("餘額 : " + 帳戶餘額 +"元");
        //System.out.println("存款 : " + 存款+"元");
        //System.out.println("提款 : " + 提款+"元");
    }
    
    public static void 存提款(){
        int 存款= (int)(Math.random()*1001);
        int 提款=(int)(Math.random()*1001);
           int 存提=(int)(Math.random()*3);
        
        System.out.println("============================");
        if(存提>=1){
            System.out.println("存款 : " + 存款+"元");
            System.out.println("餘額 : " + (帳戶餘額 + 存款)+"元");
        }
        else {
            System.out.println("提款 : " + 提款+"元");
            System.out.println("餘額 : " + (帳戶餘額-提款)+"元");
        }
    }
    public static void 跑(){
        初值();存提款();
    }
}

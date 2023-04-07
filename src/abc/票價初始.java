/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class 票價初始 {
  private static Scanner sc = new Scanner(System.in);
    public static int 全票 = 310;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    public static int 優待票 = 290;
    public static int 兒童票 = 260;
    public static int 早場票 = 280;
    public static int 愛心票 = 155;
    public static int 總金額;
    public static int 張數;
       
    
   public static int 輸入票種類(String 訊息) {
        System.out.println(訊息);
        System.out.println("全票請按1.優待票請按2.兒童票請按3.早場票請按4.愛心票請按5.");
        int x;
        x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("全票");  
             case 2:
                System.out.println("優待票"); 
             case 3:
                System.out.println("兒童票"); 
              case 4:
                System.out.println("早場票"); 
              case 5:
                System.out.println("愛心票"); 
                
            default:
                System.out.println("---請重新輸入---");
          }       
        return x;
   }
   //public static int 購買張數(){
       
   //}
   
   public static int 票價計算(int 票種類,int num) {
         
       
        switch(票種類){
            case 1:
               總金額 =全票 * num;
                
            case 2:
               總金額 =優待票 * num;
            case 3:
                總金額 =優待票 * num;
                
                System.out.println("早場票 :");
            
                System.out.println("愛心票 :");
            default:
                System.out.println("---請重新輸入---");
        }
        
        return 總金額;
                     
        
        
    }
    public static void 是否要繼續購買(String[] args) {
       /*switch(買跟不買){
            case 1:
               //繼續
                
            case 2:
               總金額 =優待票 * num;
                
                System.out.println("早場票 :");
            
                System.out.println("愛心票 :");
            default:
                System.out.println("---請重新輸入---");
        
*/
            
           
        }
        
    }
   


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
public class 測試工具 {
    
    public static void main(String[]args){
        測試輸入();測試加總();測試平均();
        
    }
    private static void 測試輸入(){
        System.out.println("第1次輸入成績  忽略 結果");
        工具.輸入成績();
       
        System.out.println("第2次輸入成績  接收 結果"); 
        int 結果;
        結果 = 工具.輸入成績();
        System.out.println("收到結果 : " + 結果);
        
        
        System.out.println("第3次輸入成績  傳值並接收結果");
         結果 = 工具.輸入成績v2("英文");
        System.out.println("收到結果 : " + 結果);
         
         
        System.out.println("第4次輸入成績  傳值並接收結果");
         結果 = 工具.輸入成績v2("數學");
        System.out.println("收到結果 : " + 結果);
         
     }
    
    private static void 測試加總(){
        System.out.println("第1次 測試加總 傳值並接收結果");
        int 結果;
        結果 = 工具.加總(100,60,60);
        System.out.println("收到結果 : " + 結果);
        
    }
    
    private static void 測試平均(){
        System.out.println("第1次 測試平均 傳值並接收結果");
        double 結果;
        結果 = 工具.平均(99,99,99);
        System.out.println("收到結果 : " + 結果);
        
    }
    
 }

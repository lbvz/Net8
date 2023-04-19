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
public class 範例_04 {
    public static String 名字;
    public static int 數學成績;
    public static int 英文成績;
    public static double 總分;
    public static double 平均;
    
  public static void 設定初值(){
      名字="未命名";
      數學成績=0;
      英文成績=0;
      總分=0;
      平均=0;
      
      System.out.println("設定初值");
     
  }
    public static void 計算總分(){
      
      
      總分=數學成績+英文成績;
      平均 = 總分/2;
        System.out.println("計算總分平均"); 
  }
  public static void 顯示資料(){
      System.out.println("顯示資料");
      System.out.println("名字:"+名字);
      System.out.println("數學成績:"+數學成績);
      System.out.println("英文成績:"+英文成績);
      System.out.println("總分:"+總分);
      System.out.println("平均:"+平均);
  }
  public static void 修改資料(){
      System.out.println("修改資料");
      名字="Tom";
      數學成績=99;
      英文成績=88;
      
  }



          public static void 跑程式(){
      設定初值();顯示資料();修改資料();計算總分();顯示資料();
      
      
  }


}


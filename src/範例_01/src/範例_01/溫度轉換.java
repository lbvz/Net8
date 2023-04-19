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
public class 溫度轉換 {

    public static double 攝氏;
    public static double 華氏;

    public static void 設定資料() {
        System.out.println("---設定資料---");
        攝氏 = 26;
        華氏 = 攝氏 * 9 / 5 + 32;

    }

    public static void 顯示資料() {
        System.out.println("---顯示資料---");
        System.out.println("攝氏:" + 攝氏 + "度");
        System.out.println("轉換華氏:" + 華氏 + "度");
    }

    public static void 跑程式() {
        設定資料();
        顯示資料();
    }
}

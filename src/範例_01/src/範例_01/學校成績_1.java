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
public class 學校成績_1 {
    public static double a;//英文亂數
    public static double b;//數學亂數
    public static int eng;//英文成績
    public static int mr;//數學成績
    public static int x;//總分
    public static double y;//平均

    public static void 設初值() {
        System.out.println("----設初值----");
        a = (Math.random());
        b = (Math.random());
    }

    public static void 計算() {
        eng = (int) (a * 101.0);
        mr = (int) (b * 101.0);
        x = eng + mr;
        y = x / 2.0;
        System.out.println("===========執行============");
    }

    public static void 顯示() {
        System.out.println("英文亂數: " + a);
        System.out.println("數學亂數: " + b);
        System.out.println("英文成績 :" + eng + "分");
        System.out.println("數學成績 :" + mr + "分");
        System.out.println("總分 :" + x + "分");
        System.out.println("平均 :" + y + "分");
    }

    public static void 評價() {
        if (y >= 90) {
            System.out.println("平均 >= 90分 太棒");
        } else if (y >= 80) {
            System.out.println("平均 >= 80分 棒");
        } else if (y >= 70) {
            System.out.println("平均 >= 70分 好");
        } else if (y >= 60) {
            System.out.println("平均 >= 60分 加油");
        } else {
            System.out.println("平均 < 60分 加加油");
        }
    }

    public static void 跑程式() {
        設初值();
        顯示();
        計算();
        顯示();
        評價();

    }
}

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
public class BMI {
    public static double cm;
    public static double m;
    public static double kg;
    public static double bmi;

    public static void 設定初值() {
        System.out.println("-----設定初值-----");
        cm = 175.0;
        m = cm / 100;
        kg = 65;
        bmi = kg / (m * m);
    }

    public static void 顯示資料() {
        System.out.println("========顯示資料========");
        System.out.println("身高:" + cm);
        System.out.println("體重:" + kg);
        System.out.println("BMI:" + bmi);
    }

    public static void 跑程式() {
        設定初值();
        顯示資料();

    }

}

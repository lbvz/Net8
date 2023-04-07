/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class 帳戶測試 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       帳戶 a = new 帳戶("Tom",2000);
       帳戶 b = new 帳戶("Jane",5000);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
    
}

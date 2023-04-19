/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class 銀行設定 {
    public String 名稱;
    public ArrayList <客戶範本> 客戶們;

    /**
     * @param args the command line arguments
     */

    public 銀行設定() {
        this.客戶們 = new ArrayList();
        System.out.println("銀行建構");
    }
    public void 加入客戶 (客戶範本 x){
      this.客戶們.add(x);
        System.out.println("加入客戶 " + x.name);
       
     
     
        
    }
    public void 顯示資料(){
        System.out.println("===" + this.名稱 +"顯示資料===" );
        for (客戶範本 x : this.客戶們) {
            x.show();

                    }
   
    }      
       String 客戶 {
    

    客戶範本 x1;
    
    銀行設定 c1;
    
    x1 = new 客戶範本();
    x1.name = "TOM";
    x1.餘額 = 1000;
    
    c1 = new 銀行設定();
    c1.名稱 = "台北銀行";
    c1.加入帳戶(x1);
    c1.顯示資料();
    
    
    
    
    
}    
}


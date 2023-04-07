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
public class 帳戶 {
    private String 名稱;
    private int 餘額;

    public 帳戶(String 名稱 , int 餘額){
      this.名稱 = 名稱;
      this.餘額 = 餘額;
    }

    @Override
    public String toString() {
        return "帳戶名稱 : " + 名稱 + "  "+"餘額 : " + 餘額;
        
    }
   
      
}
    
    
    
  

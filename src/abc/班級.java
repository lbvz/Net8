/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;
import java.util.ArrayList;

       
/**
 *
 * @author user
 */
public class 班級 {
    public String 名稱;
    private ArrayList<學生> 學生們;

    public 班級(String 名稱, ArrayList<學生> 學生們) {
        this.名稱 = 名稱;
        this.學生們 = 學生們;
        System.out.println("班級_建構完成");
      //建構子  
    }
    public void 加入學生(學生 x){
        this.學生們.add(x);
        
    }
            
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

import java.util.ArrayList;

/**
 *
 * @author dilae
 */
public class DefenceObservable {
    private int operation;
    
    private ArrayList <SuperDefence>defenceList= new ArrayList<>();
    
    public void addSuperDefence(SuperDefence superDefence){
        defenceList.add(superDefence);
    }
    
    public void setOperation(int operation){
        
        if(this.operation!=operation){
            this.operation=operation;
            notifyObject();
            
        }
    }
    public void notifyObject(){
        for(SuperDefence ob : defenceList){
            ob.update(operation);
            System.out.println(operation);
        }
    }
            
  
    
}

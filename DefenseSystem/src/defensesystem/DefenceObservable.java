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
    Maincontroller maincontroller;
    
    private ArrayList <SuperDefence>defenceList= new ArrayList<>();
    
    public void addSuperDefence(Maincontroller maincontroller ,SuperDefence superDefence){
        defenceList.add(superDefence);
        
       // this.maincontroller=maincontroller;
        superDefence.addMainController(maincontroller);
        
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
            
        }
    }
    
   public void sendMessageFromMain(String typeMessage){
        for(SuperDefence ob : defenceList){
            if(ob.isVisible() == true)ob.mainMessageJTextArea(typeMessage);
            
        }
   }
   
   public void sendMsgToMain(String message){
       System.out.println("");
   }
   
   public void areaStatus(boolean areaStatus){
   String newAreaStatus=(areaStatus)?"Area Not Cleared":"Area Cleard";
       for(SuperDefence ob: defenceList){
       ob.newAreaStatus(newAreaStatus);
       }
   
   }
   
   public void sendMessageFromMain(String typeMessage,Helicopter helicopter){
       for(SuperDefence ob : defenceList){
          if(ob.equals(helicopter)&ob.isVisible() == true)ob.mainMessageJTextArea(typeMessage);
            
        }
   }
   
   public void sendMessageFromMain(String typeMessage,Tank helicopter){
       for(SuperDefence ob : defenceList){
          if(ob instanceof Tank)ob.mainMessageJTextArea(typeMessage);
            
        }
   }
   
   public void sendMessageFromMain(String typeMessage,SubMarine helicopter){
       for(SuperDefence ob : defenceList){
           
          if(ob instanceof SubMarine)ob.mainMessageJTextArea(typeMessage);
            
        }
   }
  
    
}

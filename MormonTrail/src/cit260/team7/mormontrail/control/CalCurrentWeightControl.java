/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

/**
 *
 * @author Shaw-Laptop
 */
import cit260.team7.mormontrail.model.InventoryItem;

        
public class CalCurrentWeightControl {
    public static double calCurrentWeight( double wagonSize){
        //currentWeight = invItemWeight + invItemWeight - wagonSize;
        double currentWeight = 0;
        
       
//        invItemWeight = 0;
//       
//        //will be replaced by inventory list
//       double invArray[]={10,10,10,10};
//         
 
//    
//     int i = 0;
//     
//       for(i = 0; i < invCount;i++){
//          invItemWeight = invItemWeight + invArray[i];           
//     }

InventoryControl.setInventory();

InventoryItem[] inventoryArray = InventoryControl.getInventory();
 int invCount = inventoryArray.length;      

      double invItemWeight = 0;
      for (int i= 0; i < invCount; i++){
      double w = inventoryArray[i].getItemWeight();
      double a = inventoryArray[i].getAmount();
      double wa = w * a;
      invItemWeight= invItemWeight + wa;
      }
      
        if(invItemWeight < 0 || invItemWeight > wagonSize){
            currentWeight = -1;
        return currentWeight;
        }
        else{
       currentWeight = invItemWeight;
        return currentWeight;
        }

//        return currentWeight;
        }
    
       
    }


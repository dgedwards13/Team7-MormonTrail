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


        
public class CalCurrentWeightControl {
    public static double calCurrentWeight(double invItemWeight, double wagonSize){
        //currentWeight = invItemWeight + invItemWeight - wagonSize;
        double currentWeight = 0;
        
       
        invItemWeight = 0;
       
        //will be replaced by inventory list
       double invArray[]={10,10,10,10};
         
     int invCount = invArray.length;
    
     int i = 0;
     
       for(i = 0; i < invCount;i++){
          invItemWeight = invItemWeight + invArray[i];           
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


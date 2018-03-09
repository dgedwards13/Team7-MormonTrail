/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Shaw-Laptop
 */
public class RiverCrossingView extends View {
    
    public RiverCrossingView(){
          super( "\n"
            +"\n------------------------------------------"
            +"\n------------------------------------------"         
            +"\n You have made it to the riverName."     
            +"\n The river currently has a depth of depth feet."
            +"\n You now have a choice before; risk crossing the river now,"     
            +"\n waiting a day, or leave some of your supplies on the side of the river"  
            +"\n to reduce the changes of your wagon sinking."      
            +"\n------------------------------------------"
            +"\n1 | Cross River"
            +"\n2 | Go back and think about it"
            +"\n3 | Drop Supplies"
       
            +"\n------------------------------------------", 3, true);
    }
    

@Override    
     public boolean doAction(String inputs) {
        
        switch(inputs) {
            case "1":
                System.out.println("Cross river");
                CrossRiverView crossRiverView = new CrossRiverView();
                crossRiverView.display();
                break;
            case "2":
                System.out.println("Go back and think about it");
//                DailyTrailStopSceneView dailyTrailStopSceneView = new DailyTrailStopSceneView();
//                dailyTrailStopSceneView.display();
                break;
            case "3":
                System.out.println("Drop Supplies");
                DropSuppliesView dropSuppliesView = new DropSuppliesView();
                dropSuppliesView.display();
                break;

        }
           
        return true;
}
    
}
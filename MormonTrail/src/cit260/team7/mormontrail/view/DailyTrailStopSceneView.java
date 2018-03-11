
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.LocationControl;
/**
 *
 * @author rherrerajr
 */
public class DailyTrailStopSceneView extends View {
//    DailyTrailStopSceneView dailyTrailStop = new DailyTrailStopSceneView();
//    dailyTrailStop.display();
    
    public DailyTrailStopSceneView(){
        super( "\n"
            +"\n================================================================================"
            +"\n==                           Daily Trail Stop                                 =="
            +"\n================================================================================"
            +"\n\n1 | Visit nearby " + LocationControl.nearby()
            +"\n2 | Rest for the day"
            +"\n3 | Go hunting"
            +"\n4 | Look for edible plants"
            +"\n5 | Exit", 5, true);
    }
    
  @Override
    public boolean doAction(String inputs) {
        
        switch(inputs) {
            case "1":
                System.out.println("Visit the " + LocationControl.nearby());
                System.out.println("Welcome to " + LocationControl.nearby());
                DailyTrailStopSceneView dailyTrailStop = new DailyTrailStopSceneView();
                dailyTrailStop.display();
                break;
            case "2":
                System.out.println("Rest for the Day");
                System.out.println("Resting for the day restores the parties health.");
                DailyRestView dailyRestView = new DailyRestView();
                dailyRestView.display();
                break; 
            case "3":
                System.out.println("Go Hunting");
                System.out.println("Hunt for meat to feed your party.");
                HuntingView huntingView = new HuntingView();
                huntingView.display();
                break;     
            case "4":
                System.out.println("Look for Edible Plants");
                System.out.println("Find edible plants to feed your party.");
                dailyTrailStop = new DailyTrailStopSceneView();
                dailyTrailStop.display();
                break;     
            case "5":
//                return true;
        }
           
        return true; //return false;
    }
  
}
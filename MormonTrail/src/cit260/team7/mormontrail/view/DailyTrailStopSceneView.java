/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;
import cit260.team7.mormontrail.control.GameControl;
import cit260.team7.mormontrail.control.LocationControl;
/**
 *
 * @author rherrerajr
 */
public class DailyTrailStopSceneView {
    
    public DailyTrailStopSceneView(){
         boolean endOfView = false;
          do{
              String[] inputs = this.getInputs();
                      if (inputs == null || inputs.length < 1){
                          return;
                      }
                      endOfView = doAction(inputs);
          }
          while (endOfView != true);
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Daily Trail Stop");
            String nearby = LocationControl.nearby();
            if (nearby.equals("town")) {
                System.out.println("1 | Visit town");
            } else if (nearby.equals("fort")){
                System.out.println("1 | Visit Fort");
            } else if (nearby.equals("river")){
                System.out.println("1 | Visit River");
            }
            System.out.println("2 | Rest for the Day");
            System.out.println("3 | Go Hunting");
            System.out.println("4 | Look for Edible Plants");
            System.out.println("5 | Exit Build");
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3") || in.equalsIgnoreCase("4") || in.equalsIgnoreCase("5");
                    
            if(v != true) {
                System.out.println("The number entered must correlate with the menu items.");
                continue;
            }
            
            inputs[0] = in;
            
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        switch(inputs[0]) {
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
                dailyTrailStop = new DailyTrailStopSceneView();
                dailyTrailStop.display();
                break;     
            case "4":
                System.out.println("Look for Edible Plants");
                System.out.println("Find edible plants to feed your party.");
                dailyTrailStop = new DailyTrailStopSceneView();
                dailyTrailStop.display();
                break;     
            case "5":
                break;
        }
           
        return true;
    }
    
    public void display() {
        
    }
}

    

    


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
public class RiverCrossingView {
    
    public RiverCrossingView(){
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
        
        double depth = riverdepth();
        String riverName = "something radome";
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("=================================================================================");
            System.out.println("==                    You have made it to the " + riverName +" .              ==");
            System.out.println("==               The river currently has a depth of " + depth + " feet.        ==");
            System.out.println("==             You now have a choice before; risk crossing the river now,      ==");
            System.out.println("==     waiting a day, or leave some of your supplies on the side of the river  ==");
            System.out.println("==                    to reduce the changes of your wagon sinking.             ==");
            System.out.println("=================================================================================");
            
            System.out.println("1 | Cross River");
            System.out.println("2 | Go back and think about it");
            System.out.println("3 | Drop Supplies");
            
             
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3") || in.equalsIgnoreCase("4");
                    
            if(v != true) {
                System.out.println("The number entered must correlate with the menu items.");
                continue;
            }
            
            inputs[0] = in;
            
            valid = true;
        }
        return inputs;
    }
    
    public static double riverdepth(){
       
        double random = new Random().nextDouble();
        double result = 1 + (random *5);
        return (double) Math.round(result *10)/10; 
    }
    
     private boolean doAction(String[] inputs) {
        
        switch(inputs[0]) {
            case "1":
                System.out.println("Cross river");
                CrossRiverView crossRiverView = new CrossRiverView();
                crossRiverView.display();
                break;
            case "2":
                System.out.println("Go back and think about it");
                DailyTrailStopSceneView dailyTrailStopSceneView = new DailyTrailStopSceneView();
                dailyTrailStopSceneView.display();
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
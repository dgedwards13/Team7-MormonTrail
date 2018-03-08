/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;
import cit260.team7.mormontrail.control.LocationControl;

/**
 *
 * @author dgedw
 * @author Savannah
 */
public class FortTownSceneView {
    public FortTownSceneView(){
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
            
            System.out.println("================================================================================");
            System.out.println("==                                                                            ==");
            String fortTown = LocationControl.fortTown();
            if (fortTown.equals("town")){
            System.out.println("==                            Welcome to Sometown!                            ==");
            } else if (fortTown.equals("fort")){
                System.out.println("==                            Welcome to Somefort!                    ==");
            }
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            if (fortTown.equals("town")){
                System.out.println("1 | Visit the Hotel");
                System.out.println("2 | Visit the General Store");
                System.out.println("3 | Return to the Trail");
                System.out.println("4 | Back to GamePlayView");
                
                String in = keyboard.nextLine();
                in = in.trim();

                if(in.length() < 1){
                    System.out.println("You must enter a non-blank value");
                    continue;
                }           
                boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3") || in.equalsIgnoreCase("4");

                if(v != true) {
                    System.out.println("The number entered must correlate with the available options.");
                    continue;
                }  
                inputs[0] = in;
                valid = true; 
                
                
                
            } else if (fortTown.equals("fort")){
                System.out.println("1 | Visit the General Store");
                System.out.println("2 | Return to the Trail");
                System.out.println("3 | Back to GamePlayView");
                
                String in = keyboard.nextLine();
                in = in.trim();

                if(in.length() < 1){
                    System.out.println("You must enter a non-blank value");
                    continue;
                }           
                boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3");

                if(v != true) {
                    System.out.println("The number entered must correlate with the available options.");
                    continue;
                }  
                inputs[0] = in;
                valid = true; 
            }
            


//            String in = keyboard.nextLine();
//            in = in.trim();
//            
//            if(in.length() < 1){
//                System.out.println("You must enter a non-blank value");
//                continue;
//            }
//            
//
//            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3");
//            
//            if(v != true) {
//                System.out.println("The number entered must correlate with the available options.");
//                continue;
//            }
//            
//            inputs[0] = in;
//            valid = true;
          }
        return inputs;
    }


        private boolean doAction(String[] inputs) {
            String fortTown = LocationControl.fortTown();
            if (fortTown.equals("town")){
               switch(inputs[0]) {
                case "1":
                    HotelSceneView hotelSceneView = new HotelSceneView();
                    hotelSceneView.display();
                    break;
                case "2":
                    GeneralStoreView generalstoreview = new GeneralStoreView();
                    generalstoreview.display();
                    break;
                case "3":
                    DailyTrailStopSceneView dailyTrailStopSceneView = new DailyTrailStopSceneView();
                    dailyTrailStopSceneView.display();
                    break;
                case "4":
                    GamePlayView gamePlayView = new GamePlayView();
                    gamePlayView.display();
                    break;
                 }
            } else if (fortTown.equals("fort")){
                switch(inputs[0]){
                    case "1":
                        GeneralStoreView generalstoreview = new GeneralStoreView();
                        generalstoreview.display();         
                        break;
                    case "2":
                        DailyTrailStopSceneView dailyTrailStopSceneView = new DailyTrailStopSceneView();
                        dailyTrailStopSceneView.display();  
                        break;
                    case "3":
                        GamePlayView gamePlayView = new GamePlayView();
                        gamePlayView.display();             
                        break;
                            
                }
            }
            return true;
        }
    public void display() {
        
    }
}
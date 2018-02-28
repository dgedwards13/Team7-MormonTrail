/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Shaw-Laptop
 */
public class PaceView {
    
    public PaceView(){
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
            
            System.out.println("How fast do you want to go?");
            System.out.println( "slow");
            System.out.println("medium");
            System.out.println("fast");
           
             
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("slow") || in.equalsIgnoreCase("medium") || in.equalsIgnoreCase("fast");
                    
            if(v != true) {
                System.out.println("Please enter slow, medium, or fast.");
                continue;
            }
            
            inputs[0] = in;
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        switch(inputs[0]) {
            case "slow":
                GameControl.setPace("slow");
                System.out.println("pace set to slow");
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "medium":
                GameControl.setPace("medium");
                System.out.println("pace set to medium");
                gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "fast":
                GameControl.setPace("fast");
                System.out.println("pace set to fast");
                gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
        }
           
        return true;
    }

    public void display() {
        
    }
}

        
        
 

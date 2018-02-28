/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;

/**
 *
 * @author dgedw
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
            System.out.println("==                            Welcome to Sometown!                            ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("1 | Back to GamePlayView");

            String in = keyboard.nextLine();
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1");
            if(v != true) {
                System.out.println("The number entered must correlate with the available options.");
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
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
        }
        return true;
    }
    
    public void display() {
        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;

/**
 *
 * @author Shaw-Laptop
 */
public class MainMenuView {
    
    public MainMenuView(){
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
            
            System.out.println("Main Menu");
            System.out.println("1. Start new game");
            System.out.println("2. Restart game");
            System.out.println("3. Help");
            System.out.println("4. Exit");
            
             
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            inputs[0] = in;
            
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        System.out.println("*** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
           
        return true;
    }

    public void display() {
        
    }
}

        
        
 

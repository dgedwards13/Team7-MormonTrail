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
public abstract class View implements ViewInterface {
    protected String displayMessage;
    protected int numInputs;
    
    public View(){
        
    }
    public View(String message, int number){
        this.displayMessage = message;
        this.numInputs = number;
    }
   
    
    @Override
     public void display(){
         
     boolean endOfView = false;
          do{
              String inputs = this.getInputs(numInputs);
                      if (inputs == null || inputs.length() < 1){
                          return;
                      }
                      endOfView = doAction(inputs);
          }
          while (endOfView != true);
     }
     
     @Override
      public String getInputs(int numInputs) {
        String inputs = "";
        boolean valid = false;
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println(displayMessage);
            String in = keyboard.nextLine();
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            int convert = Integer.parseInt(in);
            boolean v = convert > 0 && convert < numInputs + 1;
            if(v != true) {
                System.out.println("The number entered must correlate with the available options.");
                continue;
            }
            
            inputs = in;
            valid = true;
        }
        return inputs;
    }
     }

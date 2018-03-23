/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;
import cit260.team7.mormontrail.exception.ViewException;

/**
 *
 * @author Shaw-Laptop
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    protected int numInputs;
    protected boolean isMenu;
    
    public View(){
        
    }
    public View(String message, int number, boolean menu){
        this.displayMessage = message;
        this.numInputs = number;
        this.isMenu = menu;
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
            if (isMenu) {
                try{
                int convert = Integer.parseInt(in);
                boolean v = convert > 0 && convert < numInputs + 1;
                if(v != true) {
                    System.out.println("The number entered must correlate with the available options.");
                    continue;
                }
            }catch(NumberFormatException e){
                System.out.println("\nYou must enter a valid menu number");
                continue;
            }
            }
            
            inputs = in;
            valid = true;
        }
        return inputs;
    }
     }

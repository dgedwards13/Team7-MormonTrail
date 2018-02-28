/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
import cit260.team7.mormontrail.control.LocationControl;
import java.util.Scanner;

/**
 *
 * @author rherrerajr
 */
public class DailyRestView {
    
    public DailyRestView(){
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
            
            System.out.println("How many days of rest?");
            System.out.println("Enter between 1 and 9");

             
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("Enter a value of 1 through 9");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3") || in.equalsIgnoreCase("4") || in.equalsIgnoreCase("5") || in.equalsIgnoreCase("6") || in.equalsIgnoreCase("7") || in.equalsIgnoreCase("8") || in.equalsIgnoreCase("9");
                    
            if(v != true) {
                System.out.println("You must enter a valid number of resting days.");
                continue;
            }
            
            inputs[0] = in;
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        String number = inputs[0];
        int result = Integer.parseInt(number);
        System.out.println(result);
        
        GameControl.setDailyRest(result);
        System.out.println("Successful rest day");
        return true;      
    }

    public void display() {
        
    }
}
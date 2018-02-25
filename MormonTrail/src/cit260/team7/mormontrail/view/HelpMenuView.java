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
 * @author dgedw
 */
public class HelpMenuView {
    
    public HelpMenuView(){
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
            
            System.out.println("Help Menu");
            System.out.println("1 | Game Objective");
            System.out.println("2 | How to Move");
            System.out.println("3 | Tips");
            System.out.println("4 | Return to Previous Menu");
             
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

    private boolean doAction(String[] inputs) {
        
        switch(inputs[0]) {
            case "1":
                System.out.println("Objective");
                System.out.println("You are a Mormon pioneer and will begin your journey in Nauvoo, Illinois. Your destination is Salt Lake Valley.");
                System.out.println("Your party will use your resources to purchase supplies and tools for your adventure. Any remaining money can be used along the way.");
                System.out.println("Your survival depends on your skills, traits and decisions  as you face random events as well as obstacles. Success means reaching Salt Lake Valley.");
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "2":
                System.out.println("How to Move");
                System.out.println("Follow the on screen prompts and you will continue your journey to Zion.");
                helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "3":
                System.out.println("Tips");
                System.out.println("Tip 1");
                System.out.println("Tip 2");
                System.out.println("Tip 3");
                System.out.println("Tip 4");
                helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "4":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
        }
           
        return true;
    }
    
    public void display() {
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;
import java.util.Scanner;
import java.util.Arrays;
/**
 *z
 * @author Savannah
 */
public class StartProgramView {
    
    public StartProgramView() {
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
            
            System.out.println("Please enter your name:");
            String name = keyboard.nextLine();
            
            name = name.trim();
            
            if(name.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            System.out.println("Welcome, " + name + "!");
            System.out.println("");
            System.out.println("=========================================");
            System.out.println("Welcome to the Mormon Trail!");
            System.out.println("You are a Mormon pioneer and will begin your journey in Nauvoo, Illinois. Your destination is Salt Lake Valley.");
            System.out.println("Your party will use your resources to purchase supplies and tools for your adventure. Any remaining money can be used along the way.");
            System.out.println("Your survival depends on your skills, traits and decisions  as you face random events as well as obstacles. Success means reaching Salt Lake Valley.");
            System.out.println("Are you ready to try your luck on the Mormon Trail?!");
            System.out.println("=========================================");
            
            System.out.println("Choose One:");
            System.out.println("N | Start a New Game");
            System.out.println("R | Reload a Saved Game");
            
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("n") || in.equalsIgnoreCase("r");
            
            if(v != true) {
                System.out.println("The letter entered must correlate with the menu items.");
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
// displayStartProgramView() {
//  endOfView = false
//  DO
// inputs = getInputs()
// IF no inputs were entered OR the first input is Q
//  RETURN
// ENDIF
// endOfView = doAction(inputs)
// WHILE endOfView != true








//        displayStartProgramView(){
//        
//       
//        boolean endOfView = false;
//        do{//        doAction(String[] inputs){
//
//     
//            String[] input = this.getInput();
//           if (input == null || character.length < 1){
//            System.out.println("Error Message" + input + "is invalid");
//            } 
//        
//        
//        private boolean doAction(String[] input){
//            
//        }
//}
////endOfView = doAction(inputs)
//        while (endOfView != true){
//            
//        }
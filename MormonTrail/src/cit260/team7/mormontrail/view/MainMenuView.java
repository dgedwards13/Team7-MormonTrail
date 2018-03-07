/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
import cit260.team7.mormontrail.control.InventoryControl;
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
//    private final String MENU = "\n"
//            +"\n------------------------------------------"
//            +"\n| Main Menu                              |"
//            +"\n------------------------------------------"
//            +"\n1| Start game"
//            +"\n2| Help Menu"
//            +"\n3| Save Game"
//            +"\n4| Load Game"
//            +"\n5| Exit"
//            +"\n------------------------------------------";
    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Main Menu");
            System.out.println("1 | Start Game");
            System.out.println("2 | Help Menu");
            System.out.println("3 | Save Game");
            System.out.println("4 | Load Game");
            System.out.println("5 | Exit");
             
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3") || in.equalsIgnoreCase("4") || in.equalsIgnoreCase("5");
                    
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
                InventoryControl.setInventory();
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "2":
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "3":
                GameControl.saveGame();
                break;
            case "4":
                GameControl.loadGame();
                break;
            case "5":
                String in = "";
                boolean valid = false;
                while (valid == false) {
                    Scanner keyboard = new Scanner(System.in);
                    System.out.println("Are you sure you want to exit?");
                    in = keyboard.nextLine();
            
                    in = in.trim();
            
                    if(in.length() < 1){
                        System.out.println("You must enter a non-blank value");
                        continue;
                    }
                
                    boolean v = in.equalsIgnoreCase("y") || in.equalsIgnoreCase("n");
                    
                    if(v != true) {
                       System.out.println("You must enter 'Y' or 'N'");
                      continue;
                    }
                    
                    valid = true;
                }
                if(in.equalsIgnoreCase("y")) {
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                } else {
                    MainMenuView mainMenuView = new MainMenuView();
                    mainMenuView.display();
                }
                break;
                
        }
           
        return true;
    }

    public void display() {
        
    }
}

        
        
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.control.HotelControl;
import java.util.Scanner;

/**
 *
 * @author Shaw-Laptop
 */

public class MainMenuView extends View {
    
    public MainMenuView(){
        super( "\n"
            +"\n------------------------------------------"
            +"\n| Main Menu                              |"
            +"\n------------------------------------------"
            +"\n1| Start game"
            +"\n2| Help Menu"
            +"\n3| Save Game"
            +"\n4| Load Game"
            +"\n5| Exit"
            +"\n------------------------------------------", 5, true);
    }
   
@Override
    public boolean doAction(String inputs) {
        
        switch(inputs) {
            case "1":
                InventoryControl.setInventory();
                HotelControl.setCharacter();
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
                    System.out.println("Are you sure you want to exit? (y/n)");
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

    
}

        
        
 

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
public class CrossRiverView extends View{
    
    public CrossRiverView(){
         super( "\n"
            +"\n------------------------------------------"
            +"\n------------------------------------------"         
            +"\n You are Crossing the river."    
            +"\n------------------------------------------"
            +"\n1 | Return to Main Menu"
            +"\n------------------------------------------", 1, true);
    }
    
   @Override

    public boolean doAction(String inputs) {
        
        switch(inputs) {
            case "1":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
//            case "2":
//                HelpMenuView helpMenuView = new HelpMenuView();
//                helpMenuView.display();
//                break;
//            case "3":
//                GameControl.saveGame();
//                break;
//            case "4":
//                GameControl.loadGame();
//                break;
//            case "5":
//                String in = "";
//                boolean valid = false;
//                while (valid == false) {
//                    Scanner keyboard = new Scanner(System.in);
//                    System.out.println("Are you sure you want to exit?");
//                    in = keyboard.nextLine();
//            
//                    in = in.trim();
//            
//                    if(in.length() < 1){
//                        System.out.println("You must enter a non-blank value");
//                        continue;
//                    }
//                
//                    boolean v = in.equalsIgnoreCase("y") || in.equalsIgnoreCase("n");
//                    
//                    if(v != true) {
//                       System.out.println("You must enter 'Y' or 'N'");
//                      continue;
//                    }
//                    
//                    valid = true;
//                }
//                if(in.equalsIgnoreCase("y")) {
//                    System.out.println("Thank you for playing!");
//                    System.exit(0);
//                } else {
//                    CrossRiverView mainMenuView = new CrossRiverView();
//                    mainMenuView.display();
//                }
//                break;
                
        }
           
        return true;
    }

   
}

        
        
 

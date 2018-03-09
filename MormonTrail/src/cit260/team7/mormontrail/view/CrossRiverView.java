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
        }
           
        return true;
    }

   
}

        
        
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

/**
 *
 * @author Shaw-Laptop
 */
public class CrossRiverView extends View{
    
    public CrossRiverView(){
         super("\n================================================================================"
             + "\n==                         You Are Crossing The River                         =="
             + "\n================================================================================"
             + "\n\n1 | Return to Main Menu", 1, true);
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

        
        
 

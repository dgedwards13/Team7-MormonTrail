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
public class DropSuppliesView extends View{
    
    public DropSuppliesView(){
     super( "\n"
            +"\n------------------------------------------"
            +"\n------------------------------------------"         
            +"\n Are you sure you want to drop some of your supplies?"     
            +"\n If you do go to the Inventory list. "
            + "\n If you not want to drop your supplies Go back to the river crossing page."      
            +"\n------------------------------------------"
            +"\n | Inventory list"
            +"\n Go back"
       
            +"\n------------------------------------------", 2, true);
    }
    
   
@Override
    public boolean doAction(String inputs) {
        
        switch(inputs) {
            case "1":
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "2":
                RiverCrossingView riverCrossingView = new RiverCrossingView();
                riverCrossingView.display();
                break;
                
        }
           
        return true;
    }

    
}

        
        
 

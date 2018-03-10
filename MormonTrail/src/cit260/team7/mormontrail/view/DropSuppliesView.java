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
public class DropSuppliesView extends View{
    
    public DropSuppliesView(){
     super( "\n"
            + "\n================================================================================"
            + "\n==                            Drop Supplies                                   =="
            + "\n==                                                                            =="
            + "\n==         Are you sure you would like to drop some of your supplies?         =="
            + "\n== This action cannot be undone. If you would like to continue, press 1 to go =="
            + "\n==  to your inventory list. Otherwise, you may return to the previous menu.   =="
            + "\n================================================================================" 
            + "\n1 | Inventory list"
            + "\n2 | Return to River Crossing", 2, true);
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

        
        
 

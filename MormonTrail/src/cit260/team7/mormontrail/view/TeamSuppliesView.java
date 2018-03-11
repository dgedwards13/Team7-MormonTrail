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
public class TeamSuppliesView extends View {
    public TeamSuppliesView(){
     super( "\n"
            +"\n================================================================================"
            +"\n==                             Team Supplies                                  =="    
            +"\n================================================================================"
            + "\n1 | return to game play"
            , 1, true);
    }
    
    @Override
    public boolean doAction(String inputs){
        switch(inputs) {
            case "1":
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break; 
      
    }
      return true;
}
}

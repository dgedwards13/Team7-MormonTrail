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
public class PaceView extends View{
    
    public PaceView(){
      super( "\n"
            +"\n------------------------------------------"       
            +"\n How fast do you want to go?"      
            +"\n------------------------------------------"
            +"\n | Slow"
            +"\n | Medium"
            +"\n | Fast"
       
            +"\n------------------------------------------",3, false); 
    }
    

@Override
    public boolean doAction(String inputs) {
        
        switch(inputs) {
            case "slow":
                GameControl.setPace("slow");
                System.out.println("pace set to slow");
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "medium":
                GameControl.setPace("medium");
                System.out.println("pace set to medium");
                gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "fast":
                GameControl.setPace("fast");
                System.out.println("pace set to fast");
                gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
        }
           
        return true;
    }

   
}

        
        
 

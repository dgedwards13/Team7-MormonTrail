/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;
import cit260.team7.mormontrail.control.GameControl;
/**
 *z
 * @author Savannah
 */
public class StartProgramView extends View{
    public StartProgramView(String inputs) {
           super("\n"
                 + inputs + ", welcome to the Mormon Trail!"
                 + "\n================================================================================"
                 + "\n== You are a Mormon pioneer and will begin your journey in Nauvoo, Illinois.  =="
                 + "\n==  Your destination is Salt Lake Valley. Your party will use your resources  =="
                 + "\n== to purchase supplies and tools for your adventure. Any remaining money can =="
                 + "\n==  be used along the way. Your survival depends on your skills, traits and   =="
                 + "\n==  decisions as you face random events as well as obstacles. Success means   =="
                 + "\n==                         reaching Salt Lake Valley.                         =="
                 + "\n==                                                                            =="
                 + "\n==            Are you ready to try your luck on the Mormon Trail?!            =="
                 + "\n================================================================================"
                 + "\n\nChoose One:"
                 + "\n1 | Start a New Game"
                 + "\n2 | Reload a Saved Game",2, true
                   
           );
    }

@Override
    public boolean doAction(String inputs) {
        
        if(inputs.equalsIgnoreCase("1")) {
            GameControl.startNewGame();
            return true;
        }
        
        if(inputs.equalsIgnoreCase("2")) {
            GameControl.retrieveGame();
            return true;
        }
        
        return true;
    }
}
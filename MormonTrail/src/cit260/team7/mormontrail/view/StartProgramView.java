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
//name = name.trim();
    public StartProgramView() {
           super("\n"
                   +"\n========================================="
                   +"Welcome to the Mormon Trail!"
                   +"You are a Mormon pioneer and will begin your journey in Nauvoo, Illinois. Your destination is Salt Lake Valley."
                   +"Your party will use your resources to purchase supplies and tools for your adventure. Any remaining money can be used along the way."
                   +"Your survival depends on your skills, traits and decisions  as you face random events as well as obstacles. Success means reaching Salt Lake Valley."
                   +"Are you ready to try your luck on the Mormon Trail?!"
                   +"========================================="
                   +"Choose One:"
                   +"1 | Start a New Game"
                   +"2 | Reload a Saved Game",2, true
                   
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
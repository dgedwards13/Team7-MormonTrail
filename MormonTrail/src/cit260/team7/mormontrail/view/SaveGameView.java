/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.exception.GameControlException;

/**
 *
 * @author rherrerajr
 */
public class SaveGameView extends View{



//    game = get the currentGame in the main class
//    try
//    call the saveGame(game)control method
//    catch GameControlException
//    Print error passed with the exception
//    return false to repeat the view
//    endTry
//    Print a success message indicating where the
//    file was saved
//    return true to end the view

    @Override
    public boolean doAction(String inputs) {
    try{
        
    } catch (GameControlException e){
        this.console.println("\nUnable to save game");
        return false;
    }
    this.console.println("File was saved");
    return true;
    }    
    
}


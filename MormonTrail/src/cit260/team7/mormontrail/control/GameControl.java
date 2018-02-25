/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.Game;
import cit260.team7.mormontrail.view.MainMenuView;
/**
 *
 * @author Shaw-Laptop
 */
public class GameControl {
    // void will be changed to String
  public static void startNewGame(){  
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.display();
    
//    return
  }
  
  public static Game retrieveGame(){
    //find the game file
    //create a game object with data from the file
    //return game object
    
  Game game =new Game();
  return game;
}
}

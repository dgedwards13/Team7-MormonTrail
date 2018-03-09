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
    
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.display();
    
    Game game = new Game();
    return game;
  }
  
  public static void loadGame(){
      System.out.println("Game Loaded.");
      MainMenuView mainMenuView = new MainMenuView();
      mainMenuView.display();
  }

  public static void saveGame(){
      System.out.println("Game Saved.");    
      MainMenuView mainMenuView = new MainMenuView();
      mainMenuView.display();
  } 
  
  public static void setPace(String pace){
  
  }
  
  public static void setDailyRest(int rest){
      
  }
  
  public static String buildRestMenu(){
      return null;
  }
  public static int countRestMenu(){
      ;
      return 0;
      
  }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.exception.MapException;
import cit260.team7.mormontrail.model.Game;
import cit260.team7.mormontrail.model.Map;
import cit260.team7.mormontrail.view.MainMenuView;
//import cit260.team7.mormontrail.model.Character;
import cit260.team7.mormontrail.model.Hotel;
import mormontrail.MormonTrail;

/**
 *
 * @author Shaw-Laptop
 */
public class GameControl {

    // void will be changed to String
    public static void startNewGame(String name) throws MapException {
        //game
        Game game = new Game();
        MormonTrail.setGame(game);
        game.setDayOnTrail(0);
        game.setPace(2);
        game.setMilesTraveled(0);
        game.setPlayer(name);

        InventoryControl.setInventory();
        game.setInventoryArray(InventoryControl.getInventory());
        HotelControl.setCharacter();
        Hotel hotel = new Hotel();
        hotel.setAvailableCharaters(HotelControl.getCharacter());
        EventControl.setEvents();
        game.setEventArray(EventControl.getEvents());
        Map map = new Map();
        MapControl.setLocation();
        map.setLocations(MapControl.getLocations());

        //event
        //map
        //
//    Lesson 10 changes      
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

//    return
    }

    public static Game retrieveGame() {
        //find the game file
        //create a game object with data from the file
        //return game object

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        Game game = new Game();
        return game;
    }

    public static void loadGame() {
        System.out.println("Game Loaded.");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    public static void saveGame() {
        System.out.println("Game Saved.");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    public static void setPace(int pace) {

    }

    public static void setDailyRest(int rest) {

    }

    public static String buildRestMenu() {
        return null;
    }

    public static int countRestMenu() {
        ;
        return 0;

    }

    public static String playerData() {
        return "a";
    }

    private static String player;
}

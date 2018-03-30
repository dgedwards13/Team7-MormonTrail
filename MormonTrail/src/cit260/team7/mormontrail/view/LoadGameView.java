/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
import cit260.team7.mormontrail.exception.GameException;

/**
 *
 * @author Shaw-Laptop
 */
public class LoadGameView extends View {

    public LoadGameView() {
        super("\n"
                + "\n================================================================================"
                + "\n==                            Load Game                                       =="
                + "\n==                  What is the name of the save file?                        =="
                + "\n================================================================================",
                0, false);
    }

    @Override
    public boolean doAction(String inputs) {
        String filePath = inputs;
        try {
            GameControl.loadGame(inputs);
        } catch (GameException e) {
            this.console.println("\nUnable to load game" + "\n error code" + e.getMessage());
            return false;
        }
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;

    }
}

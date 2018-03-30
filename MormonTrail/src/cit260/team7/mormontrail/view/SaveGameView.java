/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
import cit260.team7.mormontrail.exception.GameException;
import cit260.team7.mormontrail.model.Game;
import mormontrail.MormonTrail;

/**
 *
 * @author rherrerajr
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("\n"
                + "\n================================================================================"
                + "\n==                             Save Game                                      =="
                + "\n==                  Where would you like to save this file?                   ==" 
                + "\n================================================================================"
                ,
                0, false);
    }

    @Override
    public boolean doAction(String inputs) {
        String filePath = inputs;
        Game game = MormonTrail.getGame();
        try {
            GameControl.saveGame(game, filePath);
        } catch (GameException e) {
            this.console.println("\nUnable to save game" + "\n error code" + e.getMessage());
            return false;
        }
        this.console.println("File was saved");
        return true;
    }

}

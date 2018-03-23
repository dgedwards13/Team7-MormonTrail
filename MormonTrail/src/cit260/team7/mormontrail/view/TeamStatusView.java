/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.CharacterControl;
import cit260.team7.mormontrail.control.HotelControl;

/**
 *
 * @author rherrerajr
 */
public class TeamStatusView extends View {

    public TeamStatusView() {

        super("\n"
                + "\n================================================================================"
                + "\n==                            Team Health Status                              =="
                + "\n================================================================================"
                + "\n" + HotelControl.characterHealth()
                + "\n1 | Return to game menu",
                1, true);

    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
        }
        return true;
    }
}

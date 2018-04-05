/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;

/**
 *
 * @author Shaw-Laptop
 */
public class PaceView extends View {

    public PaceView() {
        super("\n"
                + "\n================================================================================"
                + "\n==                            Set Team Pace                                   =="
                + "\n==                                                                            =="
                + "\n==                       How fast would you like to go?                       =="
                + "\n==                  (You may type \"slow\" \"medium\" or \"fast\")                  =="
                + "\n================================================================================", 0, false);
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "slow":
                GameControl.setPace(1);
                this.console.println("pace set to slow");
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "medium":
                GameControl.setPace(2);
                this.console.println("pace set to medium");
                gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "fast":
                GameControl.setPace(3);
                this.console.println("pace set to fast");
                gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            default:
                this.console.println("You must enter \"slow\" \"medium\" or \"fast\"");
                return false;
        }

        return true;
    }

}

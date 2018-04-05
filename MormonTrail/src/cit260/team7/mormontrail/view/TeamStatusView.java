/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

//import cit260.team7.mormontrail.control.CharacterControl;
import cit260.team7.mormontrail.control.HotelControl;
//import cit260.team7.mormontrail.exception.CharacterException;
import cit260.team7.mormontrail.exception.HotelException;
import java.io.IOException;

/**
 *
 * @author rherrerajr
 */
public class TeamStatusView extends View {

    public TeamStatusView() throws HotelException {

        super("\n"
                + "\n================================================================================"
                + "\n==                            Team Health Status                              =="
                + "\n================================================================================"
                + "\n" + HotelControl.characterHealth()
                + "\n1 | Print Team Status Report"
                + "\n2 | Return to game menu", 2, true);
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                //Select the report menu option and call a View Layer function that is responsible for printing the report.
                String in = "";
                boolean valid = false;
                String selection = null;
                while (valid == false) {
                    this.console.println("Print report? (y/n)");
            try {
                selection = this.keyboard.readLine();
            } catch (IOException e) {
                this.console.println("error");
            }
                    
//                    selection = keyboard.nextLine();

                    selection = selection.trim();

                    if (selection.length() < 1) {
                        this.console.println("You must enter a non-blank value");
                        continue;
                    }

                    boolean v = selection.equalsIgnoreCase("y") || selection.equalsIgnoreCase("n");

                    if (v != true) {
                        this.console.println("You must enter 'Y' or 'N'");
                        continue;
                    }

                    valid = true;
                }
                if (selection.equalsIgnoreCase("y")) {
                    this.console.println("Enter File name");
//                    
                } else {
                    GamePlayView gamePlayView = new GamePlayView();
                    gamePlayView.display();
                }
                break;
            case "2":
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
        }
        return true;
    }
    
}

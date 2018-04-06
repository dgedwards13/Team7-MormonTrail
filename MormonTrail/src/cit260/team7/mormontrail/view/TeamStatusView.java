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
import java.util.logging.Level;
import java.util.logging.Logger;

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
                
                PrintStatusView printStatusView = null;
        try {
            printStatusView = new PrintStatusView();
        } catch (HotelException ex) {
            Logger.getLogger(TeamStatusView.class.getName()).log(Level.SEVERE, null, ex);
        }
                printStatusView.display();
                break;
            
            case "2":
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
        }
        return true;
    }
    
}

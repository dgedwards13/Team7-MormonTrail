/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
import cit260.team7.mormontrail.exception.EventException;
import cit260.team7.mormontrail.exception.HarvestAndHunterException;
import cit260.team7.mormontrail.exception.HotelException;
import cit260.team7.mormontrail.exception.InventoryException;
import cit260.team7.mormontrail.exception.LocationException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dgedw
 */
public class GamePlayView extends View {

    public GamePlayView() {

        super("\n"
                + "\n================================================================================"
                + "\n==                             Game Menu                                      =="
                //            This function will get the play information and display it.    
                + GameControl.playerData()
                + "\n================================================================================"
                + "\n"
                + "\n1 | Team Status"
                + "\n2 | Team Supplies"
                + "\n3 | Set Team Pace"
                + "\n4 | Main Menu"
                + "\n5 | Help Menu"
                + "\n6 | View map"
                + "\n7 | Test menu",
                7, true);
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                TeamStatusView teamStatusView = null;
        try {
            teamStatusView = new TeamStatusView();
        } catch (HotelException ex) {
            this.console.println(ex.getMessage());
            return false;
        }
                teamStatusView.display();
                break;
            case "2":
                TeamSuppliesView teamSuppliesView = null;
                try {
                    teamSuppliesView = new TeamSuppliesView();
                } catch (InventoryException e) {
                    this.console.println(e.getMessage());
                }
                teamSuppliesView.display();
                break;
            case "3":
                PaceView paceView = new PaceView();
                paceView.display();
                break;
            case "4":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
            case "5":
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "6":
                MapView mapView = new MapView();
                mapView.display();
                break;
            case "7":
                TestView testView = null;
        try {
            testView = new TestView();
        } catch (EventException e) {
            this.console.println(e.getMessage());
        } catch (HarvestAndHunterException e) {
            this.console.println(e.getMessage());
        } catch (LocationException e) {
            this.console.println(e.getMessage());
        }
                testView.display();
        }

        return true;
    }
}

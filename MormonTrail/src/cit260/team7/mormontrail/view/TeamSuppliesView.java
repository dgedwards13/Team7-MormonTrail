/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.exception.InventoryException;


/**
 *
 * @author Shaw-Laptop
 */
public class TeamSuppliesView extends View {

    public TeamSuppliesView() throws InventoryException {
        super("\n"
                + "\n================================================================================"
                + "\n==                             Team Supplies                                  =="
                + "\n================================================================================"
                + "\n" + InventoryControl.order()
                + "\n1 | Print Supply list"
                + "\n2 | return to game play" , 2, true);
                
    }

    @Override
    public boolean doAction(String inputs) {
        switch (inputs) {
            case"1":
                TeamSuppliesPrintView teamSuppliesPrintView = null;
        try {
            teamSuppliesPrintView = new TeamSuppliesPrintView();
        } catch (InventoryException e) {
           this.console.println(e.getMessage());
        }
                teamSuppliesPrintView.display();
                break;
            case "2":
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
        }
        return true;
    }
}

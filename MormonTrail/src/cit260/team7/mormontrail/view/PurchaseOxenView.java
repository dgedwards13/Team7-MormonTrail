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
 * @author dgedw
 */
public class PurchaseOxenView extends View{
    
    public PurchaseOxenView() {
        super("================================================================================"
                + "==                               GENERAL STORE                                =="
                + "==                                                                            =="
                + "==                                 -- OXEN --                                 =="
                + "==                 How many Oxen would you like to purchase?                  =="
                + "==                   Each Ox can pull a maximum of 1500lbs.                   =="
                + "==                                                                            =="
                + "================================================================================"
                + ""
                + ""
                + "You currently have $"
                + InventoryControl.countItem("money")
                + ", and "
                + InventoryControl.countItem("oxen")
                + " Oxen.", 0, false);
    }
    
    @Override
    public boolean doAction(String inputs) {
        int numInput = Integer.parseInt(inputs);
        String buy;
        try {
            buy = InventoryControl.changeInventory("Oxen", numInput, true);
            this.console.println("Success!");
            GeneralStoreView generalStoreView = new GeneralStoreView();
            generalStoreView.display();
            return true;
        } catch (InventoryException e) {
            this.console.println("Error " + e.getMessage());
            return false;
        }
}
}

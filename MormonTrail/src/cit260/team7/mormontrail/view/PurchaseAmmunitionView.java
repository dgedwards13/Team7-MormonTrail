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
public class PurchaseAmmunitionView extends View{
    
    public PurchaseAmmunitionView() {
        super("================================================================================"
                + "==                               GENERAL STORE                                =="
                + "==                                                                            =="
                + "==                              -- AMMUNITION --                              =="
                + "==         How many cases of ammunition would you like to purchase?           =="
                + "==         We reccommend at least 1 case per day you plan to travel.          =="
                + "==                                                                            =="
                + "================================================================================"
                + ""
                + ""
                + "You currently have $"
                + InventoryControl.countItem("money")
                + ", and "
                + InventoryControl.countItem("ammunition")
                + " Oxen.", 0, false);
    }
    
    @Override
    public boolean doAction(String inputs) {
        int numInput = Integer.parseInt(inputs);
        String buy;
        try {
            buy = InventoryControl.changeInventory("Ammunition", numInput, true);
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

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
public class PurchasePartsView extends View{
    
    public PurchasePartsView() {
        super("================================================================================"
                + "==                               GENERAL STORE                                =="
                + "==                                                                            =="
                + "==                             -- SPARE PARTS --                              =="
                + "==             How many spare parts would you like to purchase?               =="
                + "==        We reccommend having a couple extra. Better safe than sorry!        =="
                + "==                                                                            =="
                + "================================================================================"
                + ""
                + ""
                + "You currently have $"
                + InventoryControl.countItem("money")
                + ", and "
                + InventoryControl.countItem("spare parts")
                + " Oxen.", 0, false);
    }
    
    @Override
    public boolean doAction(String inputs) {
        int numInput = Integer.parseInt(inputs);
        String buy;
        try {
            buy = InventoryControl.changeInventory("Spare Parts", numInput, true);
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

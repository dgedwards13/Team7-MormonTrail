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
public class PurchaseWagonView extends View{
    
    public PurchaseWagonView() {
        super("================================================================================"
                + "==                               GENERAL STORE                                =="
                + "==                                                                            =="
                + "==                                -- WAGONS --                                =="
                + "==               What size of Wagon would you like to purchase?               =="
                + "==                                                                            =="
                + "================================================================================"
                + ""
                + ""
                + "You currently have $"
                + InventoryControl.countItem("money")
                + "You currently have $" + InventoryControl.countItem("money")
                + "1 | Small (Holds 1500lbs)"
                + "2 | Medium (Holds 2000lbs)"
                + "3 | Large (Holds 2500lbs)",0, false);
    }
    
    @Override
    public boolean doAction(String inputs) {
        int numInput = Integer.parseInt(inputs);
        String buy;
        String item = "";
        switch (numInput) {
            case 1:
                item = "Small Wagon";
                break;
            case 2:
                item = "Medium Wagon";
                break;
            case 3:
                item = "Large Wagon";
                break;
        }
        try {
            buy = InventoryControl.changeInventory(item, numInput, true);
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

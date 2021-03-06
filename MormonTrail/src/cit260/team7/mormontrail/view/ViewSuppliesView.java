/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.exception.InventoryException;
import cit260.team7.mormontrail.model.InventoryItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dgedw
 */
public class ViewSuppliesView extends View {

    public ViewSuppliesView() {
        super("\n"
                + "\n================================================================================"
                + "\n==                               Your Supplies                                =="
                + "\n================================================================================"
                + "\n\n" + InventoryControl.buildInvMenu("generalstore")
                + "\nYou currently have $" + InventoryControl.countItem("money")
                + "\nWhich item (if any) would you like to sell?", InventoryControl.countInvMenu("generalstore"), true);
    }

    @Override
    public boolean doAction(String inputs) {
        InventoryItem[] inventoryArray = InventoryControl.getInventory();
        List<InventoryItem> ownedArray = new ArrayList<>();
        for (InventoryItem inv : inventoryArray) {
            if (inv.getAmount() > 0 && !inv.getItem().equalsIgnoreCase("money")) {
                ownedArray.add(inv);
            }
        }
        {
            try {
                int convert = Integer.parseInt(inputs);
                int num = convert - 1;
                if (num == ownedArray.size()) {
                    GeneralStoreView generalStoreView = new GeneralStoreView();
                    generalStoreView.display();
                } else {
                    try {
                        InventoryControl.changeInventory(ownedArray.get(num).getItem(), -1, true);
                        ViewSuppliesView viewSuppliesView = new ViewSuppliesView();
                        viewSuppliesView.display();
                    } catch (InventoryException e) {
                        this.console.println(e.getMessage());
                        return false;
                    }
                }
            } catch (NumberFormatException e) {
                this.console.println("You must enter a valid number");
            }
        }
        return true;
    }
}

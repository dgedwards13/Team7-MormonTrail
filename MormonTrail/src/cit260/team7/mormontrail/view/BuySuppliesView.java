/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.PurchaseControl;
import cit260.team7.mormontrail.exception.InventoryException;

/**
 *
 * @author dgedw
 */
public class BuySuppliesView extends View {

    public BuySuppliesView() {
        super("\n================================================================================"
                + "\n==                               GENERAL STORE                                =="
                + "\n==                                                                            =="
                + "\n== Thanks for shopping with us! We have the following great products for you  =="
                + "\n==             to purchase! Please take a look around our store!              =="
                + "\n==                                                                            =="
                + "\n================================================================================"
                + "\n\nThe following supplies are available for purchase:"
                + "\n1 | Oxen"
                + "\n2 | Wagons"
                + "\n3 | Food"
                + "\n4 | Spare Parts"
                + "\n5 | Ammunition"
                + "\n6 | Return to Previous Menu", 6, true);
    }

    @Override
    public boolean doAction(String inputs) {
        switch (inputs) {
            case "1": {
                try {
                    PurchaseControl.PurchaseOxen();
                } catch (InventoryException e) {
                    this.console.println(e.getMessage());
                    return false;
                }
            }
            GeneralStoreView generalStoreView = new GeneralStoreView();
            generalStoreView.display();
            break;
            case "2": {
                try {
                    PurchaseControl.PurchaseWagon();
                } catch (InventoryException e) {
                    this.console.println(e.getMessage());
                    return false;
                }
            }
            generalStoreView = new GeneralStoreView();
            generalStoreView.display();
            break;
            case "3": {
                try {
                    PurchaseControl.PurchaseFood();
                } catch (InventoryException e) {
                    this.console.println(e.getMessage());
                    return false;
                }
            }
            generalStoreView = new GeneralStoreView();
            generalStoreView.display();
            break;
            case "4": {
                try {
                    PurchaseControl.PurchaseParts();
                } catch (InventoryException e) {
                    this.console.println(e.getMessage());
                    return false;
                }
            }
            generalStoreView = new GeneralStoreView();
            generalStoreView.display();
            break;
            case "5": {
                try {
                    PurchaseControl.purchaseAmmo();
                } catch (InventoryException e) {
                    this.console.println(e.getMessage());
                    return false;
                }
            }
            generalStoreView = new GeneralStoreView();
            generalStoreView.display();
            break;
            case "6":
                generalStoreView = new GeneralStoreView();
                generalStoreView.display();
                break;
        }
        return true;
    }
}

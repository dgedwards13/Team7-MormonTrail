/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;


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
            case "1": 
                PurchaseOxenView purchaseOxenView = new PurchaseOxenView();
                purchaseOxenView.display();
                break;
            case "2":
                PurchaseWagonView purchaseWagonView = new PurchaseWagonView();
                purchaseWagonView.display();
                break;
            case "3":
                PurchaseFoodView purchaseFoodView = new PurchaseFoodView();
                purchaseFoodView.display();
                break;
            case "4":
                PurchasePartsView purchasePartsView = new PurchasePartsView();
                purchasePartsView.display();
                break;
            case "5":
                PurchaseAmmunitionView purchaseAmmunitionView = new PurchaseAmmunitionView();
                purchaseAmmunitionView.display();
                break;
            case "6":
                GeneralStoreView generalStoreView = new GeneralStoreView();
                generalStoreView.display();
                break;
        }
        return true;
    }
}

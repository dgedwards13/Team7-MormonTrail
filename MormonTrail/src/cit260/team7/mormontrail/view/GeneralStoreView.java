/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;


/**
 *
 * @author dgedw
 */
public class GeneralStoreView extends View {
    public GeneralStoreView() {
        super("\n"
              + "================================================================================"
            + "\n==                               GENERAL STORE                                =="
            + "\n==                                                                            =="
            + "\n==  Welcome to the General Store! We have all the supplies that you may need  =="
            + "\n==   for your journey! Stock up now, because you never know when you'll get   =="
            + "\n==                              another chance!                               =="
            + "\n================================================================================"
            + "\n\n"
            + "\n1 | View or Sell Current Supplies"
            + "\n2 | Buy Supplies"
            + "\n3 | Exit Store", 3, true);
    }
    
@Override
    public boolean doAction(String inputs) {
           switch(inputs) {
            case "1":
                ViewSuppliesView viewSuppliesView = new ViewSuppliesView();
                viewSuppliesView.display();
                break;
            case "2":
                BuySuppliesView buySuppliesView = new BuySuppliesView();
                buySuppliesView.display();
                break;
            case "3":
                FortTownSceneView fortTownSceneView = new FortTownSceneView();
                fortTownSceneView.display();
                break;
        }
        return true;
    }
}


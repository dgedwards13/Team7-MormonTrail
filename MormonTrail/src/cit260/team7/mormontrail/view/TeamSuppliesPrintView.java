/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.exception.InventoryException;
import cit260.team7.mormontrail.model.InventoryItem;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Shaw-Laptop
 */
public class TeamSuppliesPrintView extends View {

    public TeamSuppliesPrintView() throws InventoryException {
        super("\n"
                + "\n================================================================================"
                + "\n==                    Printing Team Supplies                                  =="
                + "\n================================================================================"
                + "\n1 return to game play", 1, true);
    }

    private static PrintWriter createFile(String fileName) {
        try {

            File listOfItems = new File(fileName);

            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfItems)));

            InventoryItem[] inventoryArray = InventoryControl.getInventory();
            for (int i = 0; i < inventoryArray.length; i++) {
                infoToWrite.write("\n" + inventoryArray[i].getItem() + " " + inventoryArray[i].getAmount()+ "  ");
            }
            infoToWrite.close();
            
        } catch (IOException e) {
            System.out.println("Error");

            TeamSuppliesPrintView teamSuppliesPrintView = null;
            try {
                teamSuppliesPrintView = new TeamSuppliesPrintView();
            } catch (InventoryException ex) {
            }
            teamSuppliesPrintView.display();

        }

        return null;
    }

    @Override
    public boolean doAction(String inputs) {

        PrintWriter invOutput = createFile("teamSupplies.txt");

        GamePlayView gamePlayView = new GamePlayView();
        gamePlayView.display();

        return true;

    }

}

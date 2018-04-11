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
import java.util.Scanner;

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
                + "\n1 Print Supplies List", 1, true);
    }

    private static PrintWriter createFile(String fileName) {
        try {
            
            Scanner in = new Scanner(System.in);
            System.out.println("Give your file a name");
            String input = in.nextLine();
            
            FileWriter wow = new FileWriter(input);
            
            wow.write("Team Supplies"+"\n");
            wow.write("\n");
            wow.write("Inventory Name" +"   "+ "Inventory Amounts"+"\n");
            InventoryItem[] inventoryArray = InventoryControl.getInventory();
            for (int i = 0; i < inventoryArray.length; i++) {
                
                wow.write(inventoryArray[i].getItem() + "           " + inventoryArray[i].getAmount() + " \n");
            }
            wow.close();
            
            File listOfItems = new File(fileName);

            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfItems)));


        } catch (IOException e) {
            System.out.println("Invaild input");

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

        InventoryItem[] inventoryArray = InventoryControl.getInventory();
        PrintWriter invOutput = createFile("teamSupplies.txt");

        GamePlayView gamePlayView = new GamePlayView();
        gamePlayView.display();

        return true;

    }

}

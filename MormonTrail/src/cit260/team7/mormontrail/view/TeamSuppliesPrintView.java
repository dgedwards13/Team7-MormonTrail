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
public class TeamSuppliesPrintView extends View{
        public TeamSuppliesPrintView() throws InventoryException {
        super("\n"
                + "\n================================================================================"
                + "\n==                    Printing Team Supplies                                  =="
                + "\n================================================================================"
                + "\n", 0, false);
    }

    private static PrintWriter createFile(String fileName){
     try{
            
            File listOfItems = new File(fileName);
            
            PrintWriter infoToWrite = new PrintWriter( 
                    new BufferedWriter(
                    new FileWriter(listOfItems)));
    
        }
        catch(IOException e){
            System.out.println("Error");
            System.exit(0);
        
        }
        
        return null;
        
    }

    @Override
    public boolean doAction(String inputs){
     
     InventoryItem[] inventoryArray = InventoryControl.getInventory(); 
     
     PrintWriter invOutput = createFile("teamSupplies.txt");
     
     //Untested
     String list = "";
     for (InventoryItem inventoryArray1 : inventoryArray) {
            list += "\n" + inventoryArray1.getItem();
        }
     
     TeamSuppliesView teamSuppliesView= null;
            try {
                teamSuppliesView = new TeamSuppliesView();
            } catch (InventoryException e) {
            this.console.println(e.getMessage());
            return false;
            }
            teamSuppliesView.display();
        return true;
       
    }

   
}
      
        
    


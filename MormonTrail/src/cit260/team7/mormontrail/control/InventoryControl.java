/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.InventoryItem;

/**
 *
 * @author Astley Shaw, Savannah Fish, Daniel Edwards
 */
public class InventoryControl {
    static InventoryItem itemWheat;
    static InventoryItem itemWater;
    static InventoryItem itemMedicine;
    static InventoryItem itemMoney;
            
    public static void setInventory(){
        itemWheat = new InventoryItem("Wheat", 4, 3, 2.25);
        itemWater = new InventoryItem("Water", 8, 5, 4.00);
        itemMedicine = new InventoryItem("Medicine", 2, 1, 9.50);
        itemMoney = new InventoryItem("Money", 1000, 0, 0);
    }
    
    public static InventoryItem[] getInventory(){
 
        InventoryItem[] inventoryArray = new InventoryItem[4];

        inventoryArray[0] = itemWheat;
        inventoryArray[1] = itemWater;
        inventoryArray[2] = itemMedicine;
        inventoryArray[3] = itemMoney;
        
        return inventoryArray;
        
    }
    
    public static String changeInventory(String itemName, double amount, boolean purchase) {
        
        // Build Inventory Array
        
        InventoryItem[] inventoryArray = getInventory();

        
        
        // Data Validation

        // Count the number of items in inventory
        int invLength = inventoryArray.length;
        
        // Check if item exists
        int search = 0;
        for( int i = 0; i < invLength; i++ ) {
            String testValue = inventoryArray[i].getItem();
            if(testValue == itemName) {
                search = 1;
            }
        }
        if (search == 0) {
            return "Item does not exist";
        }

        
        int index = -1;
            for( int i = 0; (i < invLength) && (index == -1); i++) {
                String testValue = inventoryArray[i].getItem();
                if(testValue == itemName) {
                    index = i;
                }
            }
        
        // Test for purchase
        
        if(purchase) {
            int moneyIndex = -1;
            for( int i = 0; (i < invLength) && (moneyIndex == -1); i++) {
                String testValue = inventoryArray[i].getItem();
                if(testValue == "Money") {
                    moneyIndex = i;
                }
            }
            double wallet = inventoryArray[moneyIndex].getAmount();
            double price = inventoryArray[index].getPrice();
            price = price * amount;
            inventoryArray[moneyIndex].setAmount(wallet - price);
        }
        
        
        
        // Adding / Removing Items
        
        double currentAmount = inventoryArray[index].getAmount();
        inventoryArray[index].setAmount(currentAmount + amount);
        return "Success!";
    }
}

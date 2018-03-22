/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.InventoryItem;
import cit260.team7.mormontrail.exception.InventoryException;


/**
 *
 * @author Astley Shaw, Savannah Fish, Daniel Edwards
 */
public class InventoryControl {
    static InventoryItem itemMoney;
    static InventoryItem itemOxen;
    static InventoryItem itemSWagon;
    static InventoryItem itemMWagon;
    static InventoryItem itemLWagon;
    static InventoryItem itemFood;
    static InventoryItem itemSpareParts;
    static InventoryItem itemAmmo;
            
    public static void setInventory(){
        itemMoney = new InventoryItem("Money", 3500, 0, 0);
        itemOxen = new InventoryItem("Oxen", 0, 0, 30);
        itemSWagon = new InventoryItem("Small Wagon", 0, 0, 100);
        itemMWagon = new InventoryItem("Medium Wagon", 0, 0, 150);
        itemLWagon = new InventoryItem("Large Wagon", 0, 0, 200);
        itemFood = new InventoryItem("Food", 0, 1, 10);
        itemSpareParts = new InventoryItem("Spare Parts", 0, 10, 50);
        itemAmmo = new InventoryItem("Ammunition", 0, 5, 10);
    }
    
    public static InventoryItem[] getInventory(){
 
        InventoryItem[] inventoryArray = new InventoryItem[8];

        inventoryArray[0] = itemMoney;
        inventoryArray[1] = itemOxen;
        inventoryArray[2] = itemSWagon;
        inventoryArray[3] = itemMWagon;
        inventoryArray[4] = itemLWagon;
        inventoryArray[5] = itemFood;
        inventoryArray[6] = itemSpareParts;
        inventoryArray[7] = itemAmmo;
        
        return inventoryArray;
        
    }
    
  
    
    public static int countItem(String itemName) {
        InventoryItem[] inventoryArray = getInventory();
        int invLength = inventoryArray.length;
        int index = -1;
        for( int i = 0; (i < invLength) && (index == -1); i++) {
            String testValue = inventoryArray[i].getItem();
            if(testValue.equalsIgnoreCase(itemName)) {
                index = i;
            }
        }
        if(index == -1) {
            return 0;
        } else {
            double amount = inventoryArray[index].getAmount();
            int rounded = (int) Math.round(amount);
            return rounded;
        }
    }
    
    public static String changeInventory(String itemName, double amount, boolean purchase) throws InventoryException{
        // Build Inventory Array
        InventoryItem[] inventoryArray = getInventory();
        // Count the number of items in inventory
        int invLength = inventoryArray.length;
        // Check if item exists
        int search = 0;
        for( int i = 0; i < invLength; i++ ) {
            String testValue = inventoryArray[i].getItem();
            if(testValue.equals(itemName)) {
                search = 1;
            }
        }
        if (search == 0) {
            throw new InventoryException("Item does not exist");
        }
        int index = -1;
            for( int i = 0; (i < invLength) && (index == -1); i++) {
                String testValue = inventoryArray[i].getItem();
                if(testValue.equals(itemName)) {
                    index = i;
                }
            }
        // Test for purchase  
        if(purchase) {
            int moneyIndex = -1;
            for( int i = 0; (i < invLength) && (moneyIndex == -1); i++) {
                String testValue = inventoryArray[i].getItem();
                if("Money".equals(testValue)) {
                    moneyIndex = i;
                }
            }
            double wallet = inventoryArray[moneyIndex].getAmount();
            double price = inventoryArray[index].getPrice();
            price = price * amount;
            if (wallet - price < 0) {
                throw new InventoryException("You cannot afford that!");
            }
            inventoryArray[moneyIndex].setAmount(wallet - price);
        }
        // Adding / Removing Items   
        double currentAmount = inventoryArray[index].getAmount();
        inventoryArray[index].setAmount(currentAmount + amount);
        return "Success!";
    }
    
    public static double calCurrentWeight(double wagonSize) throws InventoryException{
        double currentWeight;
        InventoryItem[] inventoryArray = InventoryControl.getInventory();
        int invCount = inventoryArray.length;      
        double invItemWeight = 0;
        for (int i= 0; i < invCount; i++){
            double w = inventoryArray[i].getItemWeight();
            double a = inventoryArray[i].getAmount();
            double wa = w * a;
            invItemWeight = invItemWeight + wa;
        }
        if(invItemWeight < 0 || invItemWeight > wagonSize) {
            throw new InventoryException("you are so wrong");
        } else {
            currentWeight = invItemWeight;
            return currentWeight;
        }
    }
    
    public static String buildInvMenu(String application) {
        InventoryItem[] inventoryArray = getInventory();
        String invList = "";
        int i = 1;
        if(application.equalsIgnoreCase("generalstore")) { 
            for (InventoryItem inv : inventoryArray) {
                if(inv.getAmount() > 0 && !inv.getItem().equalsIgnoreCase("money")) {
                    int intAmount = (int) Math.round(inv.getAmount());
                    invList += "\n" + i + " | " + inv.getItem() + " (QTY : " + intAmount + ")";
                    i++;
                }
            }
        } else if(application.equalsIgnoreCase("river")) {
            for (InventoryItem inv : inventoryArray) {
                boolean stuff = !inv.getItem().equalsIgnoreCase("money") || !inv.getItem().equalsIgnoreCase("small wagon") || !inv.getItem().equalsIgnoreCase("medium wagon") || !inv.getItem().equalsIgnoreCase("large wagon") || !inv.getItem().equalsIgnoreCase("oxen");
                if(inv.getAmount() > 0 && stuff) {
                    int intAmount = (int) Math.round(inv.getAmount());
                    invList += "\n" + i + " | " + inv.getItem() + " (QTY : " + intAmount + ", " + inv.getItemWeight() + " lbs)";
                    i++;
                }
            }
        }
        invList += "\n" + i + " | Return to Previous Menu";
        return invList;
    }
    
    public static int countInvMenu(String application) {
        InventoryItem[] inventoryArray = getInventory();
        int i = 1;
        if(application.equalsIgnoreCase("generalstore")) {
            for (InventoryItem inv : inventoryArray) {
                if(inv.getAmount() > 0 && !inv.getItem().equalsIgnoreCase("money")) {
                    i++;
                }
            }
        } else if(application.equalsIgnoreCase("river")) {
            for (InventoryItem inv : inventoryArray) {
                boolean stuff = !inv.getItem().equalsIgnoreCase("money") || !inv.getItem().equalsIgnoreCase("small wagon") || !inv.getItem().equalsIgnoreCase("medium wagon") || !inv.getItem().equalsIgnoreCase("large wagon") || !inv.getItem().equalsIgnoreCase("oxen");
                if(inv.getAmount() > 0 && stuff) {
                    i++;
                }
            }
        }
        return i;
    }
  

    public static String inventoryList() {
        InventoryItem[] inventoryArray = getInventory(); 
        String list= "";
        for (InventoryItem inventoryArray1 : inventoryArray) {
            list += "\n" + inventoryArray1.getItem();
        }
        return list;
    }

    public static String order() throws InventoryException{
      InventoryItem[] ray = InventoryControl.getInventory();
        String list= "";
        for( int i = 0; i < ray.length; i++){
            for( int j = i + 1; j<ray.length; j++){
            InventoryItem tmp;
            if(ray[i].getAmount() > ray[j].getAmount()){
             tmp = ray[i];
             ray[i] = ray[j];
             ray[j] = tmp;
            }
            
            
            }
//          list += "\n"+ inventoryArray[i].getAmount();
        }
        for (InventoryItem ray1 : ray) {
        if(ray1.getAmount()<=-1) {
                throw new InventoryException("invaild");
            } 
            else { 
               list += "\n" + ray1.getItem() + " " + ray1.getAmount(); 
            }
        }
      return list;   
}
}

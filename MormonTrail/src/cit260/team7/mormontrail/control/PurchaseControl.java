/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.exception.InventoryException;
import cit260.team7.mormontrail.view.ErrorView;
import java.util.Scanner;

/**
 *
 * @author dgedw
 */
public class PurchaseControl {

    public static String PurchaseOxen() throws InventoryException {
        boolean valid = false;
        String selection = null;
        int numInput = 0;
        while (valid == false) {
            
            selection = this.keyboard.readLine();
            System.out.println("================================================================================");
            System.out.println("==                               GENERAL STORE                                ==");
            System.out.println("==                                                                            ==");
            System.out.println("==                                 -- OXEN --                                 ==");
            System.out.println("==                 How many Oxen would you like to purchase?                  ==");
            System.out.println("==                   Each Ox can pull a maximum of 1500lbs.                   ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("You currently have $" + InventoryControl.countItem("money") + ", and " + InventoryControl.countItem("oxen") + " Oxen.");
//            String selection = keyboard.nextLine();
            selection = selection.trim();
            if (selection.length() < 1) {
                throw new InventoryException("You must enter a non-blank value");
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number");
            }
            try {
                numInput = Integer.parseInt(selection);
                valid = true;
            } catch (NumberFormatException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input" + e.getMessage());
                continue;
            }
        }
        String buy = InventoryControl.changeInventory("Oxen", numInput, true);
        if (buy.equalsIgnoreCase("success!")) {
            return "Success!";
        } else {
            throw new InventoryException("Transaction failed. Please try again.");
        }
    }

    public static String PurchaseWagon() throws InventoryException {
        boolean valid = false;
        String selection = null;
        int numInput = 0;
        while (valid == false) {
            selection = this.keyboard.readLine();
            System.out.println("================================================================================");
            System.out.println("==                               GENERAL STORE                                ==");
            System.out.println("==                                                                            ==");
            System.out.println("==                                -- WAGONS --                                ==");
            System.out.println("==               What size of Wagon would you like to purchase?               ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("You currently have $" + InventoryControl.countItem("money"));
            System.out.println("1 | Small (Holds 1500lbs)");
            System.out.println("2 | Medium (Holds 2000lbs)");
            System.out.println("3 | Large (Holds 2500lbs");
//            String selection = keyboard.nextLine();
            selection = selection.trim();
            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number"); 
                throw new InventoryException("You must enter a non-blank value");
            }
            try {
                numInput = Integer.parseInt(selection);
                valid = true;
            } catch (NumberFormatException e) {
                 ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());
                continue;
            }
        }
        if (numInput == 1) {
            String buy = InventoryControl.changeInventory("Small Wagon", 1, true);
            if (buy.equalsIgnoreCase("success!")) {
                return "Success!";
            } else {
                throw new InventoryException("Transaction failed. Please try again.");
            }
        } else if (numInput == 2) {
            String buy = InventoryControl.changeInventory("Medium Wagon", 1, true);
            if (buy.equalsIgnoreCase("success!")) {
                return "Success!";
            } else {
                throw new InventoryException("Transaction failed. Please try again.");
            }
        } else if (numInput == 3) {
            String buy = InventoryControl.changeInventory("Large Wagon", 1, true);
            if (buy.equalsIgnoreCase("success!")) {
                return "Success!";
            } else {
                throw new InventoryException("Transaction failed. Please try again.");
            }
        } else {
            throw new InventoryException("Transaction failed. Please try again.");
        }
    }

    public static String PurchaseFood() throws InventoryException {
        boolean valid = false;
        String selection = null;
        int numInput = 0;
        while (valid == false) {
            selection = this.keyboard.readLine();
            System.out.println("================================================================================");
            System.out.println("==                               GENERAL STORE                                ==");
            System.out.println("==                                                                            ==");
            System.out.println("==                                 -- FOOD --                                 ==");
            System.out.println("==            How many pounds of food would you like to purchase?             ==");
            System.out.println("==           We reccommend at least 50lbs per person in your party.           ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("You currently have $" + InventoryControl.countItem("money") + ", and " + InventoryControl.countItem("food") + " lbs of food.");
//            String selection = keyboard.nextLine();
            selection = selection.trim();
            if (selection.length() < 1) {
                throw new InventoryException("You must enter a non-blank value");
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number");
            }
            try {
                numInput = Integer.parseInt(selection);
                valid = true;
            } catch (NumberFormatException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input" + e.getMessage());
                continue;
            }
        }
        String buy = InventoryControl.changeInventory("Food", numInput, true);
        if (buy.equalsIgnoreCase("success!")) {
            return "Success!";
        } else {
            throw new InventoryException("Transaction failed. Please try again.");
        }
    }

    public static String PurchaseParts() throws InventoryException {
        boolean valid = false;
        String selection = null;
        int numInput = 0;
        while (valid == false) {
            selection = this.keyboard.readLine();
            System.out.println("================================================================================");
            System.out.println("==                               GENERAL STORE                                ==");
            System.out.println("==                                                                            ==");
            System.out.println("==                             -- SPARE PARTS --                              ==");
            System.out.println("==             How many spare parts would you like to purchase?               ==");
            System.out.println("==        We reccommend having a couple extra. Better safe than sorry!        ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("You currently have $" + InventoryControl.countItem("money") + ", and " + InventoryControl.countItem("spare parts") + " spare parts.");
//            String selection = keyboard.nextLine();
            selection = selection.trim();
            if (selection.length() < 1) {
                throw new InventoryException("You must enter a non-blank value");
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number");
            }
            try {
                numInput = Integer.parseInt(selection);
                valid = true;
            } catch (NumberFormatException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input" + e.getMessage());
                continue;
            }
        }
        String buy = InventoryControl.changeInventory("Spare Parts", numInput, true);
        if (buy.equalsIgnoreCase("success!")) {
            return "Success!";
        } else {
            throw new InventoryException("Transaction failed. Please try again.");
        }
    }

    public static String purchaseAmmo() throws InventoryException {
        boolean valid = false;
        String selection = null;
        int numInput = 0;
        while (valid == false) {
            selection = this.keyboard.readLine();
            System.out.println("================================================================================");
            System.out.println("==                               GENERAL STORE                                ==");
            System.out.println("==                                                                            ==");
            System.out.println("==                              -- AMMUNITION --                              ==");
            System.out.println("==         How many cases of ammunition would you like to purchase?           ==");
            System.out.println("==         We reccommend at least 1 case per day you plan to travel.          ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("You currently have $" + InventoryControl.countItem("money") + ", and " + InventoryControl.countItem("ammunition") + " cases of ammunition.");
//            String selection = keyboard.nextLine();
            selection = selection.trim();
            if (selection.length() < 1) {
                throw new InventoryException("You must enter a non-blank value");
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number");
                
                
            }
            try {
                numInput = Integer.parseInt(selection);
                valid = true;
            } catch (NumberFormatException e) {
                ErrorView.display(this.getClass().getName(), "Error reading input" + e.getMessage());
                continue;
            }
        }

        String buy = InventoryControl.changeInventory("Ammunition", numInput, true);
        if (buy.equalsIgnoreCase("success!")) {
            return "Success!";
        } else {
            throw new InventoryException("Transaction failed. Please try again.");
        }
    }
}

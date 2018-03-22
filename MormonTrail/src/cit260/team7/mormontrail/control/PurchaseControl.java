/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.exception.InventoryException;
import java.util.Scanner;

/**
 *
 * @author dgedw
 */
public class PurchaseControl {
    public static String PurchaseOxen() throws InventoryException {
        boolean valid = false;
        int numInput = 0;
        while (valid == false) {
            Scanner keyboard = new Scanner(System.in);
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
            String in = keyboard.nextLine();
            in = in.trim();
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            numInput = Integer.parseInt(in);
            valid = true;
        }
        String buy = InventoryControl.changeInventory("Oxen", numInput, true);
        if (buy.equalsIgnoreCase("success!")) {
            return "Success!";
        } else {
            return "Transaction failed. Please try again.";
        }
    }
    
    public static String PurchaseWagon() {
        boolean valid = false;
        int numInput = 0;
        while (valid == false) {
            Scanner keyboard = new Scanner(System.in);
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
            String in = keyboard.nextLine();
            in = in.trim();
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            numInput = Integer.parseInt(in);
            valid = true;
        }
        if (numInput == 1) {
            String buy = InventoryControl.changeInventory("Small Wagon", 1, true);
            if (buy.equalsIgnoreCase("success!")) {
                return "Success!";
            } else {
                return "Transaction failed. Please try again.";
            }
        } else if (numInput == 2) {
            String buy = InventoryControl.changeInventory("Medium Wagon", 1, true);
            if (buy.equalsIgnoreCase("success!")) {
                return "Success!";
            } else {
                return "Transaction failed. Please try again.";
            }
        } else if (numInput == 3) {
            String buy = InventoryControl.changeInventory("Large Wagon", 1, true);
            if (buy.equalsIgnoreCase("success!")) {
                return "Success!";
            } else {
                return "Transaction failed. Please try again.";
            }
        } else {
            return "Transaction failed. Please try again.";
        }
    }
}

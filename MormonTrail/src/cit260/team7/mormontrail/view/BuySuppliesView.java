/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.control.PurchaseControl;
import cit260.team7.mormontrail.exception.InventoryException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dgedw
 */
public class BuySuppliesView extends View{
    public BuySuppliesView(){
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
             + "\n6 | Return to Previous Menu", 6,true);
    }
@Override
    public boolean doAction(String inputs) {
            switch(inputs) {
                case "1":
            {
                try {
                    PurchaseControl.PurchaseOxen();
                } catch (InventoryException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            }
                    GeneralStoreView generalStoreView = new GeneralStoreView();
                    generalStoreView.display();
                    break;
                case "2":
            {
                try {
                    PurchaseControl.PurchaseWagon();
                } catch (InventoryException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            }
                    generalStoreView = new GeneralStoreView();
                    generalStoreView.display();
                    break;
                case "3":
                    boolean valid = false;
                    int numInput = 0;
                    while (valid == false) {
                        Scanner keyboard = new Scanner(System.in);
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
                        String in = keyboard.nextLine();
                        in = in.trim();
                        if(in.length() < 1){
                            System.out.println("You must enter a non-blank value");
                            continue;
                        }
                        numInput = Integer.parseInt(in);
                        valid = true;
                    }
            {
                try {
                    InventoryControl.changeInventory("Food", numInput, true);
                } catch (InventoryException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            }
                    generalStoreView = new GeneralStoreView();
                    generalStoreView.display();
                    break;
                case "4":
                    valid = false;
                    numInput = 0;
                    while (valid == false) {
                        Scanner keyboard = new Scanner(System.in);
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
                        String in = keyboard.nextLine();
                        in = in.trim();
                        if(in.length() < 1){
                            System.out.println("You must enter a non-blank value");
                            continue;
                        }
                        numInput = Integer.parseInt(in);
                        valid = true;
                    }
            {
                try {
                    InventoryControl.changeInventory("Spare Parts", numInput, true);
                } catch (InventoryException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            }
                    generalStoreView = new GeneralStoreView();
                    generalStoreView.display();
                    break;
                case "5":
                    valid = false;
                    numInput = 0;
                    while (valid == false) {
                        Scanner keyboard = new Scanner(System.in);
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
                        String in = keyboard.nextLine();
                        in = in.trim();
                        if(in.length() < 1){
                            System.out.println("You must enter a non-blank value");
                            continue;
                        }
                        numInput = Integer.parseInt(in);
                        valid = true;
                    }
            {
                try {
                    InventoryControl.changeInventory("Ammunition", numInput, true);
                } catch (InventoryException e) {
                    System.out.println(e.getMessage());
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
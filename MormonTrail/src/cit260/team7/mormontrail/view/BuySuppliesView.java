/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author dgedw
 */
public class BuySuppliesView {
    public BuySuppliesView(){
         boolean endOfView = false;
          do{
              String[] inputs = this.getInputs();
                      if (inputs == null || inputs.length < 1){
                          return;
                      }
                      endOfView = doAction(inputs);
          }
          while (endOfView != true);
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("================================================================================");
            System.out.println("==                               GENERAL STORE                                ==");
            System.out.println("==                                                                            ==");
            System.out.println("== Thanks for shopping with us! We have the following great products for you  ==");
            System.out.println("==             to purchase! Please take a look around our store!              ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("The following supplies are available for purchase:");
            System.out.println("1 | Oxen");
            System.out.println("2 | Wagons");
            System.out.println("3 | Food");
            System.out.println("4 | Spare Parts");
            System.out.println("5 | Ammunition");
            System.out.println("6 | Return to Previous Menu");

            String in = keyboard.nextLine();
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3") || in.equalsIgnoreCase("4") || in.equalsIgnoreCase("5") || in.equalsIgnoreCase("6");
            if(v != true) {
                System.out.println("The number entered must correlate with the available options.");
                continue;
            }
            
            inputs[0] = in;
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
           switch(inputs[0]) {
            case "1":
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
                System.out.println(InventoryControl.changeInventory("Oxen", numInput, true));
                GeneralStoreView generalStoreView = new GeneralStoreView();
                generalStoreView.display();
                break;
            case "2":
                valid = false;
                numInput = 0;
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
                    System.out.println(InventoryControl.changeInventory("Small Wagon", 1, true));
                } else if (numInput == 2) {
                    System.out.println(InventoryControl.changeInventory("Medium Wagon", 1, true));
                } else if (numInput == 3) {
                    System.out.println(InventoryControl.changeInventory("Large Wagon", 1, true));
                }
                generalStoreView = new GeneralStoreView();
                generalStoreView.display();
                break;
            case "3":
                valid = false;
                numInput = 0;
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
                System.out.println(InventoryControl.changeInventory("Food", numInput, true));
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
                System.out.println(InventoryControl.changeInventory("Spare Parts", numInput, true));
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
                System.out.println(InventoryControl.changeInventory("Ammunition", numInput, true));
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
    
    public void display() {
        
    }
}
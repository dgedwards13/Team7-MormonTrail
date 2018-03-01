/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.model.InventoryItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dgedw
 */
public class ViewSuppliesView {
    public ViewSuppliesView(){
         boolean endOfView = false;
          do{
              int[] inputs = this.getInputs();
                      if (inputs == null || inputs.length < 1){
                          return;
                      }
                      endOfView = doAction(inputs);
          }
          while (endOfView != true);
    }
    
    private int[] getInputs() {
        int[] inputs = new int[1];
        boolean valid = false;
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("================================================================================");
            System.out.println("==                                                                            ==");
            System.out.println("==                               Your Supplies                                ==");
            System.out.println("==                                                                            ==");
            System.out.println("================================================================================");
            InventoryItem[] inventoryArray = InventoryControl.getInventory();
            int i = 1;
            for (InventoryItem inv : inventoryArray) {
                    if(inv.getAmount() > 0 && !inv.getItem().equalsIgnoreCase("money")) {
                        int intAmount = (int) Math.round(inv.getAmount());
                        System.out.println(i + " | " + inv.getItem() + " (QTY : " + intAmount + ")");
                        i++;
                    }
            }
            System.out.println(i + " | Return to Previous Menu");
            System.out.println("You currently have $" + InventoryControl.countItem("money"));
            System.out.println("Which item (if any) would you like to sell?");

            String in = keyboard.nextLine();
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            int numInput = Integer.parseInt(in);
            System.out.println(i);
            
            boolean v = numInput > 0 && numInput < i + 1;
            if(v != true) {
                System.out.println("The number entered must correlate with the available options.");
                continue;
            }
            
            inputs[0] = numInput;
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(int[] inputs) {
        InventoryItem[] inventoryArray = InventoryControl.getInventory();
        List<InventoryItem> ownedArray = new ArrayList<>();
        for (InventoryItem inv : inventoryArray) {
                    if(inv.getAmount() > 0 && !inv.getItem().equalsIgnoreCase("money")) {
                        ownedArray.add(inv);
                    }
                }
        int num = inputs[0] -1;
        if (num == ownedArray.size()) {
            GeneralStoreView generalStoreView = new GeneralStoreView();
            generalStoreView.display();
        } else {
            InventoryControl.changeInventory(ownedArray.get(num).getItem(), -1, true);
            ViewSuppliesView viewSuppliesView = new ViewSuppliesView();
            viewSuppliesView.display();
        }
        return true;
    }
    
    public void display() {
        
    }
}
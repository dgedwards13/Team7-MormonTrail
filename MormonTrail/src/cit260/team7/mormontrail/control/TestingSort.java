/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.InventoryItem;
import java.util.Arrays;

/**
 *
 * @author dgedw
 */
public class TestingSort {
    
    public static void main(String[] args) {
        InventoryControl.setInventory();
        InventoryControl.changeInventory("Food", 26, true);
        InventoryControl.changeInventory("Oxen", 2, true);
        InventoryControl.changeInventory("Ammunition", 14, true);
        InventoryControl.changeInventory("Spare Parts", 3, true);
        InventoryControl.changeInventory("Small Wagon", 1, true);
        InventoryItem[] arr = InventoryControl.getInventory();
        System.out.println("With no Sorting:");
        for (InventoryItem arr1 : arr) {
            System.out.println(arr1.getItem() + " " + arr1.getAmount());
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                InventoryItem tmp;
                if (arr[i].getAmount() > arr[j].getAmount()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("With Sorting:");
        for (InventoryItem arr1 : arr) {
            System.out.println(arr1.getItem() + " " + arr1.getAmount());
        }
    } 

}

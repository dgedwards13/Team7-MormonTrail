/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.exception.InventoryException;
import cit260.team7.mormontrail.model.InventoryItem;
import java.util.Arrays;

/**
 *
 * @author dgedw
 */
public class TestingSort {
    
    public static void main(String[] args) throws InventoryException {
        InventoryControl.setInventory();
        InventoryControl.changeInventory("Food", 20, true);
        InventoryControl.changeInventory("Oxen", 3, true);
        InventoryControl.changeInventory("Ammunition", 5, true);
        InventoryControl.changeInventory("Spare Parts", 50, true);
        InventoryControl.changeInventory("Small Wagon", 10, true);
        InventoryItem[] arr = InventoryControl.getInventory();
        System.out.println("With no Sorting:");
        for (InventoryItem arr1 : arr) {
            System.out.println(arr1.getItem() + " " + arr1.getAmount());
        }
       
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
        System.out.println("test 1:");
        for (InventoryItem arr1 : arr) {
            if(arr1.getAmount()<=-1) {
                System.out.println("invaild");
            } 
            else { 
                System.out.println(arr1.getItem() + " " + arr1.getAmount());
            } 
        }
        
        InventoryControl.setInventory();
        InventoryControl.changeInventory("Food", 16, true);
        InventoryControl.changeInventory("Oxen", 4, true);
        InventoryControl.changeInventory("Ammunition", 10, true);
        InventoryControl.changeInventory("Spare Parts", 27, true);
        InventoryControl.changeInventory("Small Wagon", 10, true);
        InventoryItem[] array = InventoryControl.getInventory();
        
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                InventoryItem tmp;
                if (arr[i].getAmount() > array[j].getAmount()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("test 2:");
        for (InventoryItem arr1 : array) {
         if(arr1.getAmount()<=-1) {
                System.out.println("invaild");
            } 
            else { 
                System.out.println(arr1.getItem() + " " + arr1.getAmount());
            }
        }
    
InventoryControl.setInventory();
        InventoryControl.changeInventory("Food", -1, true);
        InventoryControl.changeInventory("Oxen", -1, true);
        InventoryControl.changeInventory("Ammunition", -1, true);
        InventoryControl.changeInventory("Spare Parts", -1, true);
        InventoryControl.changeInventory("Small Wagon", -1, true);
        InventoryItem[] ray = InventoryControl.getInventory();
        
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < ray.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                InventoryItem tmp;
                if (arr[i].getAmount() >arr[j].getAmount()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("test 3:");
        for (InventoryItem arr1 : arr) {
            if(arr1.getAmount()<=-1) {
                System.out.println("invaild");
            } 
            else { 
                System.out.println(arr1.getItem() + " " + arr1.getAmount());
            } 
            
        }
        
        InventoryControl.setInventory();
        InventoryControl.changeInventory("Food", 0, true);
        InventoryControl.changeInventory("Oxen", 0, true);
        InventoryControl.changeInventory("Ammunition", 0, true);
        InventoryControl.changeInventory("Spare Parts", 0, true);
        InventoryControl.changeInventory("Small Wagon", 0, true);
        InventoryItem[] ay = InventoryControl.getInventory();
        
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                InventoryItem tmp;
                if (arr[i].getAmount() >arr[j].getAmount()) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("test 4:");
        for (InventoryItem arr1 : arr) {
         if(arr1.getAmount()<=-1) {
                System.out.println("invaild");
            } 
            else { 
                System.out.println(arr1.getItem() + " " + arr1.getAmount());
            } 
    }
}
}

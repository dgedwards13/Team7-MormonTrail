/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.InventoryItem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dgedw
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of setInventory method, of class InventoryControl.
     */
    @Test
    public void testSetInventory() {
        System.out.println("\tsetInventory");
        InventoryControl.setInventory();
    }

    /**
     * Test of getInventory method, of class InventoryControl.
     */
    @Test
    public void testGetInventory() {
        System.out.println("\tgetInventory");
        InventoryControl.setInventory();
        InventoryItem[] expResult = new InventoryItem[8];
        expResult[0] = new InventoryItem("Money", 3500, 0, 0);
        expResult[1] = new InventoryItem("Oxen", 0, 0, 30);
        expResult[2] = new InventoryItem("Small Wagon", 0, 0, 100);
        expResult[3] = new InventoryItem("Medium Wagon", 0, 0, 150);
        expResult[4] = new InventoryItem("Large Wagon", 0, 0, 200);
        expResult[5] = new InventoryItem("Food", 0, 1, 10);
        expResult[6] = new InventoryItem("Spare Parts", 0, 10, 50);
        expResult[7] = new InventoryItem("Ammunition", 0, 5, 10);
        InventoryItem[] result = InventoryControl.getInventory();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of changeInventory method, of class InventoryControl.
     */
    @Test
    public void testChangeInventory() {
        System.out.println("\tChangeInventory Test case 1");
        String itemName = "Ammunition";
        double amount = 5;
        boolean purchase = true;
        String expResult = "Success!";
        String result = InventoryControl.changeInventory(itemName, amount, purchase);
        assertEquals(expResult, result);
        
        System.out.println("\tChangeInventory Test case 2");
        itemName = "Ammo";
        amount = 5;
        purchase = true;
        expResult = "Item does not exist";
        result = InventoryControl.changeInventory(itemName, amount, purchase);
        assertEquals(expResult, result);
        
        System.out.println("\tChangeInventory Test case 3");
        itemName = "Money";
        amount = 50;
        purchase = false;
        expResult = "Success!";
        result = InventoryControl.changeInventory(itemName, amount, purchase);
        assertEquals(expResult, result);
    }

    /**
     * Test of calCurrentWeight method, of class InventoryControl.
     */
    @Test
    public void testCalCurrentWeight() {
        InventoryItem[] InventoryArray = InventoryControl.getInventory();
        String t1 = InventoryControl.changeInventory("Food", 50, true);
        String t2 = InventoryControl.changeInventory("Ammunition", 10, true);
        String t3 = InventoryControl.changeInventory("Spare Parts", 2, true);
        
        System.out.println("\tCurrentWeight Test case 1");
        double wagonSize = 1000;
        double expResult = 120;
        double result = InventoryControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);

        System.out.println("\tCurrentWeight Test case 2");
        wagonSize = 50;
        expResult = -1;
        result = InventoryControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tCurrentWeight Test case 3");
        wagonSize = 120;
        expResult = 120;
        result = InventoryControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
       
        System.out.println("\tCurrentWeight Test case 4");
        wagonSize = 30;
        expResult = -1;
        result = InventoryControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of countItem method, of class InventoryControl.
     */
    @Test
    public void testCountItem() {
        System.out.println("\tCountItem Test case 1");
        String itemName = "Money"; // We have $3500
        int expResult = 3500;
        int result = InventoryControl.countItem(itemName);
        assertEquals(expResult, result);
        
        System.out.println("\tCountItem Test case 2");
        itemName = "Oxen"; // Game starts with 0
        expResult = 0;
        result = InventoryControl.countItem(itemName);
        assertEquals(expResult, result);
        
        System.out.println("\tCountItem Test case 3");
        itemName = "Mana"; // Invalid Item, therefore will return 0
        expResult = 0;
        result = InventoryControl.countItem(itemName);
        assertEquals(expResult, result);
    }
}

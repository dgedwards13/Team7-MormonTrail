/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import cit260.team7.mormontrail.view.GrabNameView;
import cit260.team7.mormontrail.model.Game;
import java.io.BufferedReader;
import java.io.FileNotFoundException; // recommended addition by netbeans
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author Astley Shaw, Savannah Fish, Daniel Edwards
 */
//import cit260.team7.mormontrail.model.Character;
//import cit260.team7.mormontrail.model.Event;
//import cit260.team7.mormontrail.model.GeneralStoreItem;
//import cit260.team7.mormontrail.model.InventoryItem;
//import cit260.team7.mormontrail.model.Location;
//import cit260.team7.mormontrail.model.Map;
//import cit260.team7.mormontrail.model.RegularSceneType;
//import cit260.team7.mormontrail.control.InventoryControl;
//import java.util.Arrays;
public class MormonTrail {

    public static Game game;
    
    private static PrintWriter logFile = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    
    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        MormonTrail.game = game;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MormonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MormonTrail.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MormonTrail.logFile = logFile;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MormonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
            MormonTrail.outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logfile.txt");
            
            GrabNameView grabNameView = new GrabNameView();
            grabNameView.display();
            
        } catch (FileNotFoundException e) { // Netbeans recommended fix from /*} catch (Throwable e) {*/
            System.out.println("An error has occurred");
            System.out.println(e.getMessage());
            //Netbeans recommended removal
            e.printStackTrace();
            System.exit(0);
            
        }
        
        finally {
            try {
                if(MormonTrail.inFile !=null)
                   MormonTrail.inFile.close();
                   
                if(MormonTrail.outFile !=null);
                   MormonTrail.outFile.close();
                if (logFile != null) {
                    logFile.close();
                }
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    

}

/**
 * ****************************TEST FOR METHOD************************
 */
//Character characterOne = new Character();
//        
//         characterOne.setName("Savannah Fish");
//         characterOne.setMoney(5.00);
//         
//         String characterOneName = characterOne.getName();
//         double characterOneMoney = characterOne.getMoney();
//         
//         System.out.println(characterOne.toString());
//         
//        Event eventOne = new Event();
//         
//         eventOne.setDescription("Heavy rain fall");
//         eventOne.setHealthImpact(20);
//         
//         String eventOneDescription = eventOne.getDescription();
//         double eventOneHealthImpact = eventOne.getHealthImpact();
//         
//         System.out.println(eventOne.toString());
//         
//         
//        RegularSceneType regularSceneTypeOne = new  RegularSceneType();
//         
//         regularSceneTypeOne.setDescription("rock fall on trail");
//         regularSceneTypeOne.setName("River crossing");
//         regularSceneTypeOne.setCoordinates(10);
//         
//         String regularSceneTypeOneDescription = regularSceneTypeOne.getDescription();
//         String regularSceneTypeOneName = regularSceneTypeOne.getName(); 
//         double regularSceneTypeOneCoordinates = regularSceneTypeOne.getCoordinates();
//         
//         System.out.println(regularSceneTypeOne.toString());
//        
//        Map mapOne = new Map();
//            
//            mapOne.setDescription("Description of the Map");
//            mapOne.setColumnCount(10);
//            mapOne.setRowCount(10);
//            
//            String mapOneDescription = mapOne.getDescription();
//            double mapOneColumnCount = mapOne.getColumnCount();
//            double mapOneRowCount = mapOne.getRowCount();
//            
//            System.out.println(mapOne.toString());
//        
//        Location locationOne = new Location();
//            
//            locationOne.setVisited("yes");
//            locationOne.setRow(2);
//            locationOne.setColunm(4);
//            locationOne.setAmountRemaining(21);
//            
//            String locationOneVisited = locationOne.getVisited();
//            double locationOneRow = locationOne.getRow();
//            double locationOneColumn = locationOne.getColunm();
//            double locationOneAmountRemaining = locationOne.getAmountRemaining();
//            
//            System.out.println(locationOne.toString());
//        
//        GeneralStoreItem generalStoreItemOne = new GeneralStoreItem();
//            
//            generalStoreItemOne.setItemName("Something Awesome");
//            generalStoreItemOne.setPrice(45);
//            generalStoreItemOne.setDescription("Really great stuff.");
//            generalStoreItemOne.setRecommendation(3);
//            
//            String generalStoreItemOneName = generalStoreItemOne.getItemName();
//            double generalStoreItemOnePrice = generalStoreItemOne.getPrice();
//            String generalStoreItemOneDescription = generalStoreItemOne.getDescription();
//            double generalStoreItemOneRecommendation = generalStoreItemOne.getRecommendation();
//            
//            System.out.println(generalStoreItemOne.toString());
//        
//        InventoryItem inventoryItemOne = new InventoryItem("Something Awesome", 4, 32, 1.00);
//            
//            String inventoryItemOneItem = inventoryItemOne.getItem();
//            double inventoryItemOneAmount = inventoryItemOne.getAmount();
//            double inventoryItemOneItemWeight = inventoryItemOne.getItemWeight();
//            double inventoryItemOnePrice = inventoryItemOne.getPrice();
//            
//            System.out.println(inventoryItemOne.toString());
//            
//        //
//        // Testing Inventory Control
//        //
//        
//        // Set Inventory Values
//        InventoryControl.setInventory();
//        
//        // Write Inventory to an Array
//        InventoryItem[] inventoryArray = InventoryControl.getInventory();
//        
//        // Write Array to Console
//        System.out.println(Arrays.toString(inventoryArray));
//        
//        // Purchase 5 Wheat. Amount should now read "9", Money amount should read 988.75
//        String test = InventoryControl.changeInventory("Wheat", 5, true);
//        
//        System.out.println(test);
//        System.out.println(Arrays.toString(inventoryArray));
//        
//        // Purchase 1 Nonexistant item. Should return error. Array will not change.
//        test = InventoryControl.changeInventory("Whet", 1, true);
//        
//        System.out.println(test);
//        System.out.println(Arrays.toString(inventoryArray));
//        
//        // It rained. Obtained 3 Water. Amount should now read "11", Money amount should not change.
//        test = InventoryControl.changeInventory("Water", 3, false);
//        
//        System.out.println(test);
//        System.out.println(Arrays.toString(inventoryArray));
//        
//        // Got sick. Used medicine. Amount should now read "1", Money amount should not change.
//        test = InventoryControl.changeInventory("Medicine", -1, false);
//        
//        System.out.println(test);
//        System.out.println(Arrays.toString(inventoryArray));

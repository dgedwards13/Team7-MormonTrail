/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;
import java.util.Scanner;
import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.model.InventoryItem;
import java.util.Arrays;
/**
 *z
 * @author Savannah
 */
public class StartProgramView {
    
    public StartProgramView() {
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
        String[] inputs = new String[3];
        boolean valid = false;
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Your inventory currently contains:");
            InventoryControl.setInventory();
            InventoryItem[] inventoryArray = InventoryControl.getInventory();
            System.out.println(Arrays.toString(inventoryArray));
            
            System.out.println("Enter the name of the item you would like to purchase:");
            String item = keyboard.nextLine();
            
            item = item.trim();
            
            if(item.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            System.out.println("The item you entered is " + item);
            
            inputs[0] = item;
            
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        InventoryItem[] inventoryArray = InventoryControl.getInventory();
        String test = InventoryControl.changeInventory(inputs[0], 1, true);
        
        System.out.println("*** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        System.out.println(test);
        System.out.println(Arrays.toString(inventoryArray));
        
        return true;
    }

    public void display() {
        
    }
}
// displayStartProgramView() {
//  endOfView = false
//  DO
// inputs = getInputs()
// IF no inputs were entered OR the first input is Q
//  RETURN
// ENDIF
// endOfView = doAction(inputs)
// WHILE endOfView != true








//        displayStartProgramView(){
//        
//       
//        boolean endOfView = false;
//        do{//        doAction(String[] inputs){
//
//     
//            String[] input = this.getInput();
//           if (input == null || character.length < 1){
//            System.out.println("Error Message" + input + "is invalid");
//            } 
//        
//        
//        private boolean doAction(String[] input){
//            
//        }
//}
////endOfView = doAction(inputs)
//        while (endOfView != true){
//            
//        }
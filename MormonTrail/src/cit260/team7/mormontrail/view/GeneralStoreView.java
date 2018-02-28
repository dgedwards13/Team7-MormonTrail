/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;

/**
 *
 * @author dgedw
 */
public class GeneralStoreView {
    public GeneralStoreView(){
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
            System.out.println("==  Welcome to the General Store! We have all the supplies that you may need  ==");
            System.out.println("==   for your journey! Stock up now, because you never know when you'll get   ==");
            System.out.println("==                              another chance!                               ==");
            System.out.println("================================================================================");
            System.out.println("");
            System.out.println("");
            System.out.println("1 | View or Sell Current Supplies");
            System.out.println("2 | Buy Supplies");
            System.out.println("3 | Exit Store");

            String in = keyboard.nextLine();
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3");
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
                ViewSuppliesView viewSuppliesView = new ViewSuppliesView();
                viewSuppliesView.display();
                break;
            case "2":
                BuySuppliesView buySuppliesView = new BuySuppliesView();
                buySuppliesView.display();
                break;
            case "3":
                FortTownSceneView fortTownSceneView = new FortTownSceneView();
                fortTownSceneView.display();
                break;
        }
        return true;
    }
    
    public void display() {
        
    }
}


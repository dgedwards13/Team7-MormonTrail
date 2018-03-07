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
    private String menu;
    private int numOfInputs;
    
    public GeneralStoreView(){
        this.menu = "\n";
         boolean endOfView = false;
          do{
              System.out.println(this.buildMenu());
              String[] inputs = this.getInputs(numOfInputs);
                      if (inputs == null || inputs.length < 1){
                          return;
                      }
                      endOfView = doAction(inputs);
          }
          while (endOfView != true);
    }
    
    private String buildMenu() {
        menu += "\n================================================================================";
        menu += "\n==                               GENERAL STORE                                ==";
        menu += "\n==                                                                            ==";
        menu += "\n==  Welcome to the General Store! We have all the supplies that you may need  ==";
        menu += "\n==   for your journey! Stock up now, because you never know when you'll get   ==";
        menu += "\n==                              another chance!                               ==";
        menu += "\n================================================================================";
        menu += "\n\n";
        menu += "\n1 | View or Sell Current Supplies";
        menu += "\n2 | Buy Supplies";
        menu += "\n3 | Exit Store";
        numOfInputs = 3;
        return menu;
    }
    
    private String[] getInputs(int numOfInputs) {
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {
            
            Scanner keyboard = new Scanner(System.in);

            String in = keyboard.nextLine();
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            int convert = Integer.parseInt(in);
            boolean v = convert > 0 && convert < numOfInputs + 1;
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


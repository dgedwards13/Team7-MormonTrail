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
    private String menu = "\n"
          + "================================================================================"
        + "\n==                               GENERAL STORE                                =="
        + "\n==                                                                            =="
        + "\n==  Welcome to the General Store! We have all the supplies that you may need  =="
        + "\n==   for your journey! Stock up now, because you never know when you'll get   =="
        + "\n==                              another chance!                               =="
        + "\n================================================================================"
        + "\n\n"
        + "\n1 | View or Sell Current Supplies"
        + "\n2 | Buy Supplies"
        + "\n3 | Exit Store";
    private int numOfInputs = 3;
    
    public GeneralStoreView(){
         boolean endOfView = false;
          do{
              System.out.println(menu);
              String[] inputs = this.getInputs(numOfInputs);
                      if (inputs == null || inputs.length < 1){
                          return;
                      }
                      endOfView = doAction(inputs);
          }
          while (endOfView != true);
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


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;
import cit260.team7.mormontrail.control.HotelControl;
import cit260.team7.mormontrail.model.Character;
/**
 *
 * @author Savannah
 */

public class HotelSceneView{
    public HotelSceneView(){
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
            
            System.out.println("=================================================================================");
            System.out.println("==                            Welcome to the Hotel!                            ==");
            System.out.println("==                    Here, you can pick up another traveler.                  ==");
            System.out.println("=================================================================================");
        
        System.out.println("1 | List of available characters");
            System.out.println("2 | Exit hotel");
    
            String in = keyboard.nextLine();
            
            in = in.trim();
            
            if(in.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            boolean v = in.equalsIgnoreCase("1") || in.equalsIgnoreCase("2") || in.equalsIgnoreCase("3");
                    
            if(v != true) {
                System.out.println("The number entered must correlate with the menu items.");
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
                System.out.println("These are the characters who are willing to journey with you!");
                Character[] characterArray = HotelControl.getCharacter();
                int i = 1;
                for (Character ch : characterArray) {
                        System.out.println(i + " | " + ch.getName() + "\n\t Character Money: " + ch.getMoney() + "\n\t Character Hunting Skill: " + ch.getHuntingSkill() + "\n\t Character Gathering Skill" + ch.getGatheringSkill() + "\n\t Character Stamina: " + ch.getDailyStaminaDraw() + "\n\t Character Health: " + ch.getCurrentHealth());
                        i++;
                    }
                break;
            case "2":
                FortTownSceneView fortTownSceneView = new FortTownSceneView();
                fortTownSceneView.display();
                break;
        }
        return true;
    }
    public void display() {
        
    }
}

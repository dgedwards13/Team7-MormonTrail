/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.HotelControl;
import cit260.team7.mormontrail.model.Character;
/**
 *
 * @author Savannah
 */

public class HotelSceneView extends View {
    public HotelSceneView(){
        super("\n"
            + "\n================================================================================="
            + "\n==                            Welcome to the Hotel!                            =="
            + "\n==                                                                             =="
            + "\n==                    Here, you can pick up another traveler.                  =="
            + "\n================================================================================="
            + "\n\n1 | List of available travelers"
            + "\n2 | Exit hotel", 2, true
        );
    }
@Override
    public boolean doAction(String inputs) {
        
        switch(inputs) {
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.HotelControl;
import cit260.team7.mormontrail.exception.HotelException;
import cit260.team7.mormontrail.model.Character;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Shaw-Laptop
 */
public class CharacterPrintView extends View {

    public CharacterPrintView() throws HotelException {
        super("\n"
                + "\n================================================================================"
                + "\n==                    Printing Character List                                 =="
                + "\n================================================================================"
                + "\nEnter File Name"
                + "\nType \"return\" to Return to Previous Menu", 0, false);
    }

    @Override
    public boolean doAction(String inputs) {
        HotelSceneView hotel = new HotelSceneView();
        switch (inputs) {
            case "return":
                    hotel.display();
                break;
            default:
                try {
                    PrintWriter writer = new PrintWriter(inputs);
                    writer.println("Characters");
                    writer.println("\n\n");
                    writer.println("Character Name | Money | Hunting/Gathering Skill | Daily Stamina Draw | Health Total");
                    Character[] characterArray = HotelControl.getCharacter();
                    for (int i = 0; i < characterArray.length; i++) {
                        writer.println("\n" + characterArray[i].getName() + " | " + characterArray[i].getMoney() + " | " + characterArray[i].getHuntingSkill() + "/" + characterArray[i].getGatheringSkill() + " | " + characterArray[i].getDailyStaminaDraw() + " | " + characterArray[i].getCurrentHealth());
                    }
                    writer.close();
                    System.out.println("Character list has been printed to " + inputs + " successfully.");
                    hotel.display();
                } catch (FileNotFoundException e) {
                    System.out.println("An Error Occured:" + e.getMessage());
                    return false;
                }
        }
        return true;

    }

}

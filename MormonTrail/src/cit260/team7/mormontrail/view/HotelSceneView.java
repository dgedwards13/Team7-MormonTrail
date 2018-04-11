/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.HotelControl;
import cit260.team7.mormontrail.exception.HotelException;
import cit260.team7.mormontrail.exception.LocationException;
import cit260.team7.mormontrail.model.Character;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Savannah
 */
public class HotelSceneView extends View {

    public HotelSceneView() {
        super("\n"
                + "\n================================================================================="
                + "\n==                            Welcome to the Hotel!                            =="
                + "\n==                                                                             =="
                + "\n==                    Here, you can pick up another traveler.                  =="
                + "\n================================================================================="
                + "\n\n1 | List of available travelers"
                + "\n2 | Exit hotel"
                + "\n3 | Print Character List", 3, true
        );
    }

    public static PrintWriter writeFile(String fileName) {
        try {
            File characterStatus = new File(fileName);
            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(characterStatus)));
        } catch (IOException e) {
            System.out.println("Failed to Write" + "\n Error code:" + e.getMessage());
            System.exit(0);
//            return false;
        }
//        this.console.println("File Successfully Written");
        return null;
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                this.console.println("These are the characters who are willing to journey with you!");
                Character[] characterArray = HotelControl.getCharacter();
                int i = 1;
                for (Character ch : characterArray) {
                    this.console.println(i + " | " + ch.getName() + "\n\t Character Money: " + ch.getMoney() + "\n\t Character Hunting Skill: " + ch.getHuntingSkill() + "\n\t Character Gathering Skill" + ch.getGatheringSkill() + "\n\t Character Stamina: " + ch.getDailyStaminaDraw() + "\n\t Character Health: " + ch.getCurrentHealth());
                    i++;
                }
                break;
            case "2":
                FortTownSceneView fortTownSceneView = null;
                try {
                    fortTownSceneView = new FortTownSceneView();
                } catch (LocationException ex) {
                    this.console.println(ex.getMessage());
                }
                fortTownSceneView.display();
                break;
            case "3":
                try {
                    CharacterPrintView characterPrintView = new CharacterPrintView();
                    characterPrintView.display();
                } catch (HotelException e) {
                    System.out.println("An Error Occured:" + e.getMessage());
                }

        }
        return true;
    }
}

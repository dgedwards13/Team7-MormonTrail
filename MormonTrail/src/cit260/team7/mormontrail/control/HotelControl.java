/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.exception.HotelException;
import cit260.team7.mormontrail.model.Character;

/**
 *
 * @author Savannah, rherrerajr
 */
public class HotelControl {

    static Character characterSusan;
    static Character characterSam;
    static Character characterJoseph;
    static Character characterRicardo;
    static Character characterSavannah;
    static Character characterDaniel;
    static Character characterAstley;
    static Character characterRachel;

    public static void setCharacter() {
        characterSusan = new Character("Susan", 10, 5, 400, 2, 2);
        characterSam = new Character("Sam", 10, 6, 600, 2, 4);
        characterJoseph = new Character("Joseph", 10, 7, 100, 2, 3);
        characterRicardo = new Character("Ricardo", 10, 8, 680, 2, 6);
        characterSavannah = new Character("Savannah", 10, 8, 680, 2, 1);
        characterDaniel = new Character("Daniel", 10, 8, 680, 2, 5);
        characterAstley = new Character("Astley", 10, 8, 680, 2, 7);
        characterRachel = new Character("Rachel", 10, 5, 500, 2, 8);
    }

    public static Character[] getCharacter() {

        Character[] characterArray = new Character[8];

        characterArray[0] = characterSusan;
        characterArray[1] = characterSam;
        characterArray[2] = characterJoseph;
        characterArray[3] = characterRicardo;
        characterArray[4] = characterSavannah;
        characterArray[5] = characterDaniel;
        characterArray[6] = characterAstley;
        characterArray[7] = characterRachel;

        return characterArray;
    }

    public static String characterHealth() throws HotelException {
        Character[] characterArray = HotelControl.getCharacter();
        String list = "";
        for (int i = 0; i < characterArray.length; i++) {
            for (int j = i + 1; j < characterArray.length; j++) {
                Character tmp;
                if (characterArray[i].getCurrentHealth() > characterArray[j].getCurrentHealth()) {
                    tmp = characterArray[i];
                    characterArray[i] = characterArray[j];
                    characterArray[j] = tmp;
                    // throw statement causing error on Run
                    /*throw new HotelException("We were unable to process the request.");*/
                }

            }
        }
        for (Character characterArray1 : characterArray) {
            list += "\n" + characterArray1.getName() + " " + characterArray1.getCurrentHealth();
        }
        return list;
    }
}

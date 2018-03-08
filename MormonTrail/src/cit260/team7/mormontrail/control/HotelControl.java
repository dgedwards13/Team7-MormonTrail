/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.Character;
/**
 *
 * @author Savannah
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
            
    public static void setCharacter(){
        Character characterSusan = new Character("Susan", 10, 5, 400, 2, 2);
        Character characterSam = new Character("Sam", 10, 6, 600, 2, 2);
        Character characterJoseph = new Character("Joseph", 10, 7, 100, 2, 2);
        Character characterRicardo = new Character("Ricardo", 10, 8, 680, 2, 2);
        Character characterSavannah = new Character("Savannah", 10, 8, 680, 2, 2);
        Character characterDaniel = new Character("Daniel", 10, 8, 680, 2, 2);
        Character characterAstley = new Character("Astley", 10, 8, 680, 2, 2);
        Character characterRachel = new Character("Rachel", 10, 5, 500, 2, 2);
    }
    
    public static Character[] getCharacter(){
 
        Character[] CharacterArray = new Character[8];

        CharacterArray[0] = characterSusan;
        CharacterArray[1] = characterSam;
        CharacterArray[2] = characterJoseph;
        CharacterArray[3] = characterRicardo;
        CharacterArray[4] = characterSavannah;
        CharacterArray[5] = characterDaniel;
        CharacterArray[6] = characterAstley;
        CharacterArray[7] = characterRachel;
        
        return CharacterArray;
        
    }
}

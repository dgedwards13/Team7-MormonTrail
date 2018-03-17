/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.Character;
import java.lang.reflect.Array;
import java.util.Arrays;
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
        characterSusan = new Character("Susan", 10, 5, 400, 2, 2);
        characterSam = new Character("Sam", 10, 6, 600, 2, 2);
        characterJoseph = new Character("Joseph", 10, 7, 100, 2, 2);
        characterRicardo = new Character("Ricardo", 10, 8, 680, 2, 2);
        characterSavannah = new Character("Savannah", 10, 8, 680, 2, 2);
        characterDaniel = new Character("Daniel", 10, 8, 680, 2, 2);
        characterAstley = new Character("Astley", 10, 8, 680, 2, 2);
        characterRachel = new Character("Rachel", 10, 5, 500, 2, 2);
    }
    
    public static Character[] getCharacter(){
 
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
    
    public static String characterHealth() {
        
        Character[] characterArray = getCharacter();
        String status = "";
        for (Object player : characterArray){
            return status + player;
        }
        Arrays.sort(characterArray);
        
        for (Object player : characterArray){
            return status + player;
        }
//        Character[] characterArray = getCharacter(); 
//        String status = "";    
////        Arrays.sort(characterArray);
//        for( int i = 0; i < characterArray.length; i++){
//          status += "\n" + characterArray[i].getName() + "'s health is  " + characterArray[i].getCurrentHealth();
//        }
       return "\n" + status;
    }
}
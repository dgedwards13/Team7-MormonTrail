/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

/**
 *
 * @author dgedw
 */

import cit260.team7.mormontrail.model.Character;
import cit260.team7.mormontrail.model.Event;
import cit260.team7.mormontrail.model.RegularSceneType;

public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Character characterOne = new Character();
        
         characterOne.setName("Savannah Fish");
         characterOne.setMoney(5.00);
         
         String characterOneName = characterOne.getName();
         double characterOneMoney = characterOne.getMoney();
         
         System.out.println(characterOne.toString());
         
         Event eventOne = new Event();
         
         eventOne.setDescription("Heavy rain fall");
         eventOne.setHealthImpact(20);
         
         String eventOneDescription = eventOne.getDescription();
         double eventOneHealthImpact = eventOne.getHealthImpact();
         
         System.out.println(eventOne.toString());
         
         
         RegularSceneType regularSceneTypeOne = new  RegularSceneType();
         
         regularSceneTypeOne.setDescription("rock fall on trail");
         regularSceneTypeOne.setName("River crossing");
         regularSceneTypeOne.setCoordinates(10);
         
         String regularSceneTypeOneDescription = regularSceneTypeOne.getDescription();
         String regularSceneTypeOneName = regularSceneTypeOne.getName(); 
         double regularSceneTypeOneCoordinates = regularSceneTypeOne.getCoordinates();
         
         System.out.println(regularSceneTypeOne.toString());
    } 
      
}

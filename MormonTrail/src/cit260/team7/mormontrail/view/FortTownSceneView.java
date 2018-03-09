/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;
import cit260.team7.mormontrail.control.LocationControl;

/**
 *
 * @author dgedw
 * @author Savannah
 */
public class FortTownSceneView extends View {
    
    public FortTownSceneView(){
        super("\n"
                +"\n================================================================================"
                +"\n" + LocationControl.fortTown()
                +"\n================================================================================",4, true
                );
    }
    
@Override
        public boolean doAction(String inputs) {
            String fortTown = LocationControl.fortTown();
            if (fortTown.equals("town")){
               switch(inputs) {
                case "1":
                    HotelSceneView hotelSceneView = new HotelSceneView();
                    hotelSceneView.display();
                    break;
                case "2":
                    GeneralStoreView generalstoreview = new GeneralStoreView();
                    generalstoreview.display();
                    break;
                case "3":
                    DailyTrailStopSceneView dailyTrailStopSceneView = new DailyTrailStopSceneView();
                    dailyTrailStopSceneView.display();
                    break;
                case "4":
                    GamePlayView gamePlayView = new GamePlayView();
                    gamePlayView.display();
                    break;
                 }
            } else if (fortTown.equals("fort")){
                switch(inputs){
                    case "1":
                        GeneralStoreView generalstoreview = new GeneralStoreView();
                        generalstoreview.display();         
                        break;
                    case "2":
                        DailyTrailStopSceneView dailyTrailStopSceneView = new DailyTrailStopSceneView();
                        dailyTrailStopSceneView.display();  
                        break;
                    case "3":
                        GamePlayView gamePlayView = new GamePlayView();
                        gamePlayView.display();             
                        break;
                            
                }
            }
            return true;
        }
}
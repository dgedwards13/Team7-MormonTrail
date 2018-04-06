/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.HotelControl;
import cit260.team7.mormontrail.exception.HotelException;
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
 * @author rherrerajr
 */
public class PrintStatusView extends View {
    public PrintStatusView() throws HotelException {

        super("\n"
                + "\n================================================================================"
                + "\n==                           Print Health Status                              =="
                + "\n================================================================================"
                + "\n  Printing Health Status"
                + "\n1 return to game", 1, true);
    }

    public static PrintWriter setFileName(String filePath) {
        try {

            
            FileWriter fw = new FileWriter("healthStatus.txt");
    Character[] characterArray = HotelControl.getCharacter();

    for (int i = 0; i < characterArray.length; i++) {
      fw.write(characterArray[i].getName()+ " " + characterArray[i].getCurrentHealth() + "\n");
    }
    fw.close();
            
            
            
            
            File characterStatus = new File(filePath);

            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(characterStatus)));

        } catch (IOException e) {
            System.out.println("Error");
            
            PrintStatusView printStatusView = null;
            try {
                printStatusView = new PrintStatusView();
            } catch (HotelException ex) {
                Logger.getLogger(PrintStatusView.class.getName()).log(Level.SEVERE, null, ex);
            }
            printStatusView.display();

        }

        return null;

    }

    @Override
    public boolean doAction(String inputs) {

        Character[] characterArray = HotelControl.getCharacter();
        
        PrintWriter statusOutput = setFileName("characterHealthStatus.txt");

        for (Character status : characterArray) {
        }
        GamePlayView gamePlayView = new GamePlayView();
        gamePlayView.display();
        
        return true;
    }
}
//
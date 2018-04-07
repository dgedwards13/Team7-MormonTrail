/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.HotelControl;
import cit260.team7.mormontrail.exception.HotelException;
import cit260.team7.mormontrail.model.Character;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
                + "\n1 Name File and Exit to Menu"
                + "\n2 Cancel and Exit to Menu", 2, true);
    }

    public static PrintWriter setFileName(String filePath) {
        try {

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String input = buffer.readLine();
            FileWriter fw = new FileWriter(input);
            Character[] characterArray = HotelControl.getCharacter();

            for (int i = 0; i < characterArray.length; i++) {
                fw.write(characterArray[i].getName() + " " + characterArray[i].getCurrentHealth() + "\n");
            }
            fw.close();

        } catch (IOException e) {
            System.out.println("Error");

            PrintStatusView printStatusView = null;
            try {
                printStatusView = new PrintStatusView();
            } catch (HotelException ex) {
            }
            printStatusView.display();

        }

        return null;

    }

    @Override
    public boolean doAction(String inputs) {
        
        switch (inputs) {
            case "1":
                 this.console.println("Enter file name");
                 PrintWriter statusOutput = setFileName("printedHealthStatus.txt");
                 GamePlayView gamePlayView = new GamePlayView();
                 gamePlayView.display();
                break;
            case "2":
                GamePlayView gamePlayView1 = new GamePlayView();
                gamePlayView1.display();
                break;

    }
        return true;
}
}//

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.InventoryControl;
import cit260.team7.mormontrail.control.HotelControl;
import java.io.IOException;

/**
 *
 * @author Shaw-Laptop
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n================================================================================"
                + "\n==                                 Main Menu                                  =="
                + "\n================================================================================"
                + "\n\n1| Start game"
                + "\n2| Help Menu"
                + "\n3| Save Game"
                + "\n4| Load Game"
                + "\n5| Exit", 5, true);
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                InventoryControl.setInventory();
                HotelControl.setCharacter();
                GamePlayView gamePlayView = new GamePlayView();
                gamePlayView.display();
                break;
            case "2":
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "3":
                SaveGameView saveGameView = new SaveGameView();
                saveGameView.display();
                break;
            case "4":
                LoadGameView loadGameView = new LoadGameView();
                loadGameView.display();
                break;
            case "5":
                String in = "";
                boolean valid = false;
                String selection = null;
                while (valid == false) {
                    this.console.println("Are you sure you want to exit? (y/n)");
                    try {
                        selection = this.keyboard.readLine();
                    } catch (IOException e) {
                        this.console.println("error");
                    }

//                    selection = keyboard.nextLine();
                    selection = selection.trim();

                    if (selection.length() < 1) {
                        this.console.println("You must enter a non-blank value");
                        continue;
                    }

                    boolean v = selection.equalsIgnoreCase("y") || selection.equalsIgnoreCase("n");

                    if (v != true) {
                        this.console.println("You must enter 'Y' or 'N'");
                        continue;
                    }

                    valid = true;
                }
                if (selection.equalsIgnoreCase("y")) {
                    this.console.println("Thank you for playing!");
                    System.exit(0);
                } else {
                    MainMenuView mainMenuView = new MainMenuView();
                    mainMenuView.display();
                }
                break;

        }

        return true;
    }

}

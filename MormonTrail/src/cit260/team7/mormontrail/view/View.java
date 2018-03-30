/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import mormontrail.MormonTrail;

/**
 *
 * @author Shaw-Laptop
 */
public abstract class View implements ViewInterface {
   

    protected String displayMessage;
    
    protected final BufferedReader keyboard = MormonTrail.getInFile();
    protected final PrintWriter console = MormonTrail.getOutFile();
    
    protected int numInputs;
    protected boolean isMenu;

    public View() {

    }

    public View(String message, int number, boolean menu) {
        this.displayMessage = message;
        this.numInputs = number;
        this.isMenu = menu;
    }

    @Override
    public void display() {

        boolean endOfView = false;
        do {
            String inputs = this.getInputs(numInputs);
            if (inputs == null || inputs.length() < 1) {
                return;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);
    }

    @Override
    public String getInputs(int numInputs) {
        String inputs = "";
        boolean valid = false;
        String selection = null;

        while (valid == false) {
            
            try {
                selection = this.keyboard.readLine();
            } catch (IOException e) {
                this.console.println("error" + e.getMessage());
            }

//            Scanner keyboard = new Scanner(System.in);

            this.console.println(displayMessage);
//            String in = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                this.console.println("You must enter a non-blank value");
                continue;
            }
            if (isMenu) {
                try {
                    int convert = Integer.parseInt(selection);
                    boolean v = convert > 0 && convert < numInputs + 1;
                    if (v != true) {
                        this.console.println("The number entered must correlate with the available options.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    this.console.println("\nYou must enter a valid menu number");
                    continue;
                }
            }

            inputs = selection;
            valid = true;
        }
        return inputs;
    }
}

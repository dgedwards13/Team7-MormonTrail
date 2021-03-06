/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

/**
 *
 * @author dgedw
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n================================================================================"
                + "\n==                                 Help Menu                                  =="
                + "\n================================================================================"
                + "\n\n1 | Game Objective"
                + "\n2 | How to Move"
                + "\n3 | Tips"
                + "\n4 | Return to Previous Menu", 4, true);
    }

    @Override

    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                this.console.println("Objective");
                this.console.println("You are a Mormon pioneer and will begin your journey in Nauvoo, Illinois. Your destination is Salt Lake Valley.");
                this.console.println("Your party will use your resources to purchase supplies and tools for your adventure. Any remaining money can be used along the way.");
                this.console.println("Your survival depends on your skills, traits and decisions  as you face random events as well as obstacles. Success means reaching Salt Lake Valley.");
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "2":
                this.console.println("How to Move");
                this.console.println("Follow the on screen prompts and you will continue your journey to Zion.");
                helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "3":
                this.console.println("Tips");
                this.console.println("Tip 1");
                this.console.println("Tip 2");
                this.console.println("Tip 3");
                this.console.println("Tip 4");
                helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case "4":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
        }

        return true;
    }

}

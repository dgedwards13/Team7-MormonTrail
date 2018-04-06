/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;
import cit260.team7.mormontrail.control.EventControl;
import cit260.team7.mormontrail.exception.EventException;
import cit260.team7.mormontrail.model.Event;
import java.io.*;
import java.lang.String;

/**
 *
 * @author Savannah
 */
public class EventsPrintView extends View{
    
    public EventsPrintView() throws EventException {
        super("\n"
                + "\n================================================================================"
                + "\n==                    Printing List of all Possible Events                    =="
                + "\n================================================================================"
                + "\n\n1 | Print List of Events"
                , 1, true);
    }
    

        public static PrintWriter createFile(String fileName){
        try{
            FileWriter fw = new FileWriter("savListEvents.txt");
            Event[] eventArray = EventControl.getEvents();
            
            for (int i=0; i < eventArray.length; i++) {
                fw.write("{ Event: " + eventArray[i].getDescription() + " Character Impact: " + eventArray[i].getCharImpact() + " Character Health Impact: " + eventArray[i].getCharHealthImpact() + " Oxen Health Impact: " + eventArray[i].getOxenHealthImpact() + " Inventory Impact: " + eventArray[i].getInventoryImpact() + " Inventory Amount Impact: " + eventArray[i].getInventoryAmountImpact() + "Distance Impact: " + eventArray[i].getDistanceImpact() + " Pace Impact: " + eventArray[i].getPaceImpact() + " }\n\n\n");
            }
            fw.close();
            
            File listOfEvents = new File(fileName);
            
            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfEvents)));
            System.out.println("File Successfully Written");
            
        }catch(IOException e){   
                System.out.println("Failed to Write" + "\n Error code:" + e.getMessage());

                EventsPrintView eventsPrintView = null;
                try {
                    eventsPrintView = new EventsPrintView();
                } catch (EventException ex){
                    System.out.println(ex.getMessage());
                }
        }

        return null;
    }
        
    @Override
    public boolean doAction(String inputs){
        
        Event[] eventArray = EventControl.getEvents();
        PrintWriter eventOutput = createFile("eventfile.txt");
        
        GamePlayView gamePlayView = new GamePlayView();
        gamePlayView.display();

                return true;
//            }catch(EventException e){
//                this.console.println("Error " + e.getMessage());
//            }
}
}
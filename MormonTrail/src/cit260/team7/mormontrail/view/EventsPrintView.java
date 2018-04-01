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
    
    public EventsPrintView() {
        super("================================================================================"
                + "==                                 Events                                     =="
                + "==                                                                            =="
                + "================================================================================"
                + "\n\n1 | Print List of Events"
                , 1, true);
    }
    

        public static PrintWriter createFile(String fileName){
        try{
            File listOfEvents = new File(fileName);
            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfEvents)));
        }catch(IOException e){   
            System.out.println("Failed to Write" + "\n Error code:" + e.getMessage());
            System.exit(0);
//            return false;
        }
//        this.console.println("File Successfully Written");
        return null;
    }
        
    
    public boolean doAction(String inputs){
        
                 PrintWriter eventOutput = createFile("/cit260/team7/mormontrail/printpages/eventlogfile.txt");

                return false;
//            }catch(EventException e){
//                this.console.println("Error " + e.getMessage());
//            }
}
}
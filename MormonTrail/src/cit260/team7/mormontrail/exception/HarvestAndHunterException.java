/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.exception;

/**
 *
 * @author Savannah
 */
public class HarvestAndHunterException extends Exception{

    public HarvestAndHunterException() {
    }

    public HarvestAndHunterException(String message) {
        super(message);
    }

    public HarvestAndHunterException(String message, Throwable cause) {
        super(message, cause);
    }

    public HarvestAndHunterException(Throwable cause) {
        super(cause);
    }

    public HarvestAndHunterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

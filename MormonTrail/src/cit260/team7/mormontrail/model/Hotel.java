/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Astley Shaw, Savannah Fish, Daniel Edwards
 */
public class Hotel implements Serializable{
    
    private String availableCharater;
    
    public Hotel(){
        
    }

    public String getAvailableCharater() {
        return availableCharater;
    }

    public void setAvailableCharater(String availableCharater) {
        this.availableCharater = availableCharater;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.availableCharater);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.availableCharater, other.availableCharater)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "availableCharater=" + availableCharater + '}';
    }
    
    
}

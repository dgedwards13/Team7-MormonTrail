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
public class FortTown implements Serializable{
    

    private boolean hasHotel;
    
    public FortTown(){
        
    }

    public boolean isHasHotel() {
        return hasHotel;
    }

    public void setHasHotel(boolean hasHotel) {
        this.hasHotel = hasHotel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.hasHotel ? 1 : 0);
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
        final FortTown other = (FortTown) obj;
        if (this.hasHotel != other.hasHotel) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FortTown{" + "hasHotel=" + hasHotel + '}';
    }
    
    
}

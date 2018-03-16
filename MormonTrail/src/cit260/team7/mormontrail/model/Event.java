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
public class Event implements Serializable{
    
    private double healthImpact;
    private String description;
    
    
    
    public Event(){
        
    }

    public double getHealthImpact() {
        return healthImpact;
    }

    public void setHealthImpact(double healthImpact) {
        this.healthImpact = healthImpact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.healthImpact) ^ (Double.doubleToLongBits(this.healthImpact) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.description);
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
        final Event other = (Event) obj;
        if (Double.doubleToLongBits(this.healthImpact) != Double.doubleToLongBits(other.healthImpact)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Event{" + "healthImpact=" + healthImpact + ", description=" + description + '}';
    }
    
    
}

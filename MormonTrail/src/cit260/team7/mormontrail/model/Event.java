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
public class Event implements Serializable {

    private String description;
    private String charImpact;
    private double charHealthImpact;
    private double oxenHealthImpact;
    private String inventoryImpact;
    private double inventoryAmountImpact;
    private int distanceImpact;
    private double paceImpact;

    public Event() {

    }

    public Event(String d, String cI, double cHI, double oHI, String iI, double iAI, int dI, double pI) {
        this.description = d;
        this.charImpact = cI;
        this.charHealthImpact = cHI;
        this.oxenHealthImpact = oHI;
        this.inventoryImpact = iI;
        this.inventoryAmountImpact = iAI;
        this.distanceImpact = dI;
        this.paceImpact = pI;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCharImpact() {
        return charImpact;
    }

    public void setCharImpact(String charImpact) {
        this.charImpact = charImpact;
    }

    public double getCharHealthImpact() {
        return charHealthImpact;
    }

    public void setCharHealthImpact(double charHealthImpact) {
        this.charHealthImpact = charHealthImpact;
    }

    public double getOxenHealthImpact() {
        return oxenHealthImpact;
    }

    public void setOxenHealthImpact(double oxenHealthImpact) {
        this.oxenHealthImpact = oxenHealthImpact;
    }

    public String getInventoryImpact() {
        return inventoryImpact;
    }

    public void setInventoryImpact(String inventoryImpact) {
        this.inventoryImpact = inventoryImpact;
    }

    public double getInventoryAmountImpact() {
        return inventoryAmountImpact;
    }

    public void setInventoryAmountImpact(double inventoryAmountImpact) {
        this.inventoryAmountImpact = inventoryAmountImpact;
    }

    public int getDistanceImpact() {
        return distanceImpact;
    }

    public void setDistanceImpact(int distanceImpact) {
        this.distanceImpact = distanceImpact;
    }

    public double getPaceImpact() {
        return paceImpact;
    }

    public void setPaceImpact(double paceImpact) {
        this.paceImpact = paceImpact;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.charImpact);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.charHealthImpact) ^ (Double.doubleToLongBits(this.charHealthImpact) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.oxenHealthImpact) ^ (Double.doubleToLongBits(this.oxenHealthImpact) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.inventoryImpact);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.inventoryAmountImpact) ^ (Double.doubleToLongBits(this.inventoryAmountImpact) >>> 32));
        hash = 23 * hash + this.distanceImpact;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.paceImpact) ^ (Double.doubleToLongBits(this.paceImpact) >>> 32));
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
        if (Double.doubleToLongBits(this.charHealthImpact) != Double.doubleToLongBits(other.charHealthImpact)) {
            return false;
        }
        if (Double.doubleToLongBits(this.oxenHealthImpact) != Double.doubleToLongBits(other.oxenHealthImpact)) {
            return false;
        }
        if (Double.doubleToLongBits(this.inventoryAmountImpact) != Double.doubleToLongBits(other.inventoryAmountImpact)) {
            return false;
        }
        if (this.distanceImpact != other.distanceImpact) {
            return false;
        }
        if (Double.doubleToLongBits(this.paceImpact) != Double.doubleToLongBits(other.paceImpact)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.charImpact, other.charImpact)) {
            return false;
        }
        if (!Objects.equals(this.inventoryImpact, other.inventoryImpact)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Event{" + "description=" + description + ", charImpact=" + charImpact + ", charHealthImpact=" + charHealthImpact + ", oxenHealthImpact=" + oxenHealthImpact + ", inventoryImpact=" + inventoryImpact + ", inventoryAmountImpact=" + inventoryAmountImpact + ", distanceImpact=" + distanceImpact + ", paceImpact=" + paceImpact + '}';
    }

}

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
public class TrailStopScene extends RegularSceneType implements Serializable {

    private boolean hasNearbyTown;
    private String nearbyTownName;
    private boolean hasNearbyFort;
    private String nearbyFortName;

    public TrailStopScene() {

    }

    public boolean isHasNearbyTown() {
        return hasNearbyTown;
    }

    public void setHasNearbyTown(boolean hasNearbyTown) {
        this.hasNearbyTown = hasNearbyTown;
    }

    public String getNearbyTownName() {
        return nearbyTownName;
    }

    public void setNearbyTownName(String nearbyTownName) {
        this.nearbyTownName = nearbyTownName;
    }

    public boolean isHasNearbyFort() {
        return hasNearbyFort;
    }

    public void setHasNearbyFort(boolean hasNearbyFort) {
        this.hasNearbyFort = hasNearbyFort;
    }

    public String getNearbyFortName() {
        return nearbyFortName;
    }

    public void setNearbyFortName(String nearbyFortName) {
        this.nearbyFortName = nearbyFortName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.hasNearbyTown ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.nearbyTownName);
        hash = 47 * hash + (this.hasNearbyFort ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.nearbyFortName);
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
        final TrailStopScene other = (TrailStopScene) obj;
        if (this.hasNearbyTown != other.hasNearbyTown) {
            return false;
        }
        if (this.hasNearbyFort != other.hasNearbyFort) {
            return false;
        }
        if (!Objects.equals(this.nearbyTownName, other.nearbyTownName)) {
            return false;
        }
        if (!Objects.equals(this.nearbyFortName, other.nearbyFortName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrailStopScene{" + "hasNearbyTown=" + hasNearbyTown + ", nearbyTownName=" + nearbyTownName + ", hasNearbyFort=" + hasNearbyFort + ", nearbyFortName=" + nearbyFortName + '}';
    }

}

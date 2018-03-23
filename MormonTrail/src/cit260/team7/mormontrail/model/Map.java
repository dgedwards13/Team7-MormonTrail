/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Astley Shaw, Savannah Fish, Daniel Edwards
 */
public class Map implements Serializable {

    private ArrayList locations;

    public Map() {
    }

    public ArrayList getLocations() {
        return locations;
    }

    public void setLocations(ArrayList locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.locations);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + '}';
    }

}

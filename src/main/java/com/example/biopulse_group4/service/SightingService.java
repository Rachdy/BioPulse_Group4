package com.example.biopulse_group4.service;
import com.example.biopulse_group4.Model.Sighting;
//
import java.util.ArrayList;

public class SightingService {
    //List of Sightings
    private ArrayList<Sighting> sightings = new ArrayList<>();

    public boolean addSighting(Sighting sighting) {
        return true;
    }

    public ArrayList<Sighting> getAllSightings() {
        return sightings;
    }

    public ArrayList<Sighting> searchSightings(String location) {
        return sightings;
    }

    public ArrayList<Sighting> filterSightings() {
        return sightings;
    }

    public boolean updateSighting(Sighting sighting) {
        return true;
    }

    public boolean removeSighting(String sightingID) {
        return true;
    }
}
package com.example.biopulse_group4.service;

import com.example.biopulse_group4.Model.Sighting;
import java.time.LocalDate;
import java.util.ArrayList;

public class SightingService {

    // List of Sightings
    private ArrayList<Sighting> sightings = new ArrayList<>();

    public boolean addSighting(Sighting sighting) {
        if (sighting == null) {
            return false;
        }
        sightings.add(sighting);
        return true;
    }

    // Return all sightings
    public ArrayList<Sighting> getAllSightings() {
        return sightings;
    }

    public ArrayList<Sighting> searchSightings(String location) {
        return sightings;
    }

    public ArrayList<Sighting> searchSightingsByDate(LocalDate date) {
        return sightings;
    }

    public ArrayList<Sighting> searchSightingsByAnimalName(String animalName) {
        return sightings;
    }

    public ArrayList<Sighting> filterSightingsByCount(int minCount) {
        return sightings;
    }

    public ArrayList<Sighting> sortSightingsByDate() {
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
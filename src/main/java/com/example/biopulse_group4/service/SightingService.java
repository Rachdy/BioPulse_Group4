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
        ArrayList<Sighting> results = new ArrayList<>();
        for (int i=0; i< sightings.size();i++){
            Sighting foundSighting = sightings.get(i);
            if (foundSighting.getLocation().equals(location)){
                results.add(foundSighting);
            }
        }
    return results;
    }

    public ArrayList<Sighting> searchSightingsByDate(LocalDate date) {
        ArrayList<Sighting> results = new ArrayList<>();
        for (int i=0; i< sightings.size();i++){
            Sighting foundSighting = sightings.get(i);
            if (foundSighting.getDate().equals(date)){
                results.add(foundSighting);
            }
        }
        return results;
    }

    public ArrayList<Sighting> searchSightingsByAnimalName(String animalName) {

        ArrayList<Sighting> results = new ArrayList<>();

        for (int i = 0; i < sightings.size(); i++) {
            Sighting foundSighting = sightings.get(i);
            if (foundSighting.getAnimal().getSpeciesName().equals(animalName)) {
                results.add(foundSighting);
            }
        }

        return results;
    }

    //Salma/Reda ergänzen von public int getCount() {
    //    return count;
    //
    /*public ArrayList<Sighting> filterSightingsByCount(int minCount) {
        ArrayList<Sighting> results = new ArrayList<>();
        for (int i = 0; i < sightings.size();i++) {
            Sighting foundSighting = sightings.get(i);
            if (foundSighting.getCount() >= minCount) {
                results.add(foundSighting);
            }
        }
        return results;
    }
*/
    public ArrayList<Sighting> sortSightingsByDate() {
        for (int i = 0; i< sightings.size();i++){
            for ( int j = i+1 ; j < sightings.size();j++){
            Sighting firstSighting = sightings.get(i);
            Sighting secondSighting = sightings.get(j);
            if (firstSighting.getDate().isAfter((secondSighting.getDate()))) {
                sightings.set(i, secondSighting);
                sightings.set(j, firstSighting);
            }

            }
        }
        return sightings;
    }

    public ArrayList<Sighting> filterSightingsByConservationStatus(String status) {
    ArrayList<Sighting> results = new ArrayList<>();
        for (int i = 0; i< sightings.size();i++) {
        Sighting foundSighting = sightings.get(i);
        if (foundSighting.getAnimal().getConservationStatus().equals(status)) {
            results.add(foundSighting);
        }

    }
        return results;
    }

    public boolean updateSighting(Sighting sighting) {
        return true;
    }

    public boolean removeSighting(String sightingID) {
        return true;
    }
}
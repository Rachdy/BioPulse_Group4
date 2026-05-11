package com.example.biopulse_group4.Model;

import package com.biopulse.model;

import java.time.LocalDate;

public class Sighting {
    private String sightingID;
    private Animal animal;
    private LocalDate date;
    private String location;
    private int count; // Number of animals spotted
    private String additionalNotes;

    public Sighting(String sightingID, Animal animal, LocalDate date, String location, int count, String additionalNotes) {
        this.sightingID = sightingID;
        this.animal = animal;
        this.date = date;
        this.location = location;
        this.count = count;
        this.additionalNotes = additionalNotes;
    }

    public void displaySightingDetails() {
        System.out.println("--- Sighting Report [" + sightingID + "] ---");
        System.out.println("Date: " + date + " | Location: " + location);
        System.out.println("Count: " + count);

        // Polimorphism: calls the specific displayInfo() of Bird, Mammal, or Reptile
        if (animal != null) {
            animal.displayInfo();
        }

        if (additionalNotes != null && !additionalNotes.isEmpty()) {
            System.out.println("Notes: " + additionalNotes);
        }
        System.out.println("------------------------------");
    }

    // Getters and Setters (Optional but recommended)
    public Animal getAnimal() { return animal; }
    public String getLocation() { return location; }
    public LocalDate getDate() { return date; }
}
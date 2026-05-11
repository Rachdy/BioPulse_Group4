package com.example.biopulse_group4.Model;

public class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String speciesID, String speciesName, String taxonomicClass, String habitatRequirements, String conservationStatus, boolean isVenomous) {
        super(speciesID, speciesName, taxonomicClass, habitatRequirements, conservationStatus);
        this.isVenomous = isVenomous;
    }

    @Override
    public void displayInfo() {
        System.out.println("Reptile Name: " + speciesName + " | Venomous: " + (isVenomous ? "Yes" : "No"));
    }
}

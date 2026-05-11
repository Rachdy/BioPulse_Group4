package com.example.biopulse_group4.Model;

public class Reptile extends Animal {
    private boolean isVenomous;
    private String scaleType;

    public Reptile(String animalID, String speciesName, String taxoGroup, String habitat, String conservationStatus, boolean isVenomous, String scaleType) {
        super(animalID, speciesName, taxoGroup, habitat, conservationStatus);
        this.isVenomous = isVenomous;
        this.scaleType = scaleType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Reptile Name: " + speciesName + " | Venomous: " + isVenomous + " | Scales: " + scaleType);
    }

    // Getters
    public boolean isVenomous() { return isVenomous; }
    public String getScaleType() { return scaleType; }
}
package com.example.biopulse_group4.Model;

public class Mammal extends Animal {
    private String furType;

    public Mammal(String animalID, String speciesName, String taxoGroup, String habitat, String conservationStatus, String furType) {
        super(animalID, speciesName, taxoGroup, habitat, conservationStatus);
        this.furType = furType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mammal: " + speciesName + " | Fur: " + furType);
    }
}
package com.example.biopulse_group4.Model;

public class Mammal extends Animal {
    private boolean isLandBased;
    private String furType;

    public Mammal(String speciesID, String speciesName, String taxonomicClass, String habitatRequirements, String conservationStatus, boolean isLandBased, String furType) {
        super(speciesID, speciesName, taxonomicClass, habitatRequirements, conservationStatus);
        this.isLandBased = isLandBased;
        this.furType = furType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mammal Name: " + speciesName + " | Land Based: " + isLandBased + " | Fur: " + furType);
    }
}

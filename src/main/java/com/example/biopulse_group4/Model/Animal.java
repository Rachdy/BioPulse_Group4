package com.example.biopulse_group4.Model;

public abstract class Animal implements Trackable {
    protected String animalID;
    protected String speciesName;
    protected String taxoGroup;
    protected String habitat;
    protected String conservationStatus;

    public Animal(String animalID, String speciesName, String taxoGroup, String habitat, String conservationStatus) {
        this.animalID = animalID;
        this.speciesName = speciesName;
        this.taxoGroup = taxoGroup;
        this.habitat = habitat;
        this.conservationStatus = conservationStatus;
    }

    // Hadou huma l-mouhimin bach i-7yado l-errors dyal image_d11a3d.jpg
    @Override
    public String getAnimalID() {
        return animalID;
    }

    @Override
    public String getConservationStatus() {
        return conservationStatus;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public abstract void displayInfo();
}
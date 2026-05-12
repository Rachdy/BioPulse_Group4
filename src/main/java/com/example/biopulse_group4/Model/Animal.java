package com.example.biopulse_group4.Model;

public abstract class Animal {
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

    public abstract void displayInfo();
    public String getSpeciesName() { return speciesName; }
}
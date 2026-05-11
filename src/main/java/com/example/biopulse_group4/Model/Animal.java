package com.example.biopulse_group4.Model;

public abstract class Animal {
    protected String animalID;
    protected String speciesName;
    protected String taxoGroup;
    protected String habitat;
    protected String conservationStatus;

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public void setTaxoGroup(String taxoGroup) {
        this.taxoGroup = taxoGroup;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public Animal(String animalID, String speciesName, String taxoGroup, String habitat, String conservationStatus) {
        this.animalID = animalID;
        this.speciesName = speciesName;
        this.taxoGroup = taxoGroup;
        this.habitat = habitat;
        this.conservationStatus = conservationStatus;
    }

    public abstract void displayInfo();


    public String getAnimalID() {
        return animalID;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getTaxoGroup() {
        return taxoGroup;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }
}
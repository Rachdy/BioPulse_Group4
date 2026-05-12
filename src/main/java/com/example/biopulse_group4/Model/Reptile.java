package com.example.biopulse_group4.Model;

public class Reptile extends Animal {
    private String scaleType;

    public Reptile(String animalID, String speciesName, String taxoGroup, String habitat,String status, String scaleType) {
        super(animalID, speciesName, taxoGroup, habitat, status);
        this.scaleType = scaleType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Reptile: " + speciesName + " | Scales: " + scaleType);
    }
}
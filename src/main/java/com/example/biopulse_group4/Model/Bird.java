package com.example.biopulse_group4.Model;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(String animalID, String speciesName, String taxoGroup, String habitat,String status,  double wingSpan) {
        super(animalID, speciesName, taxoGroup, habitat, status);
        this.wingSpan = wingSpan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird: " + speciesName + " | Wingspan: " + wingSpan + "m");
    }
}
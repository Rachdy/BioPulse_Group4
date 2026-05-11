package com.example.biopulse_group4.Model;

public class Bird extends Animal {
    private double wingspan;
    private boolean isMigratory;

    public Bird(String speciesID, String speciesName, String taxonomicClass, String habitatRequirements, String conservationStatus, double wingspan, boolean isMigratory) {
        super(speciesID, speciesName, taxonomicClass, habitatRequirements, conservationStatus);
        this.wingspan = wingspan;
        this.isMigratory = isMigratory;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird Name: " + speciesName + " | Wingspan: " + wingspan + "m | Migratory: " + isMigratory);
    }
}
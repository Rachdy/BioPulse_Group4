package com.example.biopulse_group4;

import com.example.biopulse_group4.Model.*;
import java.time.LocalDate;

public class AppLauncher {
    public static void main(String[] args) {

        // 1. Creating animals
        Animal lion = new Mammal("M001", "African Lion", "Mammalia", "Savanna", "Vulnerable", true, "Golden");
        Animal eagle = new Bird("B001", "Golden Eagle", "Aves", "Mountains", "Least Concern", 2.2, true);
        Animal cobra = new Reptile("R001", "King Cobra", "Reptilia", "Forest", "Vulnerable", true, "Smooth");

        // 2. Creating sightings
        Sighting s1 = new Sighting("S001", lion, LocalDate.now(), "Kruger Park", 3, "Healthy pride.");
        Sighting s2 = new Sighting("S002", eagle, LocalDate.now(), "Atlas", 1, "High altitude.");
        Sighting s3 = new Sighting("S003", cobra, LocalDate.now(), "Vietnam", 1, "Near river.");

        // 3. Displaying details
        System.out.println("========== BIOPULSE TEST ==========");
        s1.displaySightingDetails();
        System.out.println();
        s2.displaySightingDetails();
        System.out.println();
        s3.displaySightingDetails();
        System.out.println("===================================");
    }
}
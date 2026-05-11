package com.example.biopulse_group4;

import com.example.biopulse_group4.Model.*;
import java.time.LocalDate;

public class AppLauncher {
    public static void main(String[] args) {

        // 1. Creating animals
        Animal lion = new Mammal("M001", "African Lion", "Mammalia", "Savanna", "Vulnerable", true, "Golden");
        Animal eagle = new Bird("B001", "Golden Eagle", "Aves", "Mountains", "Least Concern", 2.2, true);

        // 2. Creating sightings
        Sighting s1 = new Sighting("S001", lion, LocalDate.now(), "Kruger National Park", 3, "A pride of lions near the river.");
        Sighting s2 = new Sighting("S002", eagle, LocalDate.of(2024, 5, 10), "Atlas Mountains", 1, "Spotted while hunting.");

        // 3. Displaying details
        System.out.println("========== BIOPULSE SYSTEM TEST ==========");
        s1.displaySightingDetails();
        System.out.println();
        s2.displaySightingDetails();
        System.out.println("==========================================");
    }
}
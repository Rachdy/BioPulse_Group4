package com.example.biopulse_group4;

import com.example.biopulse_group4.Model.*;
import java.time.LocalDate;

public class AppLauncher {
    public static void main(String[] args) {

        // Testing the Model Layer
        Animal lion = new Mammal("M001", "African Lion", "Mammalia", "Savanna", "Vulnerable", true, "Golden");
        Animal eagle = new Bird("B001", "Golden Eagle", "Aves", "Mountains", "Least Concern", 2.2, true);
        Animal cobra = new Reptile("R001", "King Cobra", "Reptilia", "Forest", "Vulnerable", true, "Smooth");

        Sighting s1 = new Sighting("S001", lion, LocalDate.now(), "Kruger Park", 3, "Healthy pride.");

        System.out.println("========== BIOPULSE TEST ==========");
        s1.displaySightingDetails();
        cobra.displayInfo();
        System.out.println("===================================");
    }
}
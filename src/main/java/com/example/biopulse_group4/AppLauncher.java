package com.example.biopulse_group4;

import com.example.biopulse_group4.Model.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class AppLauncher {
    public static void main(String[] args) {

        // 6 parameters: ID, Name, Taxo, Habitat, Status, Fur
        Animal lion = new Mammal("M001", "African Lion", "Mammalia", "Savanna", "Vulnerable", "Golden");

        SightingLog.TemporalData timeInfo = new SightingLog.TemporalData(LocalDate.now(), LocalTime.now());
        SightingLog.SpatialData locationInfo = new SightingLog.SpatialData(-1.2921, 36.8219);

        SightingLog log1 = new SightingLog(timeInfo, locationInfo, lion);
        log1.setIndividuals(3);

        System.out.println("========== SUCCESS ==========");
        System.out.println("Sighting for: " + log1.getAnimal().getSpeciesName());
        System.out.println("=============================");
    }
}
package com.example.biopulse_group4.service;

import com.example.biopulse_group4.Model.Sighting;
import java.time.LocalDate;

public class ValidationService {

    public boolean validateDate(LocalDate date) {
        if (date == null) {
            return false;
        }

        if (date.isAfter(LocalDate.now())) {
            return false;
        }

        return true;
    }

    public boolean validateCount(int count) {
        if (count < 1) {
            return false;
        }

        return true;
    }

    public boolean validateLocation(String location) {
        if (location == null) {
            return false;
        }

        if (location.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean validateSighting(Sighting sighting) {
        return sighting != null;
    }
}
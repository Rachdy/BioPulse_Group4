package com.example.biopulse_group4.service;

import java.time.LocalDate;
import com.example.biopulse_group4.Model.Sighting;

public class ValidationService {
    public boolean validateDate(LocalDate date) {
        if (date == null){
            return false;
        }
        if (date.isAfter(LocalDate.now())){
            return false;
        }
    return true;
}

    public boolean validateCount(int count) {
        return count>0;
    }

    public boolean validateLocation(String location) {
        return true;
    }


}

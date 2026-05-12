package com.example.biopulse_group4.Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class SightingLog {

    private String logId;
    private  TemporalData temporalData;
    private SpatialData spatialData;
    private Animal animal;

    private int individuals = 1;
    private String confidence = "Medium";
    private String qualitativeNotes = "";
    private SightingStatus status = SightingStatus.PENDING;

    public SightingLog(TemporalData temporalData, SpatialData spatialData, Animal animal) {
        if (temporalData == null || spatialData == null || animal == null) {
            throw new IllegalArgumentException("Temporal, Spatial, and Animal data are required!");
        }

        this.logId = UUID.randomUUID().toString();
        this.temporalData = temporalData;
        this.spatialData = spatialData;
        this.animal = animal;
    }

    public String getLogId() {
        return logId;
    }

    public TemporalData getTemporalData() {
        return temporalData;
    }

    public SpatialData getSpatialData() {
        return spatialData;
    }

    public Animal getAnimal() {
        return animal;
    }

    public int getIndividuals() {
        return individuals;
    }

    public String getConfidence() {
        return confidence;
    }

    public String getQualitativeNotes() {
        return qualitativeNotes;
    }

    public SightingStatus getStatus() {
        return status;
    }

    public void setIndividuals(int individuals) {
        if (individuals < 1) {
            throw new IllegalArgumentException("Number of individuals must be at least 1.");
        }
        this.individuals = individuals;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public void setQualitativeNotes(String qualitativeNotes) {
        this.qualitativeNotes = qualitativeNotes;
    }

    public void setStatus(SightingStatus status) {
        this.status = status;
    }

    public enum SightingStatus {PENDING, VERIFIED, REJECTED}

    public static class SpatialData {
        public double latitude;
        public double longitude;

        public SpatialData(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }

    public static class TemporalData {
        public LocalDate date;
        public LocalTime time;

        public TemporalData(LocalDate date, LocalTime time) {
            this.date = date;
            this.time = time;
        }
    }
}
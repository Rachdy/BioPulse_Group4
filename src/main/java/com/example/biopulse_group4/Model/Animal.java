package com.example.biopulse_group4.Model;

   public abstract class Animal {
        // Attributes mniyin men l-UML
        protected String speciesID;
        protected String speciesName;
        protected String taxonomicClass;
        protected String habitatRequirements;
        protected String conservationStatus;

        public Animal(String speciesID, String speciesName, String taxonomicClass, String habitatRequirements, String conservationStatus) {
            this.speciesID = speciesID;
            this.speciesName = speciesName;
            this.taxonomicClass = taxonomicClass;
            this.habitatRequirements = habitatRequirements;
            this.conservationStatus = conservationStatus;
        }

        // Method abstract kif mktouba f image_634669.png
        public abstract void displayInfo();
    }

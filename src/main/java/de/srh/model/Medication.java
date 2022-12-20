package de.srh.model;

public class Medication {
    int medicationId;
    String medicationName;
    float price;

    public Medication(int medicationId, String medicationName) {
        this.medicationId = medicationId;
        this.medicationName = medicationName;
    }

    public Medication(String medicationName) {
        this.medicationName = medicationName;
    }

    public Medication(int medicationId, String medicationName, float price) {
        this.medicationId = medicationId;
        this.medicationName = medicationName;
        this.price = price;
    }

    public Medication(String medicationName, float price) {
        this.medicationName = medicationName;
        this.price = price;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "medicationId=" + medicationId +
                ", medicationName='" + medicationName + '\'' +
                ", price=" + price +
                '}';
    }
}

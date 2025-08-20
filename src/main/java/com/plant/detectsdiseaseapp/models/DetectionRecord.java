package com.plant.detectsdiseaseapp.models;

import java.time.LocalDate;

public class DetectionRecord {
    private int id;
    private String imageUrl;
    private String diseaseName;
    private LocalDate date;

    // Default constructor (required for Spring)
    public DetectionRecord() {
    }

    // Parameterized constructor
    public DetectionRecord(int id, String imageUrl, String diseaseName, LocalDate date) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.diseaseName = diseaseName;
        this.date = date;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DetectionRecord{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", diseaseName='" + diseaseName + '\'' +
                ", date=" + date +
                '}';
    }

}

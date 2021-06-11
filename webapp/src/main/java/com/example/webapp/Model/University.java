package com.example.webapp.Model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate foundedAt;
    @Transient
    private boolean oneHundredYearsOld;

    public University() {
    }

    public University(String name, String city, LocalDate foundedAt) {
        this.name = name;
        this.city = city;
        this.foundedAt = foundedAt;
    }

    public University(int id, String name, String city, LocalDate foundedAt) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.foundedAt = foundedAt;
    }

    public LocalDate getFoundedAt() {
        return foundedAt;
    }

    public void setFoundedAt(LocalDate foundedAt) {
        this.foundedAt = foundedAt;
    }

    public boolean isOneHundredYearsOld() {
        return Period.between(this.foundedAt, LocalDate.now()).getYears() >= 100;
    }

    public void setOneHundredYearsOld(boolean oneHundredYearsOld) {
        this.oneHundredYearsOld = oneHundredYearsOld;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", foundedAt=" + foundedAt +
                ", oneHundredYearsOld=" + oneHundredYearsOld +
                '}';
    }
}

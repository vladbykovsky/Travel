package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class City {
    private int idCity;
    private String name;
    private String distance;
    private String description;
    private Country country;

    @Id
    @Column(name = "id_city")
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "distance")
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return idCity == city.idCity &&
                Objects.equals(name, city.name) &&
                Objects.equals(distance, city.distance) &&
                Objects.equals(description, city.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCity, name, distance, description);
    }

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id_country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}

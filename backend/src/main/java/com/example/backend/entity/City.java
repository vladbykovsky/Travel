package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city", schema = "travel_agency", catalog = "")
public class City {
    private int cityId;
    private String name;
    private int distance;
    private String description;
    private int countryId;

    @Id
    @Column(name = "id_city")
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int idCity) {
        this.cityId = idCity;
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
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
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

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId == city.cityId &&
                distance == city.distance &&
                countryId == city.countryId &&
                Objects.equals(name, city.name) &&
                Objects.equals(description, city.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, name, distance, description, countryId);
    }
}

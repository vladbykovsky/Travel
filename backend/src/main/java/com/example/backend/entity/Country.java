package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "travel_agency", catalog = "")
public class Country {
    private int countryId;
    private String name;
    private String description;

    @Id
    @Column(name = "id_country")
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int idCountry) {
        this.countryId = idCountry;
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
        Country that = (Country) o;
        return countryId == that.countryId &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, name, description);
    }
}

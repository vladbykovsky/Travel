package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel", schema = "travel_agency", catalog = "")
public class Hotel {
    private int idHotel;
    private String name;
    private String level;
    private String description;
    private City city;
    private Food food;

    @Id
    @Column(name = "id_hotel")
    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
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
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        Hotel that = (Hotel) o;
        return idHotel == that.idHotel &&
                Objects.equals(name, that.name) &&
                Objects.equals(level, that.level) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, name, level, description);
    }

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id_city", nullable = false)
    public City getCity() {
        return city;
    }

    public void setCity(City cityByCityId) {
        this.city = cityByCityId;
    }

    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "id_food", nullable = false)
    public Food getFood() {
        return food;
    }

    public void setFood(Food foodByFoodId) {
        this.food = foodByFoodId;
    }
}

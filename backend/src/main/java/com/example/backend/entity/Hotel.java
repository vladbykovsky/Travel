package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Hotel {
    private int idHotel;
    private String name;
    private String level;
    private String description;
    private int cityId;
    private int foodId;

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

    @Basic
    @Column(name = "city_id")
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "food_id")
    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return idHotel == hotel.idHotel &&
                cityId == hotel.cityId &&
                Objects.equals(name, hotel.name) &&
                Objects.equals(level, hotel.level) &&
                Objects.equals(description, hotel.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, name, level, description, cityId);
    }

//    @ManyToOne
//    @JoinColumn(name = "food_id", referencedColumnName = "id_food", nullable = false)
//    public Food getFoodByFoodId() {
//        return foodByFoodId;
//    }
//
//    public void setFoodByFoodId(Food foodByFoodId) {
//        this.foodByFoodId = foodByFoodId;
//    }
}

package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Tour {
    private int idTour;
    private String price;
    private String time;
    private String date;
    private String transport;
    private String description;
    private int hotelId;
    private Country country;
    private City city;

    @Id
    @Column(name = "id_tour")
    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "tansport")
    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
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
    @Column(name = "id_hotel")
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

//
//    @Basic
//    @Column(name = "country_id")
//    public int getCountryId() {
//        return countryId;
//    }
//
//    public void setCountryId(int countryId) {
//        this.countryId = countryId;
//    }



//        @ManyToOne
//    @JoinColumn(name = "id_hotel", referencedColumnName = "id_hotel", nullable = false)
//    public Hotel getHotelByIdHotel() {
//        return hotelByIdHotel;
//    }
//
//    public void setHotelByIdHotel(Hotel hotelByIdHotel) {
//        this.hotelByIdHotel = hotelByIdHotel;
//    }

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id_country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id_city")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

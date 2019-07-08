package com.example.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tour", schema = "travel_agency", catalog = "")
public class Tour {
    private int idTour;
    private String price;
    private String time;
    private String date;
    private String transport;
    private Hotel hotel;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour that = (Tour) o;
        return idTour == that.idTour &&
                Objects.equals(price, that.price) &&
                Objects.equals(time, that.time) &&
                Objects.equals(date, that.date) &&
                Objects.equals(transport, that.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTour, price, time, date, transport);
    }

    @ManyToOne
    @JoinColumn(name = "id_hotel", referencedColumnName = "id_hotel", nullable = false)
    public Hotel getHotelByIdHotel() {
        return hotel;
    }

    public void setHotelByIdHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}

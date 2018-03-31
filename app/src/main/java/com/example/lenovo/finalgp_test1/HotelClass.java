package com.example.lenovo.finalgp_test1;

/**
 * Created by Lenovo on 3/03/2018.
 */

public class HotelClass  {
    private int hotel_id, hotel_stars, num_rooms;
    private double sgl_price, dbl_price, hotel_rating;
    private String hotel_name;

    public  HotelClass(){

    }
    public HotelClass(int hotel_id, int hotel_stars, int num_rooms, double sgl_price, double dbl_price, double hotel_rating, String hotel_name) {
        this.hotel_id = hotel_id;
        this.hotel_stars = hotel_stars;
        this.num_rooms = num_rooms;
        this.sgl_price = sgl_price;
        this.dbl_price = dbl_price;
        this.hotel_rating = hotel_rating;
        this.hotel_name = hotel_name;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getHotel_stars() {
        return hotel_stars;
    }

    public void setHotel_stars(int hotel_stars) {
        this.hotel_stars = hotel_stars;
    }

    public int getNum_rooms() {
        return num_rooms;
    }

    public void setNum_rooms(int num_rooms) {
        this.num_rooms = num_rooms;
    }

    public double getSgl_price() {
        return sgl_price;
    }

    public void setSgl_price(double sgl_price) {
        this.sgl_price = sgl_price;
    }

    public double getDbl_price() {
        return dbl_price;
    }

    public void setDbl_price(double dbl_price) {
        this.dbl_price = dbl_price;
    }

    public double getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(double hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }
}

package com.example.lenovo.finalgp_test1.TripPlannerClasses;

import java.util.Date;

/**
 * Created by LENOVO on 2018-03-07.
 */

public class ToursClass {
    private int tour_id, city_id_fk, tour_price;
    private String tour_name, tour_desc, tour_img, city_name;
    private Date open, close;

    public ToursClass() {
    }
    public ToursClass(int tour_id, int city_id_fk, int tour_price, String tour_name,  String city_name, String tour_desc, String tour_img, Date open, Date close) {
        this.tour_id = tour_id;
        this.city_id_fk = city_id_fk;
        this.tour_price = tour_price;
        this.tour_name = tour_name;
        this.tour_desc = tour_desc;
        this.tour_img = tour_img;
        this.open = open;
        this.close = close;
        this.city_name = city_name;
    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public int getCity_id_fk() {
        return city_id_fk;
    }

    public void setCity_id_fk(int city_id_fk) {
        this.city_id_fk = city_id_fk;
    }

    public int getTour_price() {
        return tour_price;
    }

    public void setTour_price(int tour_price) {
        this.tour_price = tour_price;
    }

    public String getTour_name() {
        return tour_name;
    }

    public void setTour_name(String tour_name) {
        this.tour_name = tour_name;
    }

    public String getTour_desc() {
        return tour_desc;
    }

    public void setTour_desc(String tour_desc) {
        this.tour_desc = tour_desc;
    }

    public String getTour_img() {
        return tour_img;
    }

    public void setTour_img(String tour_img) {
        this.tour_img = tour_img;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClose() {
        return close;
    }

    public void setClose(Date close) {
        this.close = close;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}

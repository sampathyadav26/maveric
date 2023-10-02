package com.maveric.task3_day2;

public class Feedback {

    int fb_id;

    String description;

    Customer customer;
    public Feedback() {
    }

    public Feedback(int fb_id, String description, Customer customer) {
        this.fb_id = fb_id;
        this.description = description;
        this.customer = customer;
    }



    @Override
    public String toString() {
        return "feedback{" +
                "fb_id=" + fb_id +
                ", description='" + description + '\'' +
                ", customer=" + customer +
                '}';
    }
}

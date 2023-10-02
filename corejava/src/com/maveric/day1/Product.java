package com.maveric.day1;

public class Product {
    long id;
    double price;
  Product(){

  }
    public Product(long id, double price) {
        this.id = id;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product : {" +
                "id=" + id +
                ", price=" + price +
                '}';
    }


}
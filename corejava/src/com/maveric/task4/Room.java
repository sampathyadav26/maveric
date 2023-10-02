package com.maveric.task4;

public class Room {
    int roomNumber;
    int floor;
    Guest guest;
    //checkedIn:Guest
    String roomType;// deluxe or normal
    double pricePerDay;


    public Room() {
    }

    public Room(int roomNumber, int floor, Guest guest, String roomType, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.guest = guest;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", floor=" + floor +
                ", guest=" + guest +
                ", roomType='" + roomType + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}

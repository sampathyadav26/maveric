package com.maveric.task4;

import java.util.Arrays;

public class Hotel {

    String name;
    Room[] rooms = new Room[8];
    int size = 0;

    public Hotel() {
    }

    public Hotel(String name, Room[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    void addRoom(Room room) {
        if (size < rooms.length) {
            rooms[size] = room;
            size++;
        } else {
            System.out.println("No more rooms available in the hotel.");
        }
    }

    void displayAllRooms() {
        for (Room r : rooms) {
            System.out.println(r);
        }
    }


    Room findGuestCheckedInRoom(int roomNumber) {
        boolean flag = false;
        for (Room r : rooms) {
            if ((r.roomNumber == roomNumber) && (r.guest != null)) {
                flag = true;
                System.out.println(r.roomNumber + "  " + r.guest.first_Name + "  " + r.guest.last_Name);
            }
        }
        if (flag == false) {
            System.out.println("guest are not available at roomnumber:" + roomNumber);
        }
        return null;
    }

    int guestsCount() {
        int count = 0;
        for (Room r : rooms) {
            if (r.guest != null) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    double earningToday() {
        double earning = 0;
        for (Room r : rooms) {
            if (((r.roomType.equals("normal") || (r.roomType.equals("delux"))) && (r.guest != null))) {
                earning = earning + r.pricePerDay;
            }
        }
        System.out.println("total Earning today=   " + earning);
        return earning;
    }

    Guest[] findAllGuests() {
        Guest[] guest = new Guest[rooms.length];
        int index = 0;
        for (Room r : rooms) {
            if (r != null && r.guest!= null)
                guest[index] = r.guest;
            index++;
            System.out.println(r.guest);
        }
        return guest;
    }

    void run() {
        Hotel service = new Hotel();
        Guest guest = new Guest(100, "sampath", "kumar", "sampath@gmail");
        Guest guest1 = new Guest(101, "karthik", "kumar", "karthik@gmail");
        Guest guest2 = new Guest(102, "Amaresh", "giri", "Amaresh@gmail");
        Guest guest3 = new Guest(103, "Asish", "gopan", "Asish@gmail");
        Guest guest4 = new Guest(104, "hemanth", "naidu", "hemanth@gmail");
        Guest guest5 = new Guest(105, "Mahesh", "kumar", "Mahesh@gmail");
        Guest guest6 = new Guest(106, "Govinda", "p", "Govinda@gmail");
        Guest guest7 = new Guest(107, "Bhavitha", "Reddy", "Bhavitha@gmail");
        Room room = new Room(1, 1, guest, "normal", 500);
        Room room1 = new Room(2, 01, guest1, "normal", 500.0);
        Room room2 = new Room(3, 01, null, "normal", 500.0);
        Room room3 = new Room(4, 01, null, "normal", 500.0);
        Room room4 = new Room(5, 02, guest4, "delux", 2000.0);
        Room room5 = new Room(6, 02, guest5, "delux", 2000.0);
        Room room6 = new Room(7, 02, null, "delux", 2000.0);
        Room room7 = new Room(8, 02, null, "delux", 2000.0);
        service.addRoom(room);
        service.addRoom(room1);
        service.addRoom(room2);
        service.addRoom(room3);
        service.addRoom(room4);
        service.addRoom(room5);
        service.addRoom(room6);
        service.addRoom(room7);
        service.findAllGuests();
        System.out.println("------------------------------");
        service.displayAllRooms();
        System.out.println("------------------------------");
        service.findGuestCheckedInRoom(2);
        service.guestsCount();
        System.out.println("---------------");
        service.earningToday();

    }


}

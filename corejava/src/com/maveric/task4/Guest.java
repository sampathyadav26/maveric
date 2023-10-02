package com.maveric.task4;

public class Guest {

    int guest_Id;
     String first_Name;

     String last_Name;

     String  eMail;

    public Guest() {
    }

    public Guest(int guest_Id, String first_Name, String last_Name, String eMail) {
        this.guest_Id = guest_Id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guest_Id=" + guest_Id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}

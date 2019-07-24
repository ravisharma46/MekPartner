package com.example.mekpartner.LoginRelated.Bookings.NewBooking;

import java.security.PublicKey;

public class NewBookingDataClass {

    String description;

    public NewBookingDataClass(String des){
        this.description=des;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

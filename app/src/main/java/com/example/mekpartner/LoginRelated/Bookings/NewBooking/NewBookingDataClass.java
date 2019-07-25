package com.example.mekpartner.LoginRelated.Bookings.NewBooking;

import java.security.PublicKey;

public class NewBookingDataClass {

    String status,serviceType;

    public NewBookingDataClass(String status,String serviceType){
        this.status=status;
        this.serviceType=serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status =status;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return serviceType;
    }
}

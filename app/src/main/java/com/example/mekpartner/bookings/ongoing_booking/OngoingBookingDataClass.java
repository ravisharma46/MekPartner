package com.example.mekpartner.bookings.ongoing_booking;

public class OngoingBookingDataClass {

    String status,serviceType;

    public OngoingBookingDataClass (String status,String serviceType){
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

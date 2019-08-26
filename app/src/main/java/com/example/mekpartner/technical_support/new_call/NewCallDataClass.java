package com.example.mekpartner.technical_support.new_call;

public class NewCallDataClass {

    String mobileNo;
    public  NewCallDataClass(String m){
        this.mobileNo=m;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}

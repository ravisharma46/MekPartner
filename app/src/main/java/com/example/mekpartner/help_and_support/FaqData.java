package com.example.mekpartner.help_and_support;

public class FaqData {

    private String mString;
    private Integer id;

    public FaqData(String mString, Integer id) {
        this.mString = mString;
        this.id = id;
    }

    public String getmString() {
        return mString;
    }

    public void setmString(String mString) {
        this.mString = mString;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

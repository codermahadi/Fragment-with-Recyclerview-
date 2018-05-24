package com.example.mahadi.frgmtandrcycle;

/**
 * Created by Mahadi on 3/11/2018.
 */

public class Contact {

    private String name;
    private String phn;
    private int photo;

    public Contact() {

    }

    public Contact(String name, String phn, int photo) {
        this.name = name;
        this.phn = phn;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getPhn() {
        return phn;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

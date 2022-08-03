package com.example.volunteerme;

import java.io.Serializable;

public class Volunteers implements Serializable {

    private int Image;
    private String Name;
    private String Occupation;
    private String Degree;

    public int getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String getDegree() {
        return Degree;
    }


    public Volunteers (int image, String name , String occupation, String degree){
        this.Image = image;
        this.Name = name;
        this.Occupation = occupation;
        this.Degree = degree;

    }
}

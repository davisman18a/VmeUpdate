package com.example.volunteerme;

import java.io.Serializable;

public class Organizations implements Serializable {

    private int Image;
    private String Name;
    private String Position;
    private String Location;

    public int getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public String getLocation() {
        return Location;
    }


    public Organizations (int image, String name , String job, String location){
        this.Image = image;
        this.Name = name;
        this.Position = job;
        this.Location = location;

    }


}

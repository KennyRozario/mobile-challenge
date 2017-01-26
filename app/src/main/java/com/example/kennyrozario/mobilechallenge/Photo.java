package com.example.kennyrozario.mobilechallenge;

/**
 * Created by Kenny on 2017-01-24.
 */

public class Photo {
    private int mId;
    private String mName;
    private String mDescription;
    private double mRating;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public double getRating() {
        return mRating;
    }

    public void setRating(double rating) {
        mRating = rating;
    }
}

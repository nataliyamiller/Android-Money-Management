package com.epicodus.moneymanagement.models;

/**
 * Created by nataliyamiller on 11/2/15.
 */
public class MoreInfo {
    private String mDescription;
    private int mImage;

    public MoreInfo(String description, int image) {
        mDescription = description;
        mImage = image;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }
}

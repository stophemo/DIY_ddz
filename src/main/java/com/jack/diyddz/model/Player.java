package com.jack.diyddz.model;

import java.util.ArrayList;

/**
 * @author windows
 */
public class Player {
    public String name;

    public ArrayList<String> cards = new ArrayList<>();

    public Boolean isLandlord;

    public Boolean getLandlord() {
        return isLandlord;
    }

    public void setLandlord(Boolean landlord) {
        isLandlord = landlord;
    }
}

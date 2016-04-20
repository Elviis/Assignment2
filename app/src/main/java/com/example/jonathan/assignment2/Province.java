package com.example.jonathan.assignment2;

/**
 * Created by Jonathan on 2016-03-23.
 */
public class Province {

String  name; String capital; int armId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getArmId() {
        return armId;
    }

    public void setArmId(int armId) {
        this.armId = armId;
    }


    public Province(String name, String capital, int armId) {
        this.name = name;
        this.capital = capital;
        this.armId = armId;
    }


    public Province() {
    }
}

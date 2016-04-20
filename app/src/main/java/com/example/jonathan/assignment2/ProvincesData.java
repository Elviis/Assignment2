package com.example.jonathan.assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathan on 2016-03-23.
 */
public class ProvincesData {


    public static List<Province> getList(){

        List<Province> provinces = new ArrayList<Province>();

        Province province1 = new Province("Alberta", "Edmonton", R.drawable.alberta);
        provinces.add(province1);

        Province province2 = new Province("Brittish Colombia", "Victoria", R.drawable.british_columbia);
        provinces.add(province2);

        Province province3 = new Province("Manitoba","Winnipeg",R.drawable.manitoba);
        provinces.add(province3);

        Province province4 = new Province("Newfoundland and Labrador","St.Johns", R.drawable.new_brunswick);
        provinces.add(province4);

        Province province5 = new Province("Nova Scotia","Halifax",R.drawable.nova_scotia);
        provinces.add(province5);

        Province province6 = new Province("Ontario", "Toronto", R.drawable.ontario);
        provinces.add(province6);

        Province province7 = new Province("Quebec", "Quebec City", R.drawable.quebec);
        provinces.add(province7);

        Province province8 = new Province("Saskatchewan","Regina",R.drawable.saskatchewan);
        provinces.add(province8);

        Province province9 = new Province("Prince Edward","Charlottown",R.drawable.prince_edward_island);
        provinces.add(province9);

        Province province10 = new Province("New Brunswick","Fredricton",R.drawable.new_brunswick);
        provinces.add(province10);

        return provinces;
    }


}

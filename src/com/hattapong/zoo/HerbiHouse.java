package com.hattapong.zoo;

import java.util.List;

/**
 * Created by Hattapong on 7/12/2016.
 */
public class HerbiHouse extends Zone{
    public HerbiHouse(Employee employes, List<Animal> animal) {
        super(employes, animal);
        name = "HerbiHouse";
        detail = "Herbivores only eat plants to get energy and nutrients.\n " +
                "             Most animals will eat the leaves and fruits of\n" +
                "             plants as these tend to be the more nutritious.\n" +
                "             Plant vegetation, however, is very hard to break down\n" +
                "             into energy so most herbivores have a specialised digestive system.\n";
    }

}

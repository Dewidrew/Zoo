package com.hattapong.zoo;

import java.util.List;

/**
 * Created by Hattapong on 7/12/2016.
 */
public class OmniHouse extends Zone {
    public OmniHouse(Employee employes, List<Animal> animal) {
        super(employes, animal);
        name = "OmniHouse";
        detail = "Omnivores get energy and nutrients from eating a diet\n" +
                "            containing plants, animals, algae and fungi. Due to the\n" +
                "            large variety of food options, they will eat what they can\n" +
                "            hunt and scavenge in their environment to make the most \n" +
                "            of what is available. If it looks edible, they’ll give it a try!\n";
    }
}

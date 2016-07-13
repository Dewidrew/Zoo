package com.hattapong.zoo;

import java.util.List;

/**
 * Created by Hattapong on 7/12/2016.
 */
public class CarniHouse extends Zone {
    public CarniHouse(Employee employes, List<Animal> animal) {
        super(employes, animal);
        name = "CarniHouse";
        detail = "Carnivores eat meat (and other animal tissue) to get the\n" +
                "            calories and energy to survive. Meat is a high energy \n" +
                "            food source. Carnivores find their food through predation\n" +
                "            or scavenging, and are often adapted with big claws, sharp\n" +
                "            teeth/beak and quick speed whether on land, in the sea or in the sky.\n";
    }
}

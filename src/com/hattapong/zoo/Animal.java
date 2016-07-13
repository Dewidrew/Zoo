package com.hattapong.zoo;

/**
 * Created by Hattapong on 7/12/2016.
 */
public class Animal {
    protected String name;
    protected Employee keeper;
    protected FoodType food;

    public Animal(String name, Employee keeper) {
        this.name = name;
        this.keeper = keeper;
        autoSetFood(name);
    }

    public String getName() {
        return name;
    }

    private void autoSetFood(String name){
        switch (name){
            case "Hyena" : food = FoodType.CARNIVORE;break;
            case "Polar Bears": food = FoodType.CARNIVORE;break;
            case "Dolphins": food = FoodType.CARNIVORE;break;
            case "Whales": food = FoodType.CARNIVORE;break;
            case "Microbats": food = FoodType.CARNIVORE;break;
            case "Snakes": food = FoodType.CARNIVORE;break;
            case "Octopuses": food = FoodType.CARNIVORE;break;
            case "Crocodilians": food = FoodType.CARNIVORE;break;
            case "Cassowary": food = FoodType.OMNIVORE;break;
            case "Rheas": food = FoodType.OMNIVORE;break;
            case "Woodpeckers": food = FoodType.OMNIVORE;break;
            case "Raccoons": food = FoodType.OMNIVORE;break;
            case "Sloths": food = FoodType.OMNIVORE;break;
            case "Hedgehogs": food = FoodType.OMNIVORE;break;
            case "Zebra": food = FoodType.HERBIVORE;break;
            case "Rhinoceroses": food = FoodType.HERBIVORE;break;
            case "Giraffe": food = FoodType.HERBIVORE;break;
            case "Beaver": food = FoodType.HERBIVORE;break;
            case "Iguanas": food = FoodType.HERBIVORE;break;
            case "Parrots": food = FoodType.HERBIVORE;break;
            default: break;
        }

    }
}

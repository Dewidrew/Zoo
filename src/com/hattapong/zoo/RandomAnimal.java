package com.hattapong.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Hattapong on 7/13/2016.
 */
public class RandomAnimal {
    private List<Animal> animal;
    private Employee person;

    public RandomAnimal(FoodType foodType, Employee person) {
        animal = new ArrayList<>();
        this.person = person;
        generateAnimal(foodType);
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    private void generateAnimal(FoodType foodType) {
        Random r = new Random();
        if (foodType.equals(FoodType.CARNIVORE)) {
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Hyena", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Polar Bears", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Whales", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Microbats", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Reptiles("Snakes", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Fishes("Octopuses", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Reptiles("Crocodilians", person));
            }
        } else if (foodType.equals(FoodType.OMNIVORE)) {
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Birds("Cassowary", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Birds("Rheas", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Birds("Woodpeckers", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Raccoons", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Sloths", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Hedgehogs", person));
            }

        } else if (foodType.equals(FoodType.HERBIVORE)) {
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Zebra", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Rhinoceroses", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Giraffe", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Mammals("Beaver", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Reptiles("Iguanas", person));
            }
            for (int i = 0; i < r.nextInt(5); i++) {
                animal.add(new Birds("Parrots", person));
            }
        }

    }
}

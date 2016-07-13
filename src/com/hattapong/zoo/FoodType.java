package com.hattapong.zoo;

/**
 * Created by Hattapong on 7/13/2016.
 */
public enum FoodType {
    OMNIVORE(1), CARNIVORE(2), HERBIVORE(3);

    private int flag;

    FoodType(int flag) {
        this.flag = flag;
    }
}

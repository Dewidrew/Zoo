package com.hattapong.zoo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Hattapong on 7/12/2016.
 */
public class Zone {
    protected String name,detail;
    protected Employee employes;
    protected List<Animal> animal;


    public Zone(Employee employes, List<Animal> animal) {
        this.employes = employes;
        this.animal = animal;

    }

    public void showDetail(){
        System.out.println("    โซน     : "+name);
        System.out.println("    ผู้ดูแล    : "+employes.getFname()+" "+employes.getLname());
        System.out.printf("    ข้อมูล    : "+detail);
    }

    public void showAnimalList(){
        System.out.println("    โซน     : "+name);
        Set<String> uniqueSet = new HashSet<>();
        List<String> tempAnimal = animal.stream().map(Animal::getName).collect(Collectors.toList());
        uniqueSet.addAll(tempAnimal);
        int count = 1;
        for (String temp : uniqueSet) {
            System.out.println("    "+count+". "+temp + ": " + Collections.frequency(tempAnimal, temp)+ " ตัว" );
            count++;
        }

    }
}

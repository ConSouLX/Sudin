package com.xworkz.task;

import com.xworkz.task.bicycle.Bicycle;
import com.xworkz.task.bicycle.hero.Hero;

public class BicycleRunner {


    public static void main(String[] args)
    {
        Bicycle bicycle = new Bicycle();
        bicycle.type();
        bicycle.brake();
        bicycle.purpose();

        Hero hero = new Hero();
        hero.type();
        hero.brake();
        hero.purpose();
    }
}

package com.xworkz.task;

import com.xworkz.task.apple.Apple;
import com.xworkz.task.fruit.Fruit;

public class FruitRunner {


    public static void main(String[] args)
    {
        Apple apple = new Apple();
        apple.color();
        apple.taste();
        apple.size();

        Fruit fruit = new Fruit();
        fruit.color();
        fruit.taste();
    }
}

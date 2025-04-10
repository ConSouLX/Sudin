package com.xworkz.task;

import com.xworkz.task.bag.Bag;
import com.xworkz.task.bag.americantourister.AmericanTourister;

public class BagRunner {

    public static void main(String[] args)
    {
        Bag bag = new Bag();
        bag.size();
        bag.material();
        bag.compartments();

        AmericanTourister tourister = new AmericanTourister();
        tourister.size();
        tourister.material();
        tourister.compartments();
    }
}

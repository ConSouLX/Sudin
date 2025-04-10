package com.xworkz.task;

import com.xworkz.task.watch.Watch;
import com.xworkz.task.watch.titan.Titan;

public class WatchRunner {

    public static void main(String[] args)
    {
        Titan titan = new Titan();
        titan.type();
        titan.brand();
        titan.price();

        Watch watch = new Watch();
        watch.type();
        watch.brand();
    }
}

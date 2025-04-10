package com.xworkz.task;

import com.xworkz.task.fan.Fan;
import com.xworkz.task.fan.crompton.Crompton;

public class FanRunner {


    public static void main(String[] args)
    {
        Fan fan = new Fan();
        fan.blades();
        fan.speed();
        fan.type();

        Crompton crompton = new Crompton();
        crompton.blades();
        crompton.speed();
        crompton.type();
    }
}

package com.xworkz.task;

import com.xworkz.task.boat.Boat;
import com.xworkz.task.headphone.HeadPhone;

public class HeadPhoneRunner {

    public static void main(String[] args)
    {
        HeadPhone headphones = new HeadPhone();
        headphones.type();
        headphones.battery();
        headphones.noiseCancellation();

        Boat boat = new Boat();
        boat.type();
        boat.battery();
        boat.noiseCancellation();
    }
}

package com.xworkz.task;

import com.xworkz.task.bottle.Bottle;
import com.xworkz.task.bottle.milton.Milton;

public class BottleRunner {


    public static void main(String[] args)
    {
        Bottle bottle = new Bottle();
        bottle.material();
        bottle.use();
        bottle.capacity();

        Milton milton = new Milton();
        milton.material();
        milton.use();
        milton.capacity();
    }
}

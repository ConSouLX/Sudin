package com.xworkz.task;

import com.xworkz.task.desert.Desert;
import com.xworkz.task.sahara.Sahara;

public class DesertRunner {

    public static void main(String[] args)
    {
        Desert desert = new Desert();
        desert.climate();
        desert.terrain();
        desert.wildlife();

        Sahara sahara = new Sahara();
        sahara.climate();
        sahara.terrain();
        sahara.wildlife();
    }
}

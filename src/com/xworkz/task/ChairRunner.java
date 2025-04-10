package com.xworkz.task;

import com.xworkz.task.chair.Chair;
import com.xworkz.task.chair.plastic.PlasticChair;

public class ChairRunner {
    public static void main(String[] args)
    {
        Chair chair = new Chair();
        chair.material();
        chair.legs();
        chair.usage();

        PlasticChair plasticChair = new PlasticChair();
        plasticChair.material();
        plasticChair.legs();
        plasticChair.usage();
    }
}

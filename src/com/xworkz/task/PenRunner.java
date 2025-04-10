package com.xworkz.task;

import com.xworkz.task.pen.Pen;
import com.xworkz.task.pen.parker.Parker;

public class PenRunner {

    public static void main(String[] args)
    {
        Pen pen = new Pen();
        pen.type();
        pen.color();
        pen.usage();

        Parker parker = new Parker();
        parker.type();
        parker.color();
        parker.usage();
    }
}

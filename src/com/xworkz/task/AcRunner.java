package com.xworkz.task;

import com.xworkz.task.ac.Ac;
import com.xworkz.task.ac.voltas.Voltas;

public class AcRunner {


    public static void main(String[] args)
    {
        Ac ac = new Ac();
        ac.type();
        ac.capacity();
        ac.mode();

        Voltas voltas = new Voltas();
        voltas.type();
        voltas.capacity();
        voltas.mode();
    }
}

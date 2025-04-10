package com.xworkz.task;

import com.xworkz.task.laptop.Laptop;
import com.xworkz.task.laptop.dell.Dell;

public class LaptopRunner {


    public static void main(String[] args)
    {
        Dell dell = new Dell();
        dell.processor();
        dell.ram();
        dell.storage();

        Laptop laptop = new Laptop();
        laptop.processor();
        laptop.ram();
    }
}

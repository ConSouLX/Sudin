package com.xworkz.task;

import com.xworkz.task.washingmachine.WashingMachine;
import com.xworkz.task.washingmachine.whirlpool.WhirlPool;

public class WashingMachineRunner {


    public static void main(String[] args)
    {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.type();
        washingMachine.capacity();
        washingMachine.features();

        WhirlPool whirlpool = new WhirlPool();
        whirlpool.type();
        whirlpool.capacity();
        whirlpool.features();
    }
}

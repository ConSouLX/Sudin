package com.xworkz.task;

import com.xworkz.task.dinosaur.Dinosaur;
import com.xworkz.task.dinosaur.trex.Trex;

public class DinosaurRunner {

    public static void main(String[] args)
    {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.period();
        dinosaur.size();
        dinosaur.extinction();

        Trex trex = new Trex();
        trex.period();
        trex.size();
        trex.extinction();
    }
}

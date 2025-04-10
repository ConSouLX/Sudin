package com.xworkz.task;

import com.xworkz.task.train.Train;
import com.xworkz.task.train.bullettrain.BulletTrain;

public class TrainRunner {

    public static void main(String[] args)
    {
        Train train = new Train();
        train.transport();
        train.tracks();
        train.compartments();

        BulletTrain bulletTrain = new BulletTrain();
        bulletTrain.transport();
        bulletTrain.tracks();
        bulletTrain.compartments();
    }
}

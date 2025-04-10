package com.xworkz.task;

import com.xworkz.task.bird.Bird;
import com.xworkz.task.bird.peacock.Peacock;

public class BirdRunner {

    public static void main(String[] args)
    {
        Bird bird = new Bird();
        bird.wings();
        bird.beak();
        bird.feathers();

        Peacock peacock = new Peacock();
        peacock.wings();
        peacock.beak();
        peacock.feathers();
    }
}

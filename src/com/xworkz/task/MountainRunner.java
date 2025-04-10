package com.xworkz.task;

import com.xworkz.task.mountain.Mountain;
import com.xworkz.task.mountain.himalayas.Himalayas;

public class MountainRunner {

    public static void main(String[] args)
    {
        Mountain mountain = new Mountain();
        mountain.height();
        mountain.snow();
        mountain.climbing();

        Himalayas himalayas = new Himalayas();
        himalayas.height();
        himalayas.snow();
        himalayas.climbing();
    }
}

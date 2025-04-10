package com.xworkz.task;

import com.xworkz.task.camera.Camera;
import com.xworkz.task.camera.canon.Canon;

public class CameraRunner {
    public static void main(String[] args)
    {
        Camera camera = new Camera();
        camera.resolution();
        camera.lens();
        camera.brand();

        Canon canon = new Canon();
        canon.resolution();
        canon.lens();
        canon.brand();
    }
}

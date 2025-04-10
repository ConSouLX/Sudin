package com.xworkz.task;

import com.xworkz.task.planet.Planet;
import com.xworkz.task.planet.earth.Earth;

public class PlanetRunner {

    public static void main(String[] args)
    {
        Planet planet = new Planet();
        planet.orbit();
        planet.gravity();
        planet.atmosphere();

        Earth earth = new Earth();
        earth.orbit();
        earth.gravity();
        earth.atmosphere();
    }
}

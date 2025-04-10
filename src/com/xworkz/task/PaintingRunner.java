package com.xworkz.task;

import com.xworkz.task.painting.Painting;
import com.xworkz.task.painting.monalisa.MonaLisa;

public class PaintingRunner {
    public static void main(String[] args)
    {
        Painting painting = new Painting();
        painting.medium();
        painting.style();
        painting.purpose();

        MonaLisa monaLisa = new MonaLisa();
        monaLisa.medium();
        monaLisa.style();
        monaLisa.purpose();
    }
}

package com.xworkz.task;

import com.xworkz.task.printer.Printer;
import com.xworkz.task.printer.hp.Hp;

public class PrinterRunner {

    public static void main(String[] args)
    {
        Printer printer = new Printer();
        printer.type();
        printer.speed();
        printer.connectivity();

        Hp hp = new Hp();
        hp.type();
        hp.speed();
        hp.connectivity();
    }
}

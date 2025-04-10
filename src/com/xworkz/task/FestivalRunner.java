package com.xworkz.task;

import com.xworkz.task.festival.Festival;
import com.xworkz.task.festival.diwali.Diwali;

public class FestivalRunner {

    public static void main(String[] args)
    {
        Festival festival = new Festival();
        festival.type();
        festival.celebration();
        festival.origin();

        Diwali diwali = new Diwali();
        diwali.type();
        diwali.celebration();
        diwali.origin();
    }
}

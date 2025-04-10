package com.xworkz.task;

import com.xworkz.task.tv.Tv;
import com.xworkz.task.tv.sony.Sony;

public class TvRunner {

    public static void main(String[] args)
    {
        Tv television = new Tv();
        television.displayType();
        television.size();
        television.resolution();

        Sony sony = new Sony();
        sony.displayType();
        sony.size();
        sony.resolution();
    }
}

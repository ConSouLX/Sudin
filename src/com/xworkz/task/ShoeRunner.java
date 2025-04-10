package com.xworkz.task;

import com.xworkz.task.shoe.Shoe;
import com.xworkz.task.shoe.nike.Nike;

public class ShoeRunner {

    public static void main(String[] args)
    {
        Nike nike = new Nike();
        nike.size();
        nike.type();
        nike.brand();

        Shoe shoe = new Shoe();
        shoe.size();
        shoe.type();
    }
}

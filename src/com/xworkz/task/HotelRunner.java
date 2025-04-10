package com.xworkz.task;

import com.xworkz.task.hotel.Hotel;
import com.xworkz.task.hotel.taj.Taj;

public class HotelRunner {


    public static void main(String[] args)
    {
        Hotel hotel = new Hotel();
        hotel.services();
        hotel.rating();
        hotel.booking();

        Taj taj = new Taj();
        taj.services();
        taj.rating();
        taj.booking();
    }
}

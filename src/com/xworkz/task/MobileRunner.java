package com.xworkz.task;

import com.xworkz.task.mobile.Mobile;
import com.xworkz.task.mobile.samsung.SamSung;

public class MobileRunner {

    public static void main(String[] args){
        SamSung samsung = new SamSung();
        samsung.brand();
        samsung.os();
        samsung.features();

        Mobile mobile = new Mobile();
        mobile.brand();
        mobile.os();
    }
}

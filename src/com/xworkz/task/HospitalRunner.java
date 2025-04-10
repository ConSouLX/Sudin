package com.xworkz.task;

import com.xworkz.task.hospital.Hospital;
import com.xworkz.task.hospital.apollo.Apollo;

public class HospitalRunner {
    public static void main(String[] args)
    {
        Hospital hospital = new Hospital();
        hospital.treatment();
        hospital.doctors();
        hospital.emergency();

        Apollo apollo = new Apollo();
        apollo.treatment();
        apollo.doctors();
        apollo.emergency();
    }
}

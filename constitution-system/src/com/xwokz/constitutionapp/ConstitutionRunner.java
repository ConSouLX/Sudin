package com.xwokz.constitutionapp;

import com.xwokz.constitutionapp.constitution.Constitution;

public class ConstitutionRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Constitution constitution = new Constitution();
        constitution.setConstitutionId(1);
        constitution.setConstitutionType("unitary");
        constitution.setConstitutionSize("395 articles");
        constitution.setPublishedYear(1950);

        int constitutionId = constitution.getConstitutionId();
        String constitutionType = constitution.getConstitutionType();
        String constitutionSize = constitution.getConstitutionSize();
        int publishedYear = constitution.getPublishedYear();

        System.out.println("constitution id is "+constitutionId);
        System.out.println("constitution type is "+constitutionType);
        System.out.println("constitution size is "+constitutionSize);
        System.out.println("published year is "+publishedYear);

        System.out.println("MAIN ENDED");
    }
}



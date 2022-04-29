package com.edeal.recrutement;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dataSart = new Date();
        Date dataEnd = new Date();

        ProjectBeanCustom pbc1 = new ProjectBeanCustom("Projet Recruteemnt", 10, dataSart, dataEnd, "GOING");
        ProjectBeanCustom pbc3 = new GenericBean ("Projet Recruteemnt", 10, dataSart, dataEnd);
        ProjectBean b= new ProjectBeanCustom("",1,dataSart,dataEnd);
        b= saveBean((ProjectBeanCustom)b);
        System.out.println( b.toString());
        //System.out.println(b.getDurationToString());
    }
    public static ProjectBean saveBean(ProjectBean b)
    {

        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, 12);
        c1.set(Calendar.DATE, 11);
        c1.set(Calendar.YEAR, 2024);
        Date fin = c1.getTime();
        ProjectBeanCustom newB= new ProjectBeanCustom("Projet Recrutement",10,new Date(),fin,"Going");
        b = newB;
        return b;
    }
}

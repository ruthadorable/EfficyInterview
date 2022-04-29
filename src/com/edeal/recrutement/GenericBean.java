package com.edeal.recrutement;

import java.util.Date;

public class GenericBean extends ProjectBeanCustom{

    public GenericBean(String titre, int numero, Date dateDebut, Date dateFin, String etat) {
        super(titre, numero, dateDebut, dateFin, etat);
    }

    public GenericBean(String titre, int numero, Date dateDebut, Date dateFin) {
        super(titre, numero, dateDebut, dateFin);
    }
}

package org.prog.models;

import java.time.LocalDate;

public non-sealed class Objet extends Possession{
    private Double tauxAmmortissement;
    private LocalDate dateAchat;


    public Double ValeurADateDe(LocalDate dateVise) {
        int differenceYear = dateVise.getYear() - dateAchat.getYear();


        if (differenceYear < 0) return 0.0;

        Double decrementation = (this.getValeurs().getValeur()*(tauxAmmortissement*differenceYear))/100;

        return this.getValeurs().getValeur() - decrementation;

    }

}

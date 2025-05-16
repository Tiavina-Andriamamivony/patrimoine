package org.prog.models;

import java.time.LocalDate;

public class CompteEpargne extends Compte{
    private Double tauxInteret;

    public CompteEpargne(Utilisateur utilisateur, ValeurMonetaire valeur, String id, LocalDate dateOuverture, Double tauxInteret) {
        super(utilisateur, valeur, id, dateOuverture);
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne() {
    }

    public Double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(Double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public Double ValeurADateDe(LocalDate date) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

package org.prog.models;

import java.time.LocalDate;

public non-sealed class Depense extends Possession {
    private LocalDate dateDepense;
    private Frequence frequence;

    public Depense(Utilisateur utilisateur, ValeurMonetaire valeur, LocalDate dateDepense, Frequence frequence) {
        super(utilisateur, valeur);
        this.dateDepense = dateDepense;
        this.frequence = frequence;
    }

    public Depense() {
    }

    public LocalDate getDateDepense() {
        return dateDepense;
    }

    public void setDateDepense(LocalDate dateDepense) {
        this.dateDepense = dateDepense;
    }

    public Frequence getFrequence() {
        return frequence;
    }

    public void setFrequence(Frequence frequence) {
        this.frequence = frequence;
    }
}

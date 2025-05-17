package org.prog.models;

public class Revenu {
    private Frequence frequence;
    private ValeurMonetaire valeurMonetaire;

    public Revenu(Frequence frequence, ValeurMonetaire valeurMonetaire) {
        this.frequence = frequence;
        this.valeurMonetaire = valeurMonetaire;
    }

    public Frequence getFrequence() {
        return frequence;
    }

    public void setFrequence(Frequence frequence) {
        this.frequence = frequence;
    }

    public ValeurMonetaire getValeurMonetaire() {
        return valeurMonetaire;
    }

    public void setValeurMonetaire(ValeurMonetaire valeurMonetaire) {
        this.valeurMonetaire = valeurMonetaire;
    }
}

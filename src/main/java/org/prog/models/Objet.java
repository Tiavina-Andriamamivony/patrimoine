package org.prog.models;

public non-sealed class Objet extends Possession{
    private Double tauxAmmortissement;

    public Objet(Utilisateur utilisateur, ValeurMonetaire valeur, Double tauxAmmortissement) {
        super(utilisateur, valeur);
        this.tauxAmmortissement = tauxAmmortissement;
    }

    public Objet() {
    }

    public Double getTauxAmmortissement() {
        return tauxAmmortissement;
    }

}

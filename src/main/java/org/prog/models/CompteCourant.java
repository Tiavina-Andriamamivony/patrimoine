package org.prog.models;

import java.time.LocalDate;

/**
 * @Description Un compte courant est un type de compte qui accepte un montant de découverte où le solde peut être négatif
 */
public class CompteCourant extends Compte {
    private Double decouverteAutorise;

    public CompteCourant(Utilisateur utilisateur, ValeurMonetaire valeur, String id, LocalDate dateOuverture, Double decouverteAutorise) {
        super(utilisateur, valeur, id, dateOuverture);
        this.decouverteAutorise = decouverteAutorise;
    }

    public CompteCourant() {
    }

    public Double getDecouverteAutorise() {
        return decouverteAutorise;
    }

    public void setDecouverteAutorise(Double decouverteAutorise) {
        this.decouverteAutorise = decouverteAutorise;
    }
}

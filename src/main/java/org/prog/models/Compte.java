package org.prog.models;

import java.time.LocalDate;

/**
 * @Description Définie un compte courant
 * @Attribut Possible: id, Valeur monétaire, utilisateur, date d'ouverture. A méditer: Numéro de carte bancaire(id de la carte
 * pour les transactions), status du compte (actif, inactif, clôturer, bloqué), date de dernière transaction, transactions (liste des transactions)
 */
public non-sealed class Compte extends Possession{
    private String id;
    private LocalDate dateOuverture;

    public Compte(Utilisateur utilisateur, ValeurMonetaire valeur, String id, LocalDate dateOuverture) {
        super(utilisateur, valeur);
        this.id = id;
        this.dateOuverture = dateOuverture;
    }

    public Compte() {
    }

    public String getId() {
        return id;
    }
}

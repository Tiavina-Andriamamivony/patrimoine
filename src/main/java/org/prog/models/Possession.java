package org.prog.models;

/**
 * @Description Une possession est une chose que l'on possède logique. Et une possession a une valeur et un nom(?)
 * @Source page 2 ligne 14-23
 */
public sealed class  Possession permits ArgentEspece,Compte, Objet {
    private Utilisateur utilisateur;

    /*
    Composition de montant : Un double qui représentera son prix
             Et de devise  : Euro , Arirary, dollar etc
     */

    private ValeurMonetaire valeur;

    public Possession(Utilisateur utilisateur, ValeurMonetaire valeur) {
        this.utilisateur = utilisateur;
        this.valeur = valeur;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public ValeurMonetaire getValeurs() {
        return valeur;
    }

    public void setValeurs(ValeurMonetaire valeur) {
        this.valeur = valeur;
    }

    public Possession() {
    }
}

package org.prog.models;

import java.time.LocalDate;

public non-sealed class Objet extends Possession{
    private String nom;
    private Double tauxAmmortissement;
    private LocalDate dateAchat;

    public Objet(Utilisateur utilisateur, ValeurMonetaire valeur, String nom, Double tauxAmmortissement, LocalDate dateAchat) {
        super(utilisateur, valeur);
        this.nom = nom;
        this.tauxAmmortissement = tauxAmmortissement;
        this.dateAchat = dateAchat;
    }

    public Objet(String nom, Double tauxAmmortissement, LocalDate dateAchat) {
        this.nom = nom;
        this.tauxAmmortissement = tauxAmmortissement;
        this.dateAchat = dateAchat;
    }

    public Objet() {
    }


    public Double ValeurADateDe(LocalDate dateVise) {
        int differenceYear = dateVise.getYear() - dateAchat.getYear();
        if (differenceYear < 0) return 0.0;
        Double result = this.getValeurs().getValeur();

        for(int i = 0; i < differenceYear; i++){
            result = result -(result*(tauxAmmortissement))/100;
        }
        return result;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getTauxAmmortissement() {
        return tauxAmmortissement;
    }

    public void setTauxAmmortissement(Double tauxAmmortissement) {
        this.tauxAmmortissement = tauxAmmortissement;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    @Override
    public String toString() {
        return "Objet{" +
                "nom='" + nom + '\'' +
                ", tauxAmmortissement=" + tauxAmmortissement +
                ", dateAchat=" + dateAchat +
                '}';
    }
}

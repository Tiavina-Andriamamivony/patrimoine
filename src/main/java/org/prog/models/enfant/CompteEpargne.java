package org.prog.models.enfant;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CompteEpargne extends Compte{
    private Double tauxInteret;

    //Création de la fonction de calcul de la valeur futur

    public Double ValeurDuCompteAUneDate(LocalDate dateFutur){
        int differenceAnnee = dateFutur.getYear() - this.getDateOuverture().getYear();
        if (differenceAnnee == 0){
            return this.getValeurMonetaire().getMontant();
        } else if (differenceAnnee < 0) {
            throw new UnsupportedOperationException("La date futur devrais être superieur à la date de création du compte");
        }
        Double tauxIncrementtationTotal = tauxInteret*differenceAnnee;
        /*
        10000
         */
        return this.getValeurMonetaire().getMontant() + ((this.getValeurMonetaire().getMontant() * tauxIncrementtationTotal)/100);
    }

}

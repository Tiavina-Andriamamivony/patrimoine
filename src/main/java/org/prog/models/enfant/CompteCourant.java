package org.prog.models.enfant;

import lombok.*;
import org.prog.models.ValeurMonetaire;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CompteCourant extends Compte{
    private List<Revenu> revenus;

    // Projection futur

    public Double projectionFutur(LocalDate dateFuture) {
        int differenceAnnee = dateFuture.getYear()-this.getDateOuverture().getYear();
        int differenceMois = dateFuture.getMonthValue()-this.getDateOuverture().getMonthValue();

        Double valeurMonetaireDuCompte = this.getValeurMonetaire().getMontant();

        for(Revenu revenu : this.getRevenus()){
            switch (revenu.getFrequence()){
                case MENSUEL -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getMontant() * (((differenceAnnee)*12) + differenceMois);
                case ANNUEL -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getMontant() * differenceAnnee;
                case HEBDOMADAIRE -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getMontant() * ((((differenceAnnee)*12) + differenceMois)*4);
                case IMMEDIAT -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getMontant();
                case JOURNALIER -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getMontant() * (((((differenceAnnee)*12) + differenceMois)*4)*7);
                default -> throw new IllegalStateException("Unexpected value: " + revenu.getFrequence());
            }
            this.setValeurMonetaire(new ValeurMonetaire(valeurMonetaireDuCompte,this.getValeurMonetaire().getDevise()));
        }
        return valeurMonetaireDuCompte;

    }
}

package org.prog.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description Un compte courant est un type de compte qui accepte un montant de découverte où le solde peut être négatif
 */
public class CompteCourant extends Compte {
    private List<Revenu> revenu; //Ou salaire si vous voulez

    public CompteCourant(Utilisateur utilisateur, ValeurMonetaire valeur, String id, LocalDate dateOuverture, List<Revenu> revenu) {
        super(utilisateur, valeur, id, dateOuverture);
        this.revenu = revenu;
    }

    public CompteCourant(List<Revenu> revenu) {

    }

    public List<Revenu> getRevenu() {
        return revenu;
    }

    public void setRevenu(List<Revenu> revenu) {
        this.revenu = revenu;
    }

    private void ajoutDeSalaireToutLesMois(){
        int differenceAnnee = LocalDate.now().getYear()-this.getDateOuverture().getYear();
        int differenceMois = LocalDate.now().getMonthValue()-this.getDateOuverture().getMonthValue();

        Double valeurMonetaireDuCompte = this.getValeurs().getValeur();

        for(Revenu revenu : this.getRevenu()){
            switch (revenu.getFrequence()){
                case MENSUEL -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getValeur() * (((differenceAnnee)*12) + differenceMois);
                case ANNUEL -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getValeur() * differenceAnnee;
                case HEBDOMADAIRE -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getValeur() * ((((differenceAnnee)*12) + differenceMois)*4);
                case IMPREVUE -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getValeur();
                case JOURNALIER -> valeurMonetaireDuCompte += revenu.getValeurMonetaire().getValeur() * (((((differenceAnnee)*12) + differenceMois)*4)*7);
                default -> throw new IllegalStateException("Unexpected value: " + revenu.getFrequence());
            }
            this.setValeurs(new ValeurMonetaire(valeurMonetaireDuCompte,this.getValeurs().getDevise()));
        }

    }

    public static void main(String[] args) {
        var revenues = new ArrayList<Revenu>();
        revenues.add(new Revenu(Frequence.IMPREVUE,new ValeurMonetaire(200_000.00,Devise.ARIARY)));
        var compteCourant = new CompteCourant(
                new Utilisateur("ANDRIA",
                        "Tiavina",
                        LocalDate.of(2024,1,1)),
                new ValeurMonetaire(1_000_000d,Devise.ARIARY),
                "1",
                LocalDate.of(2024,1,1),
                revenues
        );
        System.out.println(compteCourant.getValeurs().toString());
        compteCourant.ajoutDeSalaireToutLesMois();
        System.out.println(compteCourant.getValeurs().toString());

    }
}

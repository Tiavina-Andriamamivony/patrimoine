package org.prog.models;

/**
 * @Description Composition de montant : Un double qui représentera son prix
 *              Et de devise  : Euro , Arirary, dollar etc
 */
public class ValeurMonetaire {
    private Double valeur;
    private Devise devise;

    @Override
    public String toString() {
        return "ValeurMonetaire{" +
                "valeur=" + valeur +
                ", devise=" + devise +
                '}';
    }

    public Double TransitionMonetaire(Devise deviseVise) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ValeurMonetaire(Double valeur, Devise devise) {
        this.valeur = valeur;
        this.devise = devise;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }
}

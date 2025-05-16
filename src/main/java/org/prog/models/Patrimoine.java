package org.prog.models;

import java.util.List;

/**
 * @Description
 * Un patrimoine appartient à une personne
 * Un patrimoine est  composé des possessions
 *
 * @Source pagte 2 ligne 12-13
 */
public class Patrimoine {
    private  Utilisateur utilisateur;
    private List<Possession> possessions;
}

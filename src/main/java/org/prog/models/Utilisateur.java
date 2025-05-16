package org.prog.models;

import java.time.LocalDate;

/**
 *
 * @param nom Le nom de l'utilisateur
 * @param prenom Son prénom
 * @param dateDInscription La date d'inscription et donc la date de début de la prise de possessions
 */
public record Utilisateur(String nom, String prenom, LocalDate dateDInscription) {

}

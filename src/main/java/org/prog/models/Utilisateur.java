package org.prog.models;

import java.time.LocalDate;

public record Utilisateur(String prenom, String nom, LocalDate dateInscription,Patrimoine patrimoine) {
}

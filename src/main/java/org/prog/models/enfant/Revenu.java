package org.prog.models.enfant;

import lombok.*;
import org.prog.models.ValeurMonetaire;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Revenu {
    private Frequence frequence;
    private ValeurMonetaire valeurMonetaire;
    private String nom;
    private String description;
}

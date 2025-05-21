package org.prog.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class ValeurMonetaire {
    private Double montant;
    private Devise devise;
}

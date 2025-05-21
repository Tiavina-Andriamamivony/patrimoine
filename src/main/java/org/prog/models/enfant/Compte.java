package org.prog.models.enfant;

import lombok.*;
import org.prog.models.Possession;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Compte extends Possession {
    private LocalDateTime dateOuverture;
}

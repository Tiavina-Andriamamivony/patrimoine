import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.prog.models.Devise;
import org.prog.models.Objet;
import org.prog.models.Utilisateur;
import org.prog.models.ValeurMonetaire;

import java.time.LocalDate;

public class ObjetTest {
    @Test
    public void CalculeTest(){
       ValeurMonetaire vm= new ValeurMonetaire(2_000_000.00, Devise.ARIARY);


        Objet ordinateur = new Objet(
                new Utilisateur("Reus",
                        "Ilo",
                        LocalDate.of(2024,1,1)),
                vm,
                "ordinateur",
                10.0,
                LocalDate.of(2024,1,1)
        );


        Assertions.assertEquals(1_800_000.00,ordinateur.ValeurADateDe(LocalDate.of(2025,1,1)));
        Assertions.assertEquals(1_620_000.00,ordinateur.ValeurADateDe(LocalDate.of(2026,1,1)));

    }
}

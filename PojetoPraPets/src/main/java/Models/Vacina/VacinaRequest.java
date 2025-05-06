package Models.Vacina;

import Models.PetRequest.Pet;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.ArrayList;
public record VacinaRequest (
                 @NotBlank(message = "O campo não pode ser nulo.")
                 String nome,
                 @NotBlank(message = "O campo não pode ser nulo.")
                 LocalDate data,
                 @NotBlank(message = "O campo não pode ser nulo.")
                 String tipo
){
    public Vacina toVacina(){
        return new Vacina(null, nome(), data(), tipo());
    }

}

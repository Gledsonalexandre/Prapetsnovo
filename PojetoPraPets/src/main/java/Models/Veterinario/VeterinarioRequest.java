package Models.Veterinario;
import Models.PetRequest.Pet;
import jakarta.validation.constraints.NotBlank;

public record VeterinarioRequest (
                    @NotBlank(message = "O campo não pode ser nulo.")
                    String nome,
                    @NotBlank(message = "O campo não pode ser nulo.")
                    String endereco,
                    @NotBlank(message = "O campo não pode ser nulo.")
                    String telefone
){
    public Veterinario toVeterinario(){
        return new Pet(null, nome(), endereco(), telefone());
    }

}

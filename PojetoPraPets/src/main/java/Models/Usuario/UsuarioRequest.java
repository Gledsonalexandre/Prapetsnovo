package Models.Usuario;
import jakarta.validation.constraints.NotBlank;

public record UsuarioRequest (
        @NotBlank(message = "")
        String nome,
        @NotBlank(message = "")
        String senha,
        @NotBlank(message = "")
        String email
){
    public Usuario toUsuario(){
        return new Usuario(null, nome(), senha(), email());
    }

}
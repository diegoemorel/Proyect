
package com.DiegoMorel.Porfolio.Security.Dto;

//import jakarta.validation.constraints.NotBlank;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUsuario {
    @NotBlank
    private String nombreUsuario;
    @NotBlank
    private String password;
}

package ElBuenSabor.ProyectoFinal.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRegistroDTO {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String password;
    private String confirmPassword;
    private String calle;
    private Integer numero;
    private Integer cp;
    private String nombreLocalidad;
    private String nombreProvincia;
    private String nombrePais;
    private java.time.LocalDate fechaNacimiento;
}
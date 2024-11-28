package com.tarea.crud.Domain.DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteDto {
    private Long ID;
    private String nombre;
    private Date fechaNac;
    private int edad;
    private String diagnostico;
    private String telefono;
    private String email;

}

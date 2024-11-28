package com.tarea.crud.Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicamentosDto {
    private Long Id;
    private String nombre;
    private String descripcion;
}

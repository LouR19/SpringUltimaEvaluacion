package com.tarea.crud.Domain.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitasDto {
    private Long id;
    private LocalDate fecha;
    private LocalTime hora;
    private String descripcion;

}

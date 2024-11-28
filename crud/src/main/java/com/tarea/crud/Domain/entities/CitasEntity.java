package com.tarea.crud.Domain.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "Citas")
public class CitasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "citas_id_seq")
    private Long id;
    private LocalDate fecha;
    private LocalTime hora;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "pacientes_id")
    private PacienteEntity paciente;

}

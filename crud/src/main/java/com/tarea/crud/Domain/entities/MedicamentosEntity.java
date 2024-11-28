package com.tarea.crud.Domain.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name= "Medicamentos")
public class MedicamentosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicamentos_id_seq")
    private Long id;
    private String nombre;
    private String descripcion;

    @ManyToMany(mappedBy = "medicamentos")
    private Set<PacienteEntity> paciente;
}

package com.tarea.crud.Domain.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name= "Pacientes")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pacientes_id_seq")
    private Long id;
    private String nombre;
    private int edad;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fechaNac;
    private String diagnostico;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CitasEntity> citas = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "Pacientes_Medicamentos",
        joinColumns = @JoinColumn(name = "pacientes_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "medicamentos_id", referencedColumnName = "id")
    )
    private Set<MedicamentosEntity> medicamentos = new HashSet<>();
}

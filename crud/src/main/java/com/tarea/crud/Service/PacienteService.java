package com.tarea.crud.Service;

import com.tarea.crud.Domain.entities.PacienteEntity;

import java.util.List;

public interface PacienteService {
    PacienteEntity createPaciente(PacienteEntity pacienteEntity);
    List<PacienteEntity> getAllPacientes();
    PacienteEntity getPacienteById(Long ID);
    PacienteEntity updatePaciente(Long id, PacienteEntity pacienteEntity);
    void deletePaciente(Long id);
}

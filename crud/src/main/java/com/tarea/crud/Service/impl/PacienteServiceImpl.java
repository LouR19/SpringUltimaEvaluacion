package com.tarea.crud.Service.impl;
import com.tarea.crud.Domain.entities.PacienteEntity;
import com.tarea.crud.Repository.PacientesRepository;
import com.tarea.crud.Service.PacienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {
    private final PacientesRepository pacienteRepository;

    public PacienteServiceImpl(PacientesRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public PacienteEntity createPaciente(PacienteEntity pacienteEntity) {
        return pacienteRepository.save(pacienteEntity);
    }

    @Override
    public List<PacienteEntity> getAllPacientes() {
        return (List<PacienteEntity>) pacienteRepository.findAll();
    }

    @Override
    public PacienteEntity getPacienteById(Long id) {
        return pacienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
    }

    @Override
    public PacienteEntity updatePaciente(Long id, PacienteEntity pacienteEntity) {
        PacienteEntity existingPaciente = getPacienteById(id);
        existingPaciente.setNombre(pacienteEntity.getNombre());
        existingPaciente.setFechaNac(pacienteEntity.getFechaNac());
        existingPaciente.setEdad(pacienteEntity.getEdad());
        existingPaciente.setDiagnostico(pacienteEntity.getDiagnostico());
        existingPaciente.setTelefono(pacienteEntity.getTelefono());
        existingPaciente.setEmail(pacienteEntity.getEmail());
        return pacienteRepository.save(existingPaciente);
    }

    @Override
    public void deletePaciente(Long id) {
        pacienteRepository.deleteById(id);
    }

}
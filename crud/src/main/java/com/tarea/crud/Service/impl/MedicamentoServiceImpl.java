package com.tarea.crud.Service.impl;

import com.tarea.crud.Domain.entities.MedicamentosEntity;
import com.tarea.crud.Repository.MedicamentosRepository;
import com.tarea.crud.Service.MedicamentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
    private final MedicamentosRepository medicamentosRepository;

    public MedicamentoServiceImpl(MedicamentosRepository medicamentosRepository) {
        this.medicamentosRepository = medicamentosRepository;
    }
    public MedicamentosEntity createMedicamento(MedicamentosEntity medicamento) {
        return medicamentosRepository.save(medicamento);
    }

    public List<MedicamentosEntity> getAllMedicamentos() {
        return (List<MedicamentosEntity>) medicamentosRepository.findAll();
    }

    public MedicamentosEntity getMedicamentoById(Long id) {
        return medicamentosRepository.findById(id).orElseThrow(() -> new RuntimeException("Medicamento no encontrado"));
    }

    public MedicamentosEntity updateMedicamento(Long id, MedicamentosEntity medicamento) {
        MedicamentosEntity existingMedicamento = getMedicamentoById(id);
        existingMedicamento.setNombre(medicamento.getNombre());
        existingMedicamento.setDescripcion(medicamento.getDescripcion());
        return medicamentosRepository.save(existingMedicamento);
    }

    public void deleteMedicamento(Long id) {
        medicamentosRepository.deleteById(id);
    }
}

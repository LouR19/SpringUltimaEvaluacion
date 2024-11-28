package com.tarea.crud.Service;

import com.tarea.crud.Domain.entities.MedicamentosEntity;

import java.util.List;

public interface MedicamentoService {
    MedicamentosEntity createMedicamento(MedicamentosEntity medicamento);
    List<MedicamentosEntity> getAllMedicamentos();
    MedicamentosEntity getMedicamentoById(Long id);
    MedicamentosEntity updateMedicamento(Long id, MedicamentosEntity medicamento);
    void deleteMedicamento(Long id);
}

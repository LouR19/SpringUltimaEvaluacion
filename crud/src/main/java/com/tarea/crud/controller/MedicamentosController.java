package com.tarea.crud.controller;

import com.tarea.crud.Domain.entities.MedicamentosEntity;
import com.tarea.crud.Service.impl.MedicamentoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentosController {

    private final MedicamentoServiceImpl medicamentoServiceImpl;

    @Autowired
    public MedicamentosController(MedicamentoServiceImpl medicamentoServiceImpl) {
        this.medicamentoServiceImpl = medicamentoServiceImpl;
    }

    @PostMapping
    public ResponseEntity<MedicamentosEntity> createMedicamento(@RequestBody MedicamentosEntity medicamento) {
        MedicamentosEntity createdMedicamento = medicamentoServiceImpl.createMedicamento(medicamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMedicamento);
    }

    @GetMapping
    public ResponseEntity<List<MedicamentosEntity>> getAllMedicamentos() {
        List<MedicamentosEntity> medicamentos = medicamentoServiceImpl.getAllMedicamentos();
        return ResponseEntity.ok(medicamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicamentosEntity> getMedicamentoById(@PathVariable Long id) {
        MedicamentosEntity medicamento = medicamentoServiceImpl.getMedicamentoById(id);
        return ResponseEntity.ok(medicamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicamentosEntity> updateMedicamento(@PathVariable Long id, @RequestBody MedicamentosEntity medicamento) {
        MedicamentosEntity updatedMedicamento = medicamentoServiceImpl.updateMedicamento(id, medicamento);
        return ResponseEntity.ok(updatedMedicamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicamento(@PathVariable Long id) {
        medicamentoServiceImpl.deleteMedicamento(id);
        return ResponseEntity.noContent().build();
    }
}
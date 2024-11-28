package com.tarea.crud.controller;
import com.tarea.crud.Domain.DTO.PacienteDto;
import com.tarea.crud.Domain.entities.MedicamentosEntity;
import com.tarea.crud.Domain.entities.PacienteEntity;
import com.tarea.crud.Mappers.Impl.PacienteMapper;
import com.tarea.crud.Service.impl.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteServiceImpl pacienteServiceImpl;
    private final PacienteMapper pacienteMapper;

    @Autowired
    public PacienteController(PacienteServiceImpl pacienteServiceImpl, PacienteMapper pacienteMapper) {
        this.pacienteServiceImpl= pacienteServiceImpl;
        this.pacienteMapper = pacienteMapper;
    }

    @PostMapping
    public PacienteDto createPaciente (@RequestBody PacienteDto productDto) {
        PacienteEntity pacienteEntity = pacienteMapper.mapFrom(productDto);
        PacienteEntity createdPacienteEntity = pacienteServiceImpl.createPaciente(pacienteEntity);
        return pacienteMapper.mapTo(createdPacienteEntity);
    }
    @GetMapping
    public ResponseEntity<List<PacienteDto>> getAllPacientes() {
        List<PacienteEntity> pacientes = pacienteServiceImpl.getAllPacientes();
        List<PacienteDto> pacientesDto = pacientes.stream()
                .map(pacienteMapper::mapTo)
                .collect(Collectors.toList());
        return ResponseEntity.ok(pacientesDto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PacienteDto> getPacienteById(@PathVariable Long id) {
        PacienteEntity pacienteEntity = pacienteServiceImpl.getPacienteById(id);
        return ResponseEntity.ok(pacienteMapper.mapTo(pacienteEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteDto> updatePaciente(@PathVariable Long id, @RequestBody PacienteDto pacienteDto) {
        PacienteEntity pacienteEntity = pacienteMapper.mapFrom(pacienteDto);
        PacienteEntity updatedPacienteEntity = pacienteServiceImpl.updatePaciente(id, pacienteEntity);
        return ResponseEntity.ok(pacienteMapper.mapTo(updatedPacienteEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaciente(@PathVariable Long id) {
        pacienteServiceImpl.deletePaciente(id);
        return ResponseEntity.noContent().build();
    }
}

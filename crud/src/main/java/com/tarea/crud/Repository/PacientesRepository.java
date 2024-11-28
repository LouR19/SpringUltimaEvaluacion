package com.tarea.crud.Repository;

import com.tarea.crud.Domain.entities.PacienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends CrudRepository<PacienteEntity, Long> {
}
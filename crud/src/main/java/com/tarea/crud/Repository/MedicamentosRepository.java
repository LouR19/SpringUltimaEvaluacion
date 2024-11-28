package com.tarea.crud.Repository;

import com.tarea.crud.Domain.entities.MedicamentosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentosRepository extends CrudRepository<MedicamentosEntity, Long> {
}

package com.tarea.crud.Repository;

import com.tarea.crud.Domain.entities.CitasEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CitasRepository extends CrudRepository<CitasEntity, Long> {
}
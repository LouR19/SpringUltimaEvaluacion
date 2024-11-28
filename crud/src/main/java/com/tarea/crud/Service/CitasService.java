package com.tarea.crud.Service;

import com.tarea.crud.Domain.entities.CitasEntity;
import com.tarea.crud.controller.CitasController;

import java.util.Arrays;
import java.util.List;

public interface CitasService {
    CitasEntity createCitas(CitasEntity citasEntity);
    List<CitasEntity> getAllCitas();
    CitasEntity getCitaById(Long id);
    CitasEntity updateCitas(Long id, CitasEntity citasEntity);
    void deleteCitas(Long id);
}

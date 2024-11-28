package com.tarea.crud.controller;
import com.tarea.crud.Domain.DTO.CitasDto;
import com.tarea.crud.Domain.entities.CitasEntity;
import com.tarea.crud.Mappers.Impl.CitasMapper;
import com.tarea.crud.Service.impl.CitasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitasController {
    private final CitasServiceImpl citasService;
    private final CitasMapper citasMapper;
    @Autowired
    public CitasController(CitasServiceImpl citasService, CitasMapper citasMapper) {
        this.citasService = citasService;
        this.citasMapper = citasMapper;
    }

//    @GetMapping
//    public CitasDto retrieveCitas() {
//        return new CitasDto();
//    }

    @PostMapping
    public CitasDto createCitas(@RequestBody final CitasDto citasDto){
        CitasEntity citasEntity = citasMapper.mapFrom(citasDto);
        CitasEntity createdCitas = citasService.createCitas(citasEntity);
        return citasMapper.mapTo(createdCitas);
    }
    @GetMapping
    public ResponseEntity<List<CitasEntity>> getAllCitas() {
        List<CitasEntity> citas= citasService.getAllCitas();
        return ResponseEntity.ok(citas);
    }
}

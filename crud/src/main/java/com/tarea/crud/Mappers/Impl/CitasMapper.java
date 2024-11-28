package com.tarea.crud.Mappers.Impl;
import com.tarea.crud.Domain.DTO.CitasDto;
import com.tarea.crud.Domain.entities.CitasEntity;
import com.tarea.crud.Mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CitasMapper implements Mapper<CitasEntity, CitasDto> {
    private final ModelMapper modelMapper;

    public CitasMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CitasDto mapTo(CitasEntity citasEntity) {
        return modelMapper.map(citasEntity, CitasDto.class);
    }

    @Override
    public CitasEntity mapFrom(CitasDto citasDto) {
        return modelMapper.map(citasDto, CitasEntity.class);
    }
}

package com.tarea.crud.Mappers.Impl;
import com.tarea.crud.Mappers.Mapper;
import org.modelmapper.ModelMapper;
import com.tarea.crud.Domain.DTO.PacienteDto;
import com.tarea.crud.Domain.entities.PacienteEntity;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper implements Mapper<PacienteEntity, PacienteDto> {
    private final ModelMapper modelMapper;

    public PacienteMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public PacienteDto mapTo(PacienteEntity pacienteEntity) {
        return modelMapper.map(pacienteEntity, PacienteDto.class);
    }

    @Override
    public PacienteEntity mapFrom(PacienteDto pacienteDto) {
        return modelMapper.map(pacienteDto, PacienteEntity.class);
    }

}

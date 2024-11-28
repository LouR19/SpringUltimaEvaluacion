package com.tarea.crud.Mappers.Impl;
import com.tarea.crud.Domain.DTO.MedicamentosDto;
import com.tarea.crud.Domain.entities.MedicamentosEntity;
import com.tarea.crud.Mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MedicamentosMapper implements Mapper<MedicamentosEntity, MedicamentosDto> {
    private final ModelMapper modelMapper;

    public MedicamentosMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public MedicamentosDto mapTo(MedicamentosEntity medicamentosEntity) {
        return modelMapper.map(medicamentosEntity, MedicamentosDto.class);
    }

    @Override
    public MedicamentosEntity mapFrom(MedicamentosDto medicamentosDto) {
        return modelMapper.map(medicamentosDto, MedicamentosEntity.class);
    }
}
